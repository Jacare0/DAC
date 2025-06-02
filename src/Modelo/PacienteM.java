
package Modelo;
/**
 * modelo de paciente, usando apenas a base de dados pessoais
 * apenas para um cadastro do paciente
 * @author Arthur Fernandes Castanheira
 * @version v1
 * @since 02/06/2025
 */

public class PacienteM extends DadosPessoaisM{

    public PacienteM(String Nome, String CPF, int Idade, String Sexo, String DataNascimento, int Telefone, String Email, String Rua, int NumCasa, String bairro, String CEP, String Cidade, String Estado) {
        super(Nome, CPF, Idade, Sexo, DataNascimento, Telefone, Email, Rua, NumCasa, bairro, CEP, Cidade, Estado);
    }
    
}
