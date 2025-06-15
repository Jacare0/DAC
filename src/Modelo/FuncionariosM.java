/**
 * Modelo para Funcionarios com extends em dadosPessoais
 * @author arthu
 * @since 02/06/2025
 * @version v1
 */

package Modelo;

public class FuncionariosM{
    private int idFuncionario;
    private String DataContratacao;
    private float Salario;
    private String Funcao;
    private DadosPessoaisM DadosPessoais;

    public FuncionariosM(int idFuncionario, String DataContratacao, float Salario, String Funcao, DadosPessoaisM DadosPessoais) {
        this.idFuncionario = idFuncionario;
        this.DataContratacao = DataContratacao;
        this.Salario = Salario;
        this.Funcao = Funcao;
        this.DadosPessoais = DadosPessoais;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public DadosPessoaisM getDadosPessoais() {
        return DadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisM DadosPessoais) {
        this.DadosPessoais = DadosPessoais;
    }

    public String getDataContratacao() {
        return DataContratacao;
    }

    public void setDataContratacao(String DataContratacao) {
        this.DataContratacao = DataContratacao;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }
}
