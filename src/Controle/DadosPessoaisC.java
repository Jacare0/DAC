package Controle;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.DadosPessoaisM;
import Modelo.EnderecoM; 
import java.sql.Statement;
import java.sql.PreparedStatement; 


/**
 * Controlador para acessar o banco de dados e inserir, deletar, atualizar e pesquisar
 * os dados pessoais.
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 03/06/2025
 */
public class DadosPessoaisC{
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    private EnderecoC enderecoControl = new EnderecoC(); // Instância de EnderecoC

 /**
     * Função para conectar no banco de dados, verificar se já tem cadastro da pessoa,
     * se não encontrar, cadastra os dados pessoais
     * e desconectar após o cadastro.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version v1
     * @param obj obj do tipo DadosPessoaisM
     */
    public void CadastraDadosPessoais(DadosPessoaisM obj) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try{
            // Primeiro, tratar a parte do EnderecoM e obter o ID gerado/existente
            int idEndereco = enderecoControl.CadastraEndereco(obj); // Captura o ID do endereço
            
            if (idEndereco == -1) {
                System.err.println("Não foi possível obter o ID do endereço. Cadastro de dados pessoais abortado.");
                return; // Aborta o cadastro de dados pessoais se o endereço não foi inserido/encontrado
            }
            
            // Opcional: Atualizar o ID do endereço no objeto DadosPessoaisM
            // obj.setIdEndereco(idEndereco); // Se DadosPessoaisM tiver um setter para idEndereco herdado ou próprio

            dao.conexao();
            String VerificaSQL = "SELECT * FROM dadospessoais WHERE cpf = ?";
            pstmt = dao.getConnection().prepareStatement(VerificaSQL);
            pstmt.setString(1, obj.getCPF());
            rs = pstmt.executeQuery();

            if(!rs.next()){ // Se não encontrou resultados, os dados pessoais não existem
                String SQL = "INSERT INTO dadospessoais (nome, cpf, idade, sexo, data_nascimento, telefone, email, id_endereco) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                pstmt = dao.getConnection().prepareStatement(SQL);
                pstmt.setString(1, obj.getNome());
                pstmt.setString(2, obj.getCPF());
                pstmt.setInt(3, obj.getIdade());
                pstmt.setString(4, obj.getSexo());
                pstmt.setString(5, obj.getDataNascimento());
                pstmt.setString(6, obj.getTelefone());
                pstmt.setString(7, obj.getEmail());
                pstmt.setInt(8, idEndereco); // Usa o ID do endereço obtido

                pstmt.execute();
                System.out.println("Dados pessoais cadastrados com sucesso.");
            } else{
                System.out.println("Dados pessoais já cadastrados para este CPF.");
            }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Erro ao cadastrar dados pessoais: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                dao.desconecta(); // Desconectar sempre no finally
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * Função para pesquisar e retornar todos os dados pessoais cadastrados.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version v1
     * @return Retorna um Resultado sendo do tipo ResultSet contendo
     * o conteúdo da pesquisa feita.
     */
    public ResultSet BuscaDadosPessoais(){
        try{
            dao.conexao();
            String SQL = "SELECT * FROM dadospessoais";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }


    /**
     * Função que conecta no banco de dados e realiza uma pesquisa com base
     * no parâmetro passado como CPF para uma pesquisa específica.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version v1
     * @param CPF Tipo String
     * @return retorna o resultado sendo um tipo de ResultSet
     */
    public ResultSet BuscaDadosPessoaisPorCPF(String CPF){
        try{
            dao.conexao();
            String SQL = "SELECT * FROM dadospessoais WHERE CPF = '"+CPF+"'";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }


      /**
     * Função para conectar no banco de dados e
     * deletar um dado pessoal utilizando um CPF passado pelo
     * usuário como parâmetro e desconectar do banco após deletar.
     * Esta função também tenta deletar o endereço associado.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version v1
     * @param CPF CPF do tipo String
     */
    public void DeletaDadosPessoais(String CPF){
        try{
            // Antes de deletar os dados pessoais, precisamos do endereço associado a eles.
            // Buscar o endereço associado ao CPF.
            String rua = null;
            int numCasa = 0;
            String cep = null;

            dao.conexao();
            String buscaEnderecoSql = "SELECT rua, numero, cep FROM endereco e JOIN dadospessoais dp ON e.cep = dp.cep AND e.numero = dp.numero WHERE dp.cpf = '"+CPF+"'";
            ResultSet rsEndereco = dao.getStatement().executeQuery(buscaEnderecoSql);

            if(rsEndereco.next()){
                rua = rsEndereco.getString("rua");
                numCasa = rsEndereco.getInt("numero");
                cep = rsEndereco.getString("cep");
            }
            rsEndereco.close();
            dao.desconecta(); // Desconecta após a busca de endereço

            // Primeiro, deleta os dados pessoais
            dao.conexao();
            String SQL_delete_dp = "DELETE FROM dadospessoais WHERE cpf = '"+CPF+"'";
            dao.getStatement().execute(SQL_delete_dp);
            System.out.println("Dados pessoais deletados para o CPF: " + CPF);
            dao.desconecta();

            // Em seguida, tenta deletar o endereço associado
            if (rua != null && cep != null) {
                enderecoControl.DeletaEndereco(numCasa, cep); // Chamar o método correto com numCasa e CEP
                System.out.println("Endereço associado deletado para CEP: " + cep + ", Número: " + numCasa);
            } else {
                System.out.println("Endereço associado não encontrado para o CPF: " + CPF + " ou já foi deletado.");
            }

        }catch(Exception erro){
            erro.printStackTrace();
            System.err.println("Erro ao deletar dados pessoais e seu endereço associado para o CPF: " + CPF);
        }
    }


    /**
     * Função para conectar no banco de dados e atualizar os dados pessoais após o cpf
     * ser passado como parâmetro, atualiza os campos possíveis e depois desconecta do
     * banco de dados.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version 1
     * @param cpf tipo String - passado como parâmetro de busca
     * @param NovoNome tipo String
     * @param NovaIdade tipo Int
     * @param NovoSexo tipo String
     * @param NovoTelefone tipo String
     * @param NovoEmail tipo String
     */
    public void AtualizaDadosPessoais(String cpf, String NovoNome, int NovaIdade, String NovoSexo, String NovoTelefone, String NovoEmail){
        try{
            dao.conexao();
            String SQL = "UPDATE dadospessoais SET nome = '"+NovoNome+"', idade = "+NovaIdade+", sexo = '"+NovoSexo+"', telefone = '"+NovoTelefone+"', email = '"+NovoEmail+"' WHERE CPF = '"+cpf+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
}