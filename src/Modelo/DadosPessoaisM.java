/**
 * Modelo para os Dados pessoais com Extends no endereço.
 * @author arthur fernandes castanheira
 * @version v1 
 * @since 02/06/2025
 */

package Modelo;

public class DadosPessoaisM {
    private int idDadosPessoais;
    private String Nome;
    private String CPF;
    private int Idade;
    private String Sexo;
    private String DataNascimento;
    private String Telefone;
    private String Email;
    private EnderecoM Endereco;

    public DadosPessoaisM(int idDadosPessoais,String Nome, String CPF, int Idade, String Sexo, String DataNascimento, String Telefone, String Email, EnderecoM Endereco) {
        this.idDadosPessoais = idDadosPessoais;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Endereco = Endereco;
    }
    
    
    public int getIdDadosPessoais() {
        return idDadosPessoais;
    }

    public void setIdDadosPessoais(int idDadosPessoais) {
        this.idDadosPessoais = idDadosPessoais;
    }

    public EnderecoM getEndereco() {
        return Endereco;
    }

    public void setEndereco(EnderecoM Endereco) {
        this.Endereco = Endereco;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }    
}
