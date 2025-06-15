
package Visao;

import Controle.FuncionariosC;
import javax.swing.JOptionPane;

public class TelaRemoveFuncionarioV extends javax.swing.JInternalFrame {

    private FuncionariosC FC1;
    
    public TelaRemoveFuncionarioV() {
        initComponents();
        FC1 = new FuncionariosC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLIDRemove = new javax.swing.JLabel();
        jTIDRemove = new javax.swing.JTextField();
        jBRemover = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLTitulo.setText("Remover Funcionário");

        jLIDRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDRemove.setText("CPF do Funcionário:");

        jBRemover.setText("Remover");
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerFuncionario(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLIDRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDRemove)
                    .addComponent(jTIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRemover))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removerFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerFuncionario
        String cpf = jTIDRemove.getText();
        
        try{
            FC1.DeletaFuncionario(cpf);
            JOptionPane.showMessageDialog(null, "FUNCIONÁRIO REMOVIDO COM SUCESSO!!!");
        } catch (Exception err){
            err.printStackTrace();
        }
    }//GEN-LAST:event_removerFuncionario

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRemover;
    private javax.swing.JLabel jLIDRemove;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTIDRemove;
    // End of variables declaration//GEN-END:variables
}
