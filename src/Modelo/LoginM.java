/**
 * Modelo para a tela de login
 * @author Arthur Fernandes Castanheira
 * @since 02/06/2025
 * @version v1
 */

package Modelo;

public class LoginM {
    private String Usuario;
    private String Senha;
    private String Tipo;

    public LoginM(String Usuario, String Senha, String Tipo) {
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.Tipo = Tipo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }   
}
