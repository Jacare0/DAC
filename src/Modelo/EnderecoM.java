package Modelo;

public class EnderecoM {
    private String Rua;
    private int NumCasa;
    private String bairro;
    private String cpf;
    private String Cidade;  
    private String Estado;

    public EnderecoM(String Rua, int NumCasa, String bairro, String cpf, String Cidade, String Estado) {
        this.Rua = Rua;
        this.NumCasa = NumCasa;
        this.bairro = bairro;
        this.cpf = cpf;
        this.Cidade = Cidade;
        this.Estado = Estado;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public int getNumCasa() {
        return NumCasa;
    }

    public void setNumCasa(int NumCasa) {
        this.NumCasa = NumCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
}
