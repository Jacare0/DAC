
package Modelo;

public class LoginM {
    private String Usuario;
    private String Senha;

    public LoginM(String Usuario, String Senha) {
        this.Usuario = Usuario;
        this.Senha = Senha;
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
    
    
    
    
}
