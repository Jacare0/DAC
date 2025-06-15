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
    private int idEndereco; // Novo campo para armazenar o ID gerado
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
        this.idEndereco = 0; // Inicializa com 0 ou outro valor padrão
    }

    // Construtor adicional para quando você já tem o ID (por exemplo, ao carregar do BD)
    public EnderecoM(int idEndereco, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        this(Rua, NumCasa, bairro, CEP, Cidade, Estado);
        this.idEndereco = idEndereco;
    }

    // Getter e Setter para idEndereco
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    // ... (Getters e Setters existentes para Rua, NumCasa, Bairro, CEP, Cidade, Estado) ...
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