/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    
    /**
     * Função que acessa o banco de dados após receber um funcionario como
     * parametro onde irá inserir na tabela funcionarios do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 06/06/2025
     * @param obj - Objeto do tipo FuncionariosM contendo os dados do
     * funcionario que sera inserido.
     */
    public void CadastraFuncionarios(FuncionariosM obj) {
        try{
            dao.conexao();
            String SQL = "insert into funcionarios values('"+obj.getDataContratacaoFunc()+"',"+obj.getSalaraio()+",'"+obj.getFuncao()+"') ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer um pesquisa 
     * de tudo da tabela funcionarios e desconectar do banco de dados após 
     * a pesquisa.
     * @autor Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaFuncionarios(){
        try{
            dao.conexao();
            String SQL = "select * from funcionarios";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
    
    /**
     * Função para acessar o banco de dados e deletar um funcionario
     * a partir de  e depois
     * desconectar do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * 
     */
    public void DeletaEndereco(String cpf){
        try{
            dao.conexao();
            String SQL = "delete from funcionarios where cpf = '"+cpf+"' ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
    }
    
    /**
     * Função para acessar e atualizar a tabela de funcionarios no banco de dados
     * onde tem como parametros principais para achar na tabela o cpf e 
     *  depois de atualizado desconecta do banco de dados
     * @autor Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @param cpf String - parametro para busca para atualizar
     * @param NovoSalario Float - parametro do novo salario
     * @param NovaFunção String - parametro da nova função
     */
    public void AtualizaValorProduto(String cpf, float NovoSalario, String NovaFunção){
        try{
            dao.conexao();
            String SQL = "update funcionarios set salario = "+NovoSalario+",funcao = '"+NovaFunção+"' where cpf = '"+cpf+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    /**
     * Função de busca de funcionarios com parametro por cpf.
     * @autor Arthur Fernandes Castanheira
     * @since 06/06/2025
     * @version v1
     * @param cpf String - parametro para buscar por cpf
     * @return Um REsultado que é do tipo resultset onde trás a pesquisa feita
     */
    public ResultSet BuscaEndereco(String cpf) {
    try {
        dao.conexao();
        String SQL = "SELECT * FROM funcionarios WHERE cpf ='"+cpf+"'";
        Resultado = dao.getStatement().executeQuery(SQL);
        dao.desconecta();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Resultado;
    }

}
