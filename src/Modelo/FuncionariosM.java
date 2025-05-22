
package Modelo;


public class FuncionariosM extends DadosPessoaisM{
    private String DataContratacaoFunc;
    private float Salaraio;
    private String Funcao;

    public FuncionariosM(String DataContratacaoFunc, float Salaraio, String Funcao, String Nome, String CPF, int Idade, String Sexo, String DataNascimento, int Telefone, String Email, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        super(Nome, CPF, Idade, Sexo, DataNascimento, Telefone, Email, Rua, NumCasa, bairro, CEP, Cidade, Estado);
        this.DataContratacaoFunc = DataContratacaoFunc;
        this.Salaraio = Salaraio;
        this.Funcao = Funcao;
    }

    public String getDataContratacaoFunc() {
        return DataContratacaoFunc;
    }

    public void setDataContratacaoFunc(String DataContratacaoFunc) {
        this.DataContratacaoFunc = DataContratacaoFunc;
    }

    public float getSalaraio() {
        return Salaraio;
    }

    public void setSalaraio(float Salaraio) {
        this.Salaraio = Salaraio;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
    
    
}
