package Controle;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.EnderecoM;
import java.sql.Statement;
import javax.swing.JOptionPane;

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
     * @author Arthur Fernandes Castanheira
     * @version v1
     * @since 02/06/2025
     * @param obj - Objeto do tipo EnderecoM contendo os dados do
     * endereço que sera inserido.
     */
    public void CadastraEndereco(EnderecoM obj) {
        try{
            dao.conexao();
            // Verifica se o endereço já existe
            String verificaSQL = "SELECT * FROM endereco WHERE CEP = '"+obj.getCEP()+"' AND numero = "+obj.getNumCasa()+"";
            Resultado = dao.getStatement().executeQuery(verificaSQL);

            if(!Resultado.next()){ // Se não encontrou resultados, o endereço não existe
                String SQL = "INSERT INTO ENDERECO (rua, numero, bairro, CEP, cidade, estado) VALUES('"+obj.getRua()+"',"+obj.getNumCasa()+",'"+obj.getBairro()+"','"+obj.getCEP()+"', '"+obj.getCidade()+"', '"+obj.getEstado()+"') ";
                dao.getStatement().execute(SQL);
                System.out.println("Endereço cadastrado com sucesso.");
            } else {
                System.out.println("Endereço já cadastrado.");
            }
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
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