package Modelo;

public class MedicoM extends DadosPessoaisM{  
    private String CRM;
    private String Especialidade;
    private float Valor;
    private int NumConsulta;
    private String Data;

    public MedicoM(String CRM, String Especialidade, float Valor, int NumConsulta, String Data, String Nome, String CPF, int Idade, String Sexo, String DataNascimento, int Telefone, String Email, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        super(Nome, CPF, Idade, Sexo, DataNascimento, Telefone, Email, Rua, NumCasa, bairro, CEP, Cidade, Estado);
        this.CRM = CRM;
        this.Especialidade = Especialidade;
        this.Valor = Valor;
        this.NumConsulta = NumConsulta;
        this.Data = Data;
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
