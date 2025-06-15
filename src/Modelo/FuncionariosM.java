/**
 * Modelo para Funcionarios com extends em dadosPessoais
 * @author arthu
 * @since 02/06/2025
 * @version v1
 */

package Modelo;

public class FuncionariosM extends DadosPessoaisM{
    private String DataContratacaoFunc;
    private float Salario;
    private String Funcao;

  public FuncionariosM(String DataContratacaoFunc, float Salaraio, String Funcao, int idEndereco, String Nome, String CPF, int Idade, String Sexo, String DataNascimento, int Telefone, String Email, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        super(idEndereco, Nome, CPF, Idade, Sexo, DataNascimento, Telefone, Email, Rua, NumCasa, bairro, CEP, Cidade, Estado); // Chama o construtor de DadosPessoaisM com ID
        this.DataContratacaoFunc = DataContratacaoFunc;
        this.Salario = Salaraio;
        this.Funcao = Funcao;
    }

    public String getDataContratacaoFunc() {
        return DataContratacaoFunc;
    }

    public void setDataContratacaoFunc(String DataContratacaoFunc) {
        this.DataContratacaoFunc = DataContratacaoFunc;
    }

    public float getSalaraio() {
        return Salario;
    }

    public void setSalaraio(float Salaraio) {
        this.Salario = Salaraio;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
}
