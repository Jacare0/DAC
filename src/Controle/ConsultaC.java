/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.ConsultaM;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe para o controlador para a tabela de consulta
 * @author arthur fernandes castanheira
 * @version v1
 * @since 07/06/2025
 */
public class ConsultaC {
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    
    /**
     * Função que acessa o banco de dados após receber uma consulta como
     * parametro onde irá inserir na tabela consulta do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param obj - Objeto do tipo ConsultaM contendo os dados da
     * consulta que sera inserido.
     */
    public void CadastraMedico(ConsultaM obj) {
        try{
            dao.conexao();
            String SQL = "insert into consultas values('"+obj.getDataConsulta()+"','"+obj.getHoraConsulta()+"','"+obj.getStatus()+"') ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer um pesquisa 
     * de tudo da tabela consulta e desconectar do banco de dados após 
     * a pesquisa.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaConsulta(){
        try{
            dao.conexao();
            String SQL = "select * from consultas";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
    
    /**
     * Função para acessar o banco de dados e deletar uma consulta
     * a partir de e depois
     * desconectar do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * 
     */
    public void DeletaConsulta(int idconsulta){
        try{
            dao.conexao();
            String SQL = "delete from consultas where idcons = '"+idconsulta+"' ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
    }
    
    /**
     * função para conectar no banco de dados e usar como parametro passado o 
     * id da consulta para atualizar a consulta
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @param idconsulta int parametro 
     * @param NovaDataCon String nova data
     * @param NovaHoraCon String nova hora
     * @param NovoStatus String novo status 
     */
    
    public void AtualizaMedico(int idconsulta, String NovaDataCon, String NovaHoraCon,String NovoStatus ){
        try{
            dao.conexao();
            String SQL = "update consultas set dataconst = "+NovaDataCon+", horaconst = '"+NovaHoraCon+"', status = "+NovoStatus+"where idcons = '"+idconsulta+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    /**
     * Função de busca de consulta com parametro por id da consulta.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @param idcons int - parametro para buscar por id da consulta
     * @return Um REsultado que é do tipo resultset onde trás a pesquisa feita
     */
    public ResultSet BuscaConsulta(int idcons ) {
    try {
        dao.conexao();
        String SQL = "SELECT * FROM consulta WHERE idcons ='"+idcons+"'";
        Resultado = dao.getStatement().executeQuery(SQL);
        dao.desconecta();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Resultado;
    }
    
}
