package Controle;
import Modelo.EnderecoM;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Esta Classe serve para conter os metodos basicos para integrar o endereço com
 * o Banco de dados, sendo as funções Insert, Update, Delete e Select.
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 02/06/2025
 */

public class EnderecoC {
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();

     /**
     * Função que acessa o banco de dados após receber um Endereço como
     * parametro onde irá inserir na tabela endereço do banco de dados.
     * Agora retorna o ID gerado do endereço ou -1 se já existir ou erro.
     * @author Arthur Fernandes Castanheira
     * @version v1
     * @since 02/06/2025
     * @param obj - Objeto do tipo EnderecoM contendo os dados do
     * endereço que sera inserido.
     * @return O ID (int) gerado para o endereço, ou o ID existente, ou -1 em caso de erro/já cadastrado.
     */
    public int CadastraEndereco(EnderecoM obj) {
        int idEnderecoGerado = -1; // Valor padrão para indicar falha ou não encontrado
        PreparedStatement pstmt = null; // Usaremos PreparedStatement para retornar as chaves geradas
        ResultSet rs = null;

        try{
            dao.conexao();
            // Verifica se o endereço já existe (com base em CEP e numero)
            String verificaSQL = "SELECT id_endereco FROM endereco WHERE CEP = ? AND numero = ?"; // Adicionei id_endereco aqui
            pstmt = dao.getConnection().prepareStatement(verificaSQL);
            pstmt.setString(1, obj.getCEP());
            pstmt.setInt(2, obj.getNumCasa());
            rs = pstmt.executeQuery();

            if(rs.next()){ // Se encontrou resultados, o endereço já existe
                idEnderecoGerado = rs.getInt("id_endereco"); // Recupera o ID existente
                System.out.println("Endereço já cadastrado. ID existente: " + idEnderecoGerado);
                // Pode ser útil também atualizar o objeto obj com o id existente
                // if (obj.getIdEndereco() == 0) obj.setIdEndereco(idEnderecoGerado); // Se você adicionar um campo idEndereco no modelo
            } else { // Se não encontrou resultados, o endereço não existe, então insere
                String SQL_INSERT = "INSERT INTO ENDERECO (rua, numero, bairro, CEP, cidade, estado) VALUES(?, ?, ?, ?, ?, ?)";
                // Adicionamos Statement.RETURN_GENERATED_KEYS para solicitar o ID gerado
                pstmt = dao.getConnection().prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);
                pstmt.setString(1, obj.getRua());
                pstmt.setInt(2, obj.getNumCasa());
                pstmt.setString(3, obj.getBairro());
                pstmt.setString(4, obj.getCEP());
                pstmt.setString(5, obj.getCidade());
                pstmt.setString(6, obj.getEstado());

                int rowsAffected = pstmt.executeUpdate();

                if(rowsAffected > 0){
                    rs = pstmt.getGeneratedKeys(); // Recupera o ResultSet com as chaves geradas
                    if(rs.next()){
                        idEnderecoGerado = rs.getInt(1); // O primeiro (e único) ID gerado
                        System.out.println("Endereço cadastrado com sucesso. ID gerado: " + idEnderecoGerado);
                        // Você pode definir o ID no seu objeto modelo se ele tiver um campo para isso
                        // obj.setIdEndereco(idEnderecoGerado);
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            System.err.println("Erro ao cadastrar endereço: " + e.getMessage());
            idEnderecoGerado = -1; // Indica erro
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                dao.desconecta(); // Desconectar sempre no finally
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return idEnderecoGerado;
    }
    /**
     * Função para conectar com o banco de dados e fazer uma pesquisa
     * de tudo da tabela endereço e desconectar do banco de dados após
     * a pesquisa.
     * @author Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaEnderecos(){ // Renomeado para plural para clareza
        try{
            dao.conexao();
            String SQL = "SELECT * FROM endereco";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
                                // Ou buscar todos os dados em uma lista antes de desconectar
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }

    /**
     * Função para acessar o banco de dados e deletar um endereço
     * a partir de dois parametros(Numero da casa e CEP) e depois
     * desconectar do banco de dados.
     * @author Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param NumCasa Numero da casa(int)
     * @param CEP CEP(String)
     */
    public void DeletaEndereco(int NumCasa, String CEP){
        try{
            dao.conexao();
            String SQL = "DELETE FROM endereco WHERE numero = "+NumCasa+" AND CEP = '"+CEP+"'";
            dao.getStatement().execute(SQL);
            dao.desconecta();

        }catch(Exception erro){
            erro.printStackTrace();
        }

    }

    /**
     * Função para acessar e atualizar a tabela de endereço no banco de dados
     * onde tem como parametros principais para achar a tabela o numero e cep
     * do endereço, depois de atualizado desconecta do banco de dados
     * @author Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param NumCasa tipo int
     * @param CEP   tipo String
     * @param ruaNova tipo String
     * @param NumNovo tipo int
     * @param BairroNovo tipo String
     * @param CEPnovo tipo String
     * @param CidadeNova tipo String
     * @param EstadoNovo  tipo String
     */
    public void AtualizaEndereco(int NumCasa,String CEP, String ruaNova,int NumNovo, String BairroNovo, String CEPnovo, String CidadeNova, String EstadoNovo){ // Renomeado para clareza
        try{
            dao.conexao();
            String SQL = "UPDATE endereco SET rua='"+ruaNova+"', numero ="+NumNovo+", bairro ='"+BairroNovo+"', CEP = '"+CEPnovo+"', cidade = '"+CidadeNova+"', estado = '"+EstadoNovo+"' WHERE numero ="+NumCasa+" AND CEP = '"+CEP+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

    /**
     * Função de busca de endereço com parametro de cep e num de casa.
     * @author Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param cep tipo String
     * @param numCasa tipo int
     * @return Um Resultado que é do tipo ResultSet onde trás a pesquisa feita
     */
    public ResultSet BuscaEndereco(String cep, int numCasa) {
        try {
            dao.conexao();
            String SQL = "SELECT * FROM endereco WHERE cep ='"+cep+"' AND numero ="+numCasa+""; // Corrigido nome da coluna para 'numero'
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resultado;
    }
}