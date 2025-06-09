
package Controle;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.DadosPessoaisM;
import java.sql.Statement;

/**
 * Controlador para acessar o banco de dados e inserir, deletar, atualizar e pesquisar
 * os dados pessoais.
 * @author arthur Fernandes Castanheira
 * @version v1
 * @since 03/06/2025
 */
public class DadosPessoaisC{
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    
        
        /**
         * Função para conectar no banco de dados verifica seja tem cadastro da pessoa,
         * se não encontrar, cadastra os dados pessoais 
         * e desconectar após o cadastro
         * @autor Arthur Fernandes Castanheira
         * @since 04/06/2025
         * @version v1
         * @param obj obj do tipo DadosPessoais
         */
        public void CadastraDadosPessoais(DadosPessoaisM obj) {
        try{
            dao.conexao();
            String VerificaSQL = "select * from dadospessoais where cpf = "+obj.getCPF()+"";
            Resultado = dao.getStatement().executeQuery(VerificaSQL);
            
            if(!Resultado.next()){
                
            String SQL = "insert into dadospessoais values('"+obj.getNome()+"',' "+obj.getCPF()+"',"+obj.getIdade()+",'"+obj.getSexo()+"', '"+obj.getDataNascimento()+"', '"+obj.getTelefone()+"', '"+obj.getEmail()+"') ";
            dao.getStatement().execute(SQL);
            } else{
                System.out.println("Endereço ja cadastrado");
            }
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
        /**
         * Função para pesquisar e retornar todos os dados pessoais cadastrados
         * @autor Arthur Fernandes castanheira
         * @since 04/06/2025
         * @version v1
         * @return Retorna um Resultado sendo do tipo ResultSet contendo
         * o conteudo da pesquisa feita
         */
        public ResultSet BuscaDadosPessoais(){
        try{
            dao.conexao();
            String SQL = "select * from dadospessoais";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
       
        
        /**
         * Função que conecta no banco de dados e realiza uma pesquisa com base
         * no paremetro passado como CPF para uma pesquisa especifica
         * @autor Arthur Fernandes Castanheira
         * @since 04/06/2025
         * @version v1
         * @param CPF Tipo String
         * @return retorna o resultado sendo um tipo de ResultSet
         */
        public ResultSet BuscaDadosPessoaisPorCPF(String CPF){
        try{
            dao.conexao();
            String SQL = "select * from dadospessoais where CPF = '"+CPF+"'";
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
         * usuario como parametro e desconectar do banco apos deletar
         * @autor Arthur Fernandes Castanheira
         * @since 04/06/2025
         * @version v1
         * @param CPF CPF do tipo String
         */
        public void DeletaDadosPessoais(String CPF){
        try{
            dao.conexao();
            String SQL = "delete from dadospessoais where cpf = '"+CPF+"'";
            dao.getStatement().execute(SQL);
            dao.desconecta();
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
    }
       
        
        /**
         * Função para conectar no bando de dados e atualizar os dados pessoais apos o cpf 
         * ser passado como parametro, atualiza os campos possiveis e depois desconecta do 
         * banco de dados
         * @autor Arthur Fernandes Castanheira
         * @since 04/06/2025
         * @version 1
         * @param cpf tipo String - passado como parametro de busca
         * @param NovoNome tipo String 
         * @param NovaIdade tipo Int 
         * @param NovoSexo tipo String
         * @param NovoTelefone tipo String 
         * @param NovoEmail tipo String
         */
        public void AtualizaDadosPessoais(String cpf, String NovoNome, int NovaIdade, String NovoSexo, String NovoTelefone, String NovoEmail){
        try{
            dao.conexao();
            String SQL = "update dadospessoais set nome = '"+NovoNome+"', idade = "+NovaIdade+", sexo = '"+NovoSexo+"', telefone = '"+NovoTelefone+"', email = '"+NovoEmail+"' where CPF = '"+cpf+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }    
        
    
}
