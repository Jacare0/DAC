
package Visao;

import Controle.LoginC;
import Modelo.LoginM;
import javax.swing.JOptionPane;

public class TelaCadastroLoginV extends javax.swing.JFrame {

    private LoginC login;
   
    public TelaCadastroLoginV() {
        initComponents();
        login = new LoginC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLUsuario = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLSenha = new javax.swing.JLabel();
        jLTipo = new javax.swing.JLabel();
        jCBTipo = new javax.swing.JComboBox<>();
        jBCadastrar = new javax.swing.JButton();
        jLTitulo = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLUsuario.setText("Usuário:");

        jTUsuario.setColumns(10);

        jLSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSenha.setText("Senha:");

        jLTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTipo.setText("Tipo:");

        jCBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secretária", "Médico" }));

        jBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarLogin(evt);
            }
        });

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLTitulo.setText("Cadastrar Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTipo, 0, 104, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(jLSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jPFSenha))
                            .addGap(1, 1, 1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLTitulo)
                            .addGap(52, 52, 52))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUsuario)
                    .addComponent(jTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSenha)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastrar)
                    .addComponent(jLTipo))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrarLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarLogin
        String usuario = jTUsuario.getText();
        String senha = new String(jPFSenha.getPassword());
        String tipo = ((String) jCBTipo.getSelectedItem()).equals("Secretária") ? "S" : "M" ;
        
        jTUsuario.setText("");
        jPFSenha.setText("");
        
        LoginM L2 = new LoginM(usuario, senha, tipo);
        
        System.out.println(L2);
        
        try{
            login.CadastraLogin(L2);
            JOptionPane.showMessageDialog(null, "Usuário criado com sucesso!!!");
        } catch (Exception err){
            err.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao acessar o banco de dados: " + err.getMessage());
        }
        
    }//GEN-LAST:event_CadastrarLogin

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroLoginV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JComboBox<String> jCBTipo;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
