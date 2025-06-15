/**
 * Modelo de paciente, usando apenas a base de dados pessoais
 * apenas para um cadastro do paciente
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 02/06/2025
 */

package Modelo;

public class PacienteM extends DadosPessoaisM{
    
    private int idPaciente;
    private DadosPessoaisM DadosPessoais

    public PacienteM(int idPaciente, DadosPessoaisM DadosPessoais, int idDadosPessoais, String Nome, String CPF, int Idade, String Sexo, String DataNascimento, String Telefone, String Email, EnderecoM Endereco) {
        super(idDadosPessoais, Nome, CPF, Idade, Sexo, DataNascimento, Telefone, Email, Endereco);
        this.idPaciente = idPaciente;
        this.DadosPessoais = DadosPessoais;
    }
            
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public DadosPessoaisM getDadosPessoais() {
        return DadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisM DadosPessoais) {
        this.DadosPessoais = DadosPessoais;
    }


}
