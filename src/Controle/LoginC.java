/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.LoginM;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe controlador para Login
 * @author arthur Fernandes Castanheira
 * @since 07/06/2025
 * @version v1
 */
public class LoginC {
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    
    /**
     * Função que acessa o banco de dados após receber um login como
     * parametro onde irá inserir na tabela login do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param obj - Objeto do tipo LoginM contendo os dados do
     * login que sera inserido.
     */
    public void CadastraLogin(LoginM obj) {
        try{
            dao.conexao();
            String SQL = "insert into login values('"+obj.getUsuario()+"','"+obj.getSenha()+"','"+obj.getTipo()+"') ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer um pesquisa 
     * de tudo da tabela login e desconectar do banco de dados após 
     * a pesquisa.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaLogin(){
        try{
            dao.conexao();
            String SQL = "select * from login";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
    
     /**
     * Função para acessar o banco de dados e deletar uma login
     * a partir de e depois
     * desconectar do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * 
     */
    public void DeletaConsulta(String Usuario){
        try{
            dao.conexao();
            String SQL = "delete from login where usuario = '"+Usuario+"' ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
    }
}
