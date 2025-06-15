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
        try{
            dao.conexao();
            
            // Verifica se o endereço já existe (com base em CEP e numero)
            String verificaSQL = "SELECT * FROM endereco WHERE cep ='" + obj.getCEP() + 
                                                                        "'  AND numero =" 
                                                                        + obj.getNumCasa() + ";";
            Resultado = dao.getStatement().executeQuery(verificaSQL);
            if(Resultado.next()){ 
                System.out.println("Endereço já existente");
                dao.desconecta();
                return Resultado.getInt(1);
            } else { 
                String SQL = "INSERT INTO ENDERECO VALUES ("  + obj.getIdEndereco() + ",'"
                                                              + obj.getRua() + "',"
                                                              + obj.getNumCasa() + ",'"
                                                              + obj.getBairro() + "','"
                                                              + obj.getCEP() + "','"
                                                              + obj.getCidade() + "','"
                                                              + obj.getEstado() + "');";
                dao.getStatement().execute(SQL);
                dao.desconecta();
                return obj.getIdEndereco();
                    }
            } catch(Exception e){
                e.printStackTrace();
                System.err.println("Erro ao cadastrar endereço: " + e.getMessage());
            }
        return -1;
    }
    
     /**
     * Função de busca de endereço com parametro de cep e num de casa.
     * @author Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param CEP tipo String
     * @param numCasa tipo int
     * @return Um Resultado que é do tipo ResultSet onde trás a pesquisa feita
     */
    public ResultSet BuscaEndereco(String CEP, int numCasa) {
        try {
            dao.conexao();
            String SQL = "SELECT * FROM endereco WHERE CEP ='" + CEP + 
                                              "' AND numero =" + numCasa +";";
            
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resultado;
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
    
    public ResultSet BuscaEnderecos(){
        try{
            dao.conexao();
            String SQL = "SELECT * FROM endereco";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
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
            String SQL = "UPDATE endereco SET rua='" + ruaNova + "', numero =" + NumNovo + ", bairro ='" + BairroNovo 
                                                     + "', CEP = '" + CEPnovo + "', cidade = '" + CidadeNova 
                                                     + "', estado = '"+ EstadoNovo + "' WHERE numero =" + NumCasa + " AND CEP = '" + CEP + "';";
            dao.getStatement().executeUpdate(SQL); 
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
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
            String SQL = "DELETE FROM endereco WHERE numero = " + NumCasa + " AND CEP = '" + CEP + "';";
            dao.getStatement().execute(SQL);
            dao.desconecta();

        }catch(Exception erro){
            erro.printStackTrace();
        }

    }
}