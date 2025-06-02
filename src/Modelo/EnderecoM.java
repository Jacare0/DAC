package Modelo;

/**
 * Esta classe serve como modelo para o Endereço onde foi criado
 * um construtor, getter e setter para Rua, NumCasa,Bairro,CEP, Cidade e Estado;
 * @author arthur Fernandes Castanheira
 * @since data 2/06/2025
 * @version v1
 */
public class EnderecoM {
    private String Rua;
    private int NumCasa;
    private String bairro;
    private String CEP;
    private String Cidade;  
    private String Estado;

    public EnderecoM(String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        this.Rua = Rua;
        this.NumCasa = NumCasa;
        this.bairro = bairro;
        this.CEP = CEP;
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
