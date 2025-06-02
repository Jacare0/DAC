
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
}
