
package Visao;

public class TelaPrincipalV extends javax.swing.JFrame {

    private TelaConsultaV telaConsultas;
    
    private TelaCadastroPacienteV telaCadastrarPaciente;
    private TelaBuscaPacienteV telaBuscarPaciente;
    private TelaAtualizaPacienteV telaAtualizarPaciente;
    private TelaRemovePacienteV telaRemoverPaciente;
    
    private TelaCadastroMedicoV telaCadastrarMedico;
    private TelaBuscaMedicoV telaBuscarMedico;
    private TelaAtualizaMedicoV telaAtualizarMedico;
    private TelaRemoveMedicoV telaRemoverMedico;
    
    private TelaCadastroFuncionarioV telaCadastrarFuncionario;
    private TelaBuscaFuncionarioV telaBuscarFuncionario;
    private TelaAtualizaFuncionarioV telaAtualizarFuncionario;
    private TelaRemoveFuncionarioV telaRemoverFuncionario;
            
    public TelaPrincipalV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMConsultas = new javax.swing.JMenu();
        jMITelaConsultas = new javax.swing.JMenuItem();
        jMPacientes = new javax.swing.JMenu();
        jMICadastraP = new javax.swing.JMenuItem();
        jMIConsultaP = new javax.swing.JMenuItem();
        jMIAtualizaP = new javax.swing.JMenuItem();
        jMIRemoveP = new javax.swing.JMenuItem();
        jMMedicos = new javax.swing.JMenu();
        jMICadastraM = new javax.swing.JMenuItem();
        jMIConsultaM = new javax.swing.JMenuItem();
        jMIAtualizaM = new javax.swing.JMenuItem();
        jMIRemoveM = new javax.swing.JMenuItem();
        jMFuncionarios = new javax.swing.JMenu();
        jMICadastraF = new javax.swing.JMenuItem();
        jMIConsultaF = new javax.swing.JMenuItem();
        jMIAtualizaF = new javax.swing.JMenuItem();
        jMIRemoveF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePrincipal"); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jMConsultas.setText("Consultas");

        jMITelaConsultas.setText("Ver Consultas");
        jMITelaConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaConsultas(evt);
            }
        });
        jMConsultas.add(jMITelaConsultas);

        jMenuBar.add(jMConsultas);

        jMPacientes.setText("Pacientes");

        jMICadastraP.setText("Cadastrar Paciente");
        jMICadastraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaCadastrarPaciente(evt);
            }
        });
        jMPacientes.add(jMICadastraP);

        jMIConsultaP.setText("Consultar Paciente");
        jMIConsultaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaConsultarPaciente(evt);
            }
        });
        jMPacientes.add(jMIConsultaP);

        jMIAtualizaP.setText("Atualizar Paciente");
        jMIAtualizaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaAtualizarPaciente(evt);
            }
        });
        jMPacientes.add(jMIAtualizaP);

        jMIRemoveP.setText("Remover Paciente");
        jMIRemoveP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaRemoverPaciente(evt);
            }
        });
        jMPacientes.add(jMIRemoveP);

        jMenuBar.add(jMPacientes);

        jMMedicos.setText("Médicos");

        jMICadastraM.setText("Cadastrar Médico");
        jMICadastraM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaCadastrarMedico(evt);
            }
        });
        jMMedicos.add(jMICadastraM);

        jMIConsultaM.setText("Consultar Médico");
        jMIConsultaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaConsultarMedico(evt);
            }
        });
        jMMedicos.add(jMIConsultaM);

        jMIAtualizaM.setText("Atualizar Médico");
        jMIAtualizaM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaAtualizarMedico(evt);
            }
        });
        jMMedicos.add(jMIAtualizaM);

        jMIRemoveM.setText("Remover Médico");
        jMIRemoveM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaRemoverMedico(evt);
            }
        });
        jMMedicos.add(jMIRemoveM);

        jMenuBar.add(jMMedicos);

        jMFuncionarios.setText("Funcionários");

        jMICadastraF.setText("Cadastrar Funcionário");
        jMICadastraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaCadastrarFuncionario(evt);
            }
        });
        jMFuncionarios.add(jMICadastraF);

        jMIConsultaF.setText("Consultar Funcionário");
        jMIConsultaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaConsultarFuncionario(evt);
            }
        });
        jMFuncionarios.add(jMIConsultaF);

        jMIAtualizaF.setText("Atualizar Funcionário");
        jMIAtualizaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaAtualizarFuncionario(evt);
            }
        });
        jMFuncionarios.add(jMIAtualizaF);

        jMIRemoveF.setText("Remover Funcionário");
        jMIRemoveF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaRemoverFuncionario(evt);
            }
        });
        jMFuncionarios.add(jMIRemoveF);

        jMenuBar.add(jMFuncionarios);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirTelaConsultas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaConsultas
        if (telaConsultas == null || telaConsultas.isClosed()) {
            telaConsultas = new TelaConsultaV();
            jDesktopPane1.add(telaConsultas);
            telaConsultas.setVisible(true);
        } 
        else {
            try {
                telaConsultas.setSelected(true); // foco na tela se já estiver aberta
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaConsultas

    private void AbrirTelaCadastrarPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaCadastrarPaciente
        if (telaCadastrarPaciente == null || telaCadastrarPaciente.isClosed()) {
            telaCadastrarPaciente = new TelaCadastroPacienteV();
            jDesktopPane1.add(telaCadastrarPaciente);
            telaCadastrarPaciente.setVisible(true);
        } 
        else {
            try {
                telaCadastrarPaciente.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaCadastrarPaciente

    private void AbrirTelaConsultarPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaConsultarPaciente
        if (telaBuscarPaciente == null || telaBuscarPaciente.isClosed()) {
                telaBuscarPaciente = new TelaBuscaPacienteV();
                jDesktopPane1.add(telaBuscarPaciente);
                telaBuscarPaciente.setVisible(true);
        } 
        else {
            try {
                telaBuscarPaciente.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaConsultarPaciente

    private void AbrirTelaAtualizarPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaAtualizarPaciente
        if (telaAtualizarPaciente == null || telaAtualizarPaciente.isClosed()) {
            telaAtualizarPaciente = new TelaAtualizaPacienteV();
            jDesktopPane1.add(telaAtualizarPaciente);
            telaAtualizarPaciente.setVisible(true);
        }
        else {
            try {
                telaAtualizarPaciente.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaAtualizarPaciente

    private void AbrirTelaRemoverPaciente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaRemoverPaciente
        if (telaRemoverPaciente == null || telaRemoverPaciente.isClosed()) {
            telaRemoverPaciente = new TelaRemovePacienteV();
            jDesktopPane1.add(telaRemoverPaciente);
            telaRemoverPaciente.setVisible(true);
        }
        else {
            try {
                telaRemoverPaciente.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaRemoverPaciente

    private void AbrirTelaCadastrarMedico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaCadastrarMedico
        if (telaCadastrarMedico == null || telaCadastrarMedico.isClosed()) {
            telaCadastrarMedico = new TelaCadastroMedicoV();
            jDesktopPane1.add(telaCadastrarMedico);
            telaCadastrarMedico.setVisible(true);
        }
        else {
            try {
                telaCadastrarMedico.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaCadastrarMedico

    private void AbrirTelaConsultarMedico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaConsultarMedico
        if (telaBuscarMedico == null || telaBuscarMedico.isClosed()) {
            telaBuscarMedico = new TelaBuscaMedicoV();
            jDesktopPane1.add(telaBuscarMedico);
            telaBuscarMedico.setVisible(true);
        }
        else {
                try {
                    telaBuscarMedico.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    e.printStackTrace();
                }
            }
    }//GEN-LAST:event_AbrirTelaConsultarMedico

    private void AbrirTelaAtualizarMedico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaAtualizarMedico
        if (telaAtualizarMedico == null || telaAtualizarMedico.isClosed()) {
            telaAtualizarMedico = new TelaAtualizaMedicoV();
            jDesktopPane1.add(telaAtualizarMedico);
            telaAtualizarMedico.setVisible(true);
        }         
       else {
            try {
                telaAtualizarMedico.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaAtualizarMedico

    private void AbrirTelaRemoverMedico(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaRemoverMedico
        if (telaRemoverMedico == null || telaRemoverMedico.isClosed()) {
            telaRemoverMedico = new TelaRemoveMedicoV();
            jDesktopPane1.add(telaRemoverMedico);
            telaRemoverMedico.setVisible(true);
        }    
        else {
            try {
                telaRemoverMedico.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaRemoverMedico

    private void AbrirTelaCadastrarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaCadastrarFuncionario
        if (telaCadastrarFuncionario == null || telaCadastrarFuncionario.isClosed()) {
            telaCadastrarFuncionario = new TelaCadastroFuncionarioV();
            jDesktopPane1.add(telaCadastrarFuncionario);
            telaCadastrarFuncionario.setVisible(true);
        }
        else {
            try {
                telaCadastrarFuncionario.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaCadastrarFuncionario

    private void AbrirTelaConsultarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaConsultarFuncionario
        if (telaBuscarFuncionario == null || telaBuscarFuncionario.isClosed()) {
            telaBuscarFuncionario = new TelaBuscaFuncionarioV();
            jDesktopPane1.add(telaBuscarFuncionario);
            telaBuscarFuncionario.setVisible(true);
        }
        else {
            try {
                telaBuscarFuncionario.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaConsultarFuncionario

    private void AbrirTelaAtualizarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaAtualizarFuncionario
        if (telaAtualizarFuncionario == null || telaAtualizarFuncionario.isClosed()) {
            telaAtualizarFuncionario = new TelaAtualizaFuncionarioV();
            jDesktopPane1.add(telaAtualizarFuncionario);
            telaAtualizarFuncionario.setVisible(true);
        } 
        else {
            try {
                telaAtualizarFuncionario.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaAtualizarFuncionario

    private void AbrirTelaRemoverFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaRemoverFuncionario
        if (telaRemoverFuncionario == null || telaRemoverFuncionario.isClosed()) {
            telaRemoverFuncionario = new TelaRemoveFuncionarioV();
            jDesktopPane1.add(telaRemoverFuncionario);
            telaRemoverFuncionario.setVisible(true);
        }
        else {
            try {
                telaRemoverFuncionario.setSelected(true);
            } catch (java.beans.PropertyVetoException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_AbrirTelaRemoverFuncionario

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMConsultas;
    private javax.swing.JMenu jMFuncionarios;
    private javax.swing.JMenuItem jMIAtualizaF;
    private javax.swing.JMenuItem jMIAtualizaM;
    private javax.swing.JMenuItem jMIAtualizaP;
    private javax.swing.JMenuItem jMICadastraF;
    private javax.swing.JMenuItem jMICadastraM;
    private javax.swing.JMenuItem jMICadastraP;
    private javax.swing.JMenuItem jMIConsultaF;
    private javax.swing.JMenuItem jMIConsultaM;
    private javax.swing.JMenuItem jMIConsultaP;
    private javax.swing.JMenuItem jMIRemoveF;
    private javax.swing.JMenuItem jMIRemoveM;
    private javax.swing.JMenuItem jMIRemoveP;
    private javax.swing.JMenuItem jMITelaConsultas;
    private javax.swing.JMenu jMMedicos;
    private javax.swing.JMenu jMPacientes;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
}
