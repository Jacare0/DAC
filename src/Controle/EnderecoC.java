
package Controle;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.EnderecoM;
import java.sql.Statement;
/**
 * Esta Classe serve para conter os metodos basicos para integrar o indereco com
 * o Banco de dados, sendo as funçoes Insert, Update, Delete e Select.
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
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 02/06/2025
     * @param obj - Objeto do tipo EnderecoM contendo os dados do
     * endereço que sera inserido.
     */
    public void CadastraEndereco(EnderecoM obj) {
        try{
            dao.conexao();
            String SQL = "insert into ENDERECO values('"+obj.getRua()+"',"+obj.getNumCasa()+",'"+obj.getBairro()+"','"+obj.getCEP()+"', '"+obj.getCidade()+"', '"+obj.getEstado()+"') ";
            dao.getStatement().execute(SQL);
            
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer um pesquisa 
     * de tudo da tabela enredeco e desconectar do banco de dados após 
     * a pesquisa.
     * @autor Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaEndereco(){
        try{
            dao.conexao();
            String SQL = "select * from endereco";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
    
    /**
     * Função para acessar o banco de dados e deletar um endereço
     * a partir de dois parametros(Numero da casa e CEP) e depois
     * desconectar do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param NumCasa Numero da casa(int)
     * @param CEP CEP(String) 
     */
    public void DeletaEndereco(int NumCasa, String CEP){
        try{
            dao.conexao();
            String SQL = "delete from endereco where numero= "+NumCasa+" and CEP = "+CEP+"";
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
     * @autor Arthur Fernandes Castanheira
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
    public void AtualizaValorProduto(int NumCasa,String CEP, String ruaNova,int NumNovo, String BairroNovo, String CEPnovo, String CidadeNova, String EstadoNovo){
        try{
            dao.conexao();
            String SQL = "update endereco set rua="+ruaNova+",numero ="+NumNovo+",bairro ="+BairroNovo+", CEP = "+CEPnovo+", cidade = "+CidadeNova+", estado = "+EstadoNovo+" where numero ="+NumCasa+"and CEP = "+CEP+"";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    /**
     * Função de busca de endereço com parametro de cep e num de casa.
     * @autor Arthur Fernandes Castanheira
     * @since 03/06/2025
     * @version v1
     * @param cep tipo String
     * @param numCasa tipo int
     * @return Um REsultado que é do tipo resultset onde trás a pesquisa feita
     */
    public ResultSet BuscaEndereco(String cep, int numCasa) {
    try {
        dao.conexao();
        String SQL = "SELECT * FROM endereco WHERE cep ="+cep+" AND numCasa ="+numCasa+"";
        Resultado = dao.getStatement().executeQuery(SQL);
        dao.desconecta();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Resultado;
    }

    
    
    
}
