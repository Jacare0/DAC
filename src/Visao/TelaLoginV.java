/**
 *
 * @author Gabriel Danieli
 */

package Visao;

import Controle.LoginC;
import Modelo.LoginM;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class TelaLoginV extends javax.swing.JFrame {
    
    private TelaCadastroLoginV telaCadastroLogin;
    private TelaPrincipalV telaPrincipal;
    
    private LoginC login;
    
    public TelaLoginV() {
        initComponents();
        login = new LoginC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLUsuario = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLSenha = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jBCadastrar = new javax.swing.JButton();
        jBEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLTitulo.setText("Clínica Equilibrio Natural");

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLUsuario.setText("Usuários:");

        jLSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSenha.setText("Senha:");

        jBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarLogin(evt);
            }
        });

        jBEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autenticarLogin(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPFSenha)
                            .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jBEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLSenha)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEntrar)
                    .addComponent(jBCadastrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarLogin
        if (telaCadastroLogin == null || !telaCadastroLogin.isDisplayable()) {
            telaCadastroLogin = new TelaCadastroLoginV();
            telaCadastroLogin.setLocationRelativeTo(null);
            telaCadastroLogin.setVisible(true);
        } else {
            telaCadastroLogin.toFront();
            telaCadastroLogin.requestFocus();
        }
    }//GEN-LAST:event_cadastrarLogin

    private void autenticarLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autenticarLogin
        String usuario = jTUsuario.getText();
        String senha = new String(jPFSenha.getPassword());
        
        jTUsuario.setText("");
        jPFSenha.setText("");
        
        LoginM L = new LoginM(usuario,senha, "M");
        
        boolean autenticacao;
        try{
             autenticacao = login.Autenticar(L);

            if(autenticacao){
                if (telaPrincipal == null || !telaPrincipal.isDisplayable()) {
                    telaPrincipal = new TelaPrincipalV();
                    telaPrincipal.setLocationRelativeTo(null);
                    telaPrincipal.setVisible(true);
                } else {
                    telaPrincipal.toFront();
                    telaPrincipal.requestFocus();
                }
                this.dispose();
            }
            
            else{
                JOptionPane.showMessageDialog(null, "LOGIN OU SENHA INVÁLIDOS!!!");
            }
        } catch (Exception err){
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + err.getMessage());
        }
    }//GEN-LAST:event_autenticarLogin

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
