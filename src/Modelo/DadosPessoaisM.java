
package Modelo;

public class DadosPessoaisM extends EnderecoM{
    private String Nome;
    private String CPF;
    private int Idade;
    private String Sexo;
    private String DataNascimento;
    private int Telefone;
    private String Email;

    public DadosPessoaisM(String Nome, String CPF, int Idade, String Sexo, String DataNascimento, int Telefone, String Email, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        super(Rua, NumCasa, bairro, CEP, Cidade, Estado);
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.Telefone = Telefone;
        this.Email = Email;
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

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   
    
    
  
}
