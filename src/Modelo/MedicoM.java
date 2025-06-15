/**
 * Modelo para Medico com extends em DadosPessoais
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 02/06/2025
 */

package Modelo;

public class MedicoM{  
    private int idMedico;
    private String CRM;
    private String Especialidade;
    private float Valor;
    private int NumConsulta;
    private String Data;
    private DadosPessoaisM DadosPessoais;

    public MedicoM(int idMedico, String CRM, String Especialidade, float Valor, int NumConsulta, String Data, DadosPessoaisM DadosPessoais) {
        this.idMedico = idMedico;
        this.CRM = CRM;
        this.Especialidade = Especialidade;
        this.Valor = Valor;
        this.NumConsulta = NumConsulta;
        this.Data = Data;
        this.DadosPessoais = DadosPessoais;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public DadosPessoaisM getDadosPessoais() {
        return DadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisM DadosPessoais) {
        this.DadosPessoais = DadosPessoais;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public int getNumConsulta() {
        return NumConsulta;
    }

    public void setNumConsulta(int NumConsulta) {
        this.NumConsulta = NumConsulta;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
}
