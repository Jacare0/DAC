
package Controle;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author rf5974
 */
//DAO: Data Access OBject

public class Database {
     // Objeto de COnexão e desconexao com BD
    public Connection conn;
    // Objeto de comando DML(dicionario de manipulacao de dados)
    //DML: SELECT, INSERT, Delete e update
    public Statement stmt;
    // Objeto com dados(ArrayList com n tuplas)
    private ResultSet res;
    /*
    Procedimento que realiza a conexao fisica com postgresql
    como?
    1-Usa o driver JDBC
    2-informa o login e senha do usuario
    3-define o banco de dados e o processo(porta de conexao:5432)
    
    */
    public void conexao(){                        
       try
       {
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection(
               "jdbc:postgresql://localhost:5432/DAC","postgres", "1235");
        System.out.println("Conectado ao PostGreSQL.");        
        }catch(Exception e){
            System.out.println("Falha ao tentar a conexão");
            e.printStackTrace();
        }
       
       try{
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);      
       }catch(Exception e){
           System.out.println("Falha no Cursor de Execu��o");
           e.printStackTrace();
       }
    }
    
     public Connection getConnection(){
        return conn;
    }
    
    public Statement getStatement(){
        return stmt;
    }
    
    public void desconecta(){
        if(conn != null){
            try{
                conn.close();
            }catch(SQLException erro){
                erro.printStackTrace();
            }
            
        }
    }
}
