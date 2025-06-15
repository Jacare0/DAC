package Controle;

import Modelo.MedicoM;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe controlador para a tabela medico
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 07/06/2025
 */
public class MedicoC {
    public Statement stmt;
    public ResultSet Resultado;
    private Database dao= new Database();
    private DadosPessoaisC dadosPessoaisControl = new DadosPessoaisC(); // Instância de DadosPessoaisC

    /**
     * Função que acessa o banco de dados após receber um médico como
     * parâmetro onde irá inserir na tabela medicos do banco de dados.
     * @author Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param obj - Objeto do tipo MedicoM contendo os dados do
     * médico que será inserido.
     */
    public void CadastraMedico(MedicoM obj) {
        try{
            // Primeiro, tratar a parte do DadosPessoaisM (que inclui EnderecoM)
            dadosPessoaisControl.CadastraDadosPessoais(obj); // Passa o objeto MedicoM, pois ele estende DadosPessoaisM

            dao.conexao();
            String verificaSQL = "SELECT * FROM medicos WHERE crm = '"+obj.getCRM()+"'";
            Resultado = dao.getStatement().executeQuery(verificaSQL);

            if(!Resultado.next()){ // Se não encontrou resultados, o médico não existe
                String SQL = "INSERT INTO medicos (crm, especialidade, valorcons, numcons, data) VALUES('"+obj.getCRM()+"','"+obj.getEspecialidade()+"',"+obj.getValor()+", "+obj.getNumConsulta()+",'"+obj.getData()+"') "; // Adicionado CRM no insert
                dao.getStatement().execute(SQL);
                System.out.println("Médico cadastrado com sucesso.");
            } else {
                System.out.println("Médico já cadastrado com este CRM.");
            }
            dao.desconecta();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Função para conectar com o banco de dados e fazer uma pesquisa
     * de tudo da tabela medicos e desconectar do banco de dados após
     * a pesquisa.
     * @author Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @return um Resultado(do tipo ResultSet) sendo a pesquisa feita
     */
    public ResultSet BuscaMedicos(){ // Renomeado para plural
        try{
            dao.conexao();
            String SQL = "SELECT * FROM Medicos";
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        }catch(Exception e){
            e.printStackTrace();
        }
        return Resultado;
    }

    
    /**
     * Função para acessar o banco de dados e deletar um médico
     * a partir do CRM e depois desconectar do banco de dados.
     * Esta função também deleta os dados pessoais e o endereço associados.
     * @author Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @param crm CRM do tipo String
     */
    public void DeletaMedico(String crm){
        try{
            // Antes de deletar da tabela medicos, precisamos do CPF para deletar os dados pessoais.
            // Assumindo que o CRM está relacionado a um CPF em DadosPessoaisM.
            // Para isso, você precisará buscar o CPF do médico primeiro.
            // Se o CRM é a chave primária na tabela medicos e não está diretamente ligado ao CPF
            // na sua estrutura, talvez você precise de uma forma de obter o CPF a partir do CRM.

            // OPÇÃO 1: Se o CPF do médico estiver disponível no objeto MedicoM ou puder ser buscado
            // A sua classe MedicoM herda de DadosPessoaisM, então ela *tem* um CPF.
            // No entanto, o método DeletaMedico só recebe o CRM. Você precisará buscar o CPF
            // associado a este CRM para poder chamar dadosPessoaisControl.DeletaDadosPessoais(cpf).

            // Vamos assumir que você passa o CPF também, ou recupera o CPF antes.
            // Para simplificar, vou alterar o método para receber o CPF.
            // Ou você pode primeiro buscar o médico pelo CRM para obter o CPF dele.
            String cpfMedico = null;
            dao.conexao();
            String buscaCpfSql = "SELECT cpf FROM dadospessoais WHERE cpf IN (SELECT cpf FROM medicos WHERE crm = '"+crm+"')";
            ResultSet rsCpf = dao.getStatement().executeQuery(buscaCpfSql);
            if(rsCpf.next()){
                cpfMedico = rsCpf.getString("cpf");
            }
            rsCpf.close();
            dao.desconecta(); // Desconecta após a busca de CPF

            if (cpfMedico != null) {
                // Primeiro, deleta o médico da tabela medicos
                dao.conexao();
                String SQL = "DELETE FROM medicos WHERE crm = '"+crm+"' ";
                dao.getStatement().execute(SQL);
                System.out.println("Médico deletado da tabela 'medicos'.");
                dao.desconecta();

                // Em seguida, deleta os dados pessoais (que por sua vez deletará o endereço)
                dadosPessoaisControl.DeletaDadosPessoais(cpfMedico);
                System.out.println("Dados pessoais associados deletados.");
            } else {
                System.out.println("CPF do médico não encontrado para o CRM: " + crm);
            }

        }catch(Exception erro){
            erro.printStackTrace();
            System.err.println("Erro ao deletar médico e seus dados associados.");
        }
    }

    /**
     * Função para conectar no banco de dados e atualizar um médico e depois
     * desconectar do banco de dados.
     * @author Arthur Fernandes Castanheira
     * @version v1
     * @since 07/06/2025
     * @param crm parâmetro String para passar como busca
     * @param NovaEspecialidade parâmetro String novo para especialidade
     * @param NovoValorConsulta parâmetro Float novo para valor consulta
     * @param NovoNumConsulta parâmetro int novo para numero consulta
     */
    public void AtualizaMedico(String crm, String NovaEspecialidade, float NovoValorConsulta,int NovoNumConsulta ){
        try{
            dao.conexao();
            String SQL = "UPDATE medicos SET especialidade = '"+NovaEspecialidade+"', valorcons = "+NovoValorConsulta+", numcons = "+NovoNumConsulta+" WHERE crm = '"+crm+"'"; // Corrigido SQL (especialidade e valorcons)
            dao.getStatement().executeUpdate(SQL);
            dao.desconecta();
        }catch(Exception erro){
            erro.printStackTrace();
        }
    }

    /**
     * Função de busca de médico com parâmetro por crm.
     * @author Arthur Fernandes Castanheira
     * @since 07/06/2025
     * @version v1
     * @param crm String - parâmetro para buscar por crm
     * @return Um Resultado que é do tipo ResultSet onde trás a pesquisa feita
     */
    public ResultSet BuscaMedico(String crm) {
        try {
            dao.conexao();
            String SQL = "SELECT * FROM medicos WHERE crm ='"+crm+"'"; // Corrigido nome da coluna para crm
            Resultado = dao.getStatement().executeQuery(SQL);
            // dao.desconecta(); // Manter conexão aberta se o ResultSet for usado fora
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resultado;
    }
}