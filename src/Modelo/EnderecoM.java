package Modelo;

/**
 * Esta classe serve como modelo para o Endereço onde foi criado
 * um construtor, getter e setter para Rua, NumCasa,Bairro,CEP, Cidade e Estado;
 * Agora inclui também o ID gerado pelo banco de dados.
 * @author Arthur Fernandes Castanheira
 * @since data 2/06/2025
 * @version v1
 */

public class EnderecoM {
    private int idEndereco;
    private String Rua;
    private int NumCasa;
    private String Bairro;
    private String CEP;
    private String Cidade;
    private String Estado;

    public EnderecoM(int idEndereco, String Rua, int NumCasa, String Bairro, String CEP, String Cidade, String Estado) {
        this.idEndereco = idEndereco;
        this.Rua = Rua;
        this.NumCasa = NumCasa;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
        this.Estado = Estado;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
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
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
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