/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.MedicoM;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe controlador para a tabela medico
 * @author arthur fernandes castanheira
 * @version v1
 * @since 07/06/2025
 */
public class MedicoC {
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    
    /**
     * Função que acessa o banco de dados após receber um medico como
     * parametro onde irá inserir na tabela medico do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param obj - Objeto do tipo MedicoM contendo os dados do
     * funcionario que sera inserido.
     */
    public void CadastraMedico(MedicoM obj) {
        try{
            dao.conexao();
            String SQL = "insert into medicos values('"+obj.getCRM()+"','"+obj.getEspecialidade()+"',"+obj.getValor()+", "+obj.getNumConsulta()+",'"+obj.getData()+"') ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer um pesquisa 
     * de tudo da tabela medico e desconectar do banco de dados após 
     * a pesquisa.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaMedico(){
        try{
            dao.conexao();
            String SQL = "select * from Medicos";
            Resultado = dao.getStatement().executeQuery(SQL);
            dao.desconecta();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }
    
    /**
     * Função para acessar o banco de dados e deletar um medico
     * a partir de e depois
     * desconectar do banco de dados.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * 
     */
    public void DeletaMedico(String crm){
        try{
            dao.conexao();
            String SQL = "delete from funcionarios where cpf = '"+crm+"' ";
            dao.getStatement().execute(SQL);
            dao.desconecta();
            
        }catch(Exception erro){
            erro.printStackTrace();
        }
        
    }
    
    /**
     * Função para conectar no banco de dados e atualizar um medico e depois
     * desconectar do banco de dados
     * @autor Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param crm pametro string para passar como busca
     * @param NovaEspecialidade parametro String novo para especialidade 
     * @param NovoValorConsulta parametro Float novo para valor consulta
     * @param NovoNumConsulta parametro int novo para numero consulta
     */
    public void AtualizaMedico(String crm, String NovaEspecialidade, float NovoValorConsulta,int NovoNumConsulta ){
        try{
            dao.conexao();
            String SQL = "update medicos set especialidade = "+NovaEspecialidade+", valorcons = '"+NovoValorConsulta+"', numcons = "+NovoNumConsulta+"where crm = '"+crm+"'";
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }
    
    /**
     * Função de busca de medico com parametro por crm.
     * @autor Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @param crm String - parametro para buscar por crm
     * @return Um REsultado que é do tipo resultset onde trás a pesquisa feita
     */
    public ResultSet BuscaMedico(String crm) {
    try {
        dao.conexao();
        String SQL = "SELECT * FROM medicos WHERE cpf ='"+crm+"'";
        Resultado = dao.getStatement().executeQuery(SQL);
        dao.desconecta();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return Resultado;
    }
}
