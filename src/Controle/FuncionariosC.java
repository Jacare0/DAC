package Controle;

import Modelo.FuncionariosM;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe controlador para Funcionarios
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 06/06/2025
 */
public class FuncionariosC {
    public ResultSet Resultado;
    private Database dao = new Database();
    private DadosPessoaisC DPC = new DadosPessoaisC(); 

    /**
     * Função que acessa o banco de dados após receber um funcionário como
     * parâmetro onde irá inserir na tabela funcionarios do banco de dados.
     * @author Arthur Fernandes Castanheira
     * @version v1
     * @since 06/06/2025
     * @param obj - Objeto do tipo FuncionariosM contendo os dados do
     * funcionário que será inserido.
     */
    public void CadastraFuncionarios(FuncionariosM obj) {
        try{
            int idDadosPessoais = DPC.CadastraDadosPessoais(obj.getDadosPessoais());
            
            if(idDadosPessoais == -1){
                System.err.println("Não foi possível obter o ID dos DadosPessoais. Cadastro de funcionario abortado.");
                return;
            }
            
            dao.conexao();
            
            String verificaSQL = " SELECT * FROM funcionarios WHERE idfunc =" + obj.getIdFuncionario() + ";";
            Resultado = dao.getStatement().executeQuery(verificaSQL);

            if(!Resultado.next()){ 
                String SQL = "INSERT INTO funcionarios VALUES (" + obj.getIdFuncionario() + "," + obj.getDadosPessoais().getIdDadosPessoais() + 
                             ",'" + obj.getDataContratacao() + "'," + obj.getSalario() + ",'" + obj.getFuncao() +"');"; 
                dao.getStatement().execute(SQL);
                System.out.println("Funcionário cadastrado com sucesso.");
            } else {
                System.out.println("Funcionário já cadastrado com este ID.");
            }
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    /**
     * Função para conectar com o banco de dados e fazer uma pesquisa
     * de tudo da tabela funcionarios e desconectar do banco de dados após
     * a pesquisa.
     * @author Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaFuncionarios(){
        try{
            dao.conexao();
            String SQL = "SELECT * FROM funcionarios";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }

    /**
     * Função para acessar o banco de dados e deletar um funcionário
     * a partir do CPF e depois desconectar do banco de dados.
     * Esta função também deleta os dados pessoais e o endereço associados.
     * @author Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @param cpf CPF do tipo String
     */
    public void DeletaFuncionario(String cpf){
        try{
            dao.conexao();
            // Primeiro, deleta o funcionário da tabela funcionarios
            String SQL = "DELETE FROM funcionarios WHERE cpf = '"+cpf+"' ";
            dao.getStatement().execute(SQL);
            System.out.println("Funcionário deletado da tabela 'funcionarios'.");
            dao.desconecta();

            // Em seguida, deleta os dados pessoais (que por sua vez deletará o endereço, se configurado com CASCADE ou se DadosPessoaisC lidar com isso)
            DPC.DeletaDadosPessoais(cpf);
            System.out.println("Dados pessoais associados deletados.");

        }catch(Exception erro){
            erro.printStackTrace();
            System.err.println("Erro ao deletar funcionário e seus dados associados.");
        }
    }

    /**
     * Função para acessar e atualizar a tabela de funcionários no banco de dados
     * onde tem como parâmetros principais para achar na tabela o cpf e
     * depois de atualizado desconecta do banco de dados.
     * @author Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @param cpf String - parâmetro para busca para atualizar
     * @param NovoSalario Float - parâmetro do novo salário
     * @param NovaFuncao String - parâmetro da nova função
     */
    public void AtualizaFuncionario(String cpf, float NovoSalario, String NovaFuncao){ // Renomeado método para clareza
        try{
            dao.conexao();
            String SQL = "UPDATE funcionarios SET salario = "+NovoSalario+", funcao = '"+NovaFuncao+"' WHERE cpf = '"+cpf+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

    /**
     * Função de busca de funcionários com parâmetro por cpf.
     * @author Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @param cpf String - parâmetro para buscar por cpf
     * @return Um Resultado que é do tipo ResultSet onde trás a pesquisa feita
     */
    public ResultSet BuscaFuncionario(String cpf) { // Renomeado método para clareza
        try {
            dao.conexao();
            String SQL = "SELECT * FROM funcionarios WHERE cpf ='"+cpf+"'";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resultado;
    }
}