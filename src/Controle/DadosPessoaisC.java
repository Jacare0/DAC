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
    private Database dao = new Database();
    private EnderecoC EC1 = new EnderecoC();
    
 /**
     * Função para conectar no banco de dados, verificar se já tem cadastro da pessoa,
     * se não encontrar, cadastra os dados pessoais
     * e desconectar após o cadastro.
     * @author Arthur Fernandes Castanheira
     * @since 04/06/2025
     * @version v1
     * @param obj obj do tipo DadosPessoaisM
     */
    public int CadastraDadosPessoais(DadosPessoaisM obj) {
        try{
            
            int idEndereco = EC1.CadastraEndereco(obj.getEndereco());
            
            if (idEndereco == -1) {
                System.err.println("Não foi possível obter o ID do endereço. Cadastro de dados pessoais abortado.");
                return -1;
            }
            
            dao.conexao();
            
            String VerificaSQL = "SELECT * FROM DadosPessoais WHERE cpf ='" + obj.getCPF() + "';";
            
            Resultado = dao.getStatement().executeQuery(VerificaSQL);

            if(!Resultado.next()){ 
                String SQL = "INSERT INTO DadosPessoais  VALUES (" + obj.getIdDadosPessoais() +",'" + obj.getNome() + "','" + obj.getCPF() + "'," + obj.getIdade() + ",'" 
                              + obj.getSexo() + "','" + obj.getDataNascimento() + "','" + obj.getTelefone() + "','" + obj.getEmail()
                              + "');";
                System.out.println("Dados pessoais cadastrados com sucesso.");
                
                return obj.getIdDadosPessoais();
            } else{
                System.out.println("Dados pessoais já cadastrados para este CPF.");
                return Resultado.getInt(1);
            }
        } catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro ao cadastrar dados pessoais: " + e.getMessage());
        } 
        
        return -1;
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
            dao.desconecta();
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
            dao.desconecta();
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
            dao.conexao();
            String SQL = "SELECT idEndereco FROM DadosPessoais WHERE cpf = "+CPF+";";
            Resultado = dao.getStatement().executeQuery(SQL);
            
            int idEndereco = Resultado.getInt(0);
            
            SQL = "DELETE FROM dadospessoais WHERE cpf = '"+CPF+"'";
            dao.getStatement().execute(SQL);
            
            System.out.println("Dados pessoais deletados para o CPF: " + CPF);
            
            SQL = "SELECT * FROM DADOSPESSOAIS WHERE idEndereco = " + idEndereco + ";";
            Resultado = dao.getStatement().executeQuery(SQL);
            if(!Resultado.next()){
                SQL = "SELECT numCasa, CEP FROM ENDERECO WHERE idEndereco =" + idEndereco + ";";
                Resultado = dao.getStatement().executeQuery(SQL);
                EC1.DeletaEndereco(Resultado.getInt("numCasa"), Resultado.getString("CEP"));
            }
            
            dao.desconecta();
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