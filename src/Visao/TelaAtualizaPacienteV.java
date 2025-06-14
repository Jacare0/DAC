/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Visao;

/**
 *
 * @author Mateus
 */
public class TelaAtualizaPacienteV extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAtualizarPacienteV2
     */
    public TelaAtualizaPacienteV() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLIDBusca = new javax.swing.JLabel();
        jTIDBusca = new javax.swing.JTextField();
        jLDadosPessoais1 = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        jLCPF = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jLIdade = new javax.swing.JLabel();
        jTIdade = new javax.swing.JTextField();
        jLSexo = new javax.swing.JLabel();
        jTSexo = new javax.swing.JTextField();
        jLDataNasc = new javax.swing.JLabel();
        jTDataNasc = new javax.swing.JTextField();
        jLTel = new javax.swing.JLabel();
        jTTel = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLEndereco = new javax.swing.JLabel();
        jLCEP = new javax.swing.JLabel();
        jTCEP = new javax.swing.JTextField();
        jLRua = new javax.swing.JLabel();
        jTRua = new javax.swing.JTextField();
        jLNum = new javax.swing.JLabel();
        jTNum = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jLEstados = new javax.swing.JLabel();
        jCBEstados = new javax.swing.JComboBox<>();
        jBAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLTitulo.setText("Atualizar Paciente");

        jLIDBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDBusca.setText("CPF do Paciente:");

        jLDadosPessoais1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLDadosPessoais1.setText("Dados Pessoais");

        jLNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNome.setText("Nome:");

        jLCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCPF.setText("CPF:");

        jLIdade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIdade.setText("Idade:");

        jLSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSexo.setText("Sexo:");

        jLDataNasc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDataNasc.setText("Data de Nascimento:");

        jLTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLTel.setText("Telefone:");

        jLEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLEmail.setText("Email:");

        jLEndereco.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLEndereco.setText("Endereço");

        jLCEP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCEP.setText("CEP:");

        jLRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLRua.setText("Rua:");

        jLNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNum.setText("Nº:");

        jLCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLEstados.setText("Estado:");

        jCBEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC  ", "AL  ", "AM  ", "AP  ", "BA  ", "CE  ", "DF  ", "ES  ", "GO  ", "MA  ", "MG  ", "MS  ", "MT  ", "PA  ", "PB  ", "PE  ", "PI  ", "PR  ", "RJ  ", "RN  ", "RO  ", "RR  ", "RS  ", "SC  ", "SE  ", "SP  ", "TO" }));

        jBAtualizar.setText("Atualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLIDBusca)
                        .addGap(31, 31, 31)
                        .addComponent(jTIDBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCPF)
                            .addComponent(jLNome)
                            .addComponent(jLIdade)
                            .addComponent(jLSexo)
                            .addComponent(jLDataNasc)
                            .addComponent(jLTel)
                            .addComponent(jLEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTSexo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTCPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTIdade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLDadosPessoais1)
                    .addComponent(jLTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLEndereco)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLCEP)
                        .addGap(30, 30, 30)
                        .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLRua)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLNum)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLEstados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDBusca)
                    .addComponent(jTIDBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCEP)
                            .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRua)
                            .addComponent(jTRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNum)
                            .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCidade)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEstados)
                            .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLDadosPessoais1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCPF)
                            .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdade)
                            .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSexo)
                            .addComponent(jTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDataNasc)
                            .addComponent(jTDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTel)
                            .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBAtualizar))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JComboBox<String> jCBEstados;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLDadosPessoais1;
    private javax.swing.JLabel jLDataNasc;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLEstados;
    private javax.swing.JLabel jLIDBusca;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNum;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTCEP;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTDataNasc;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTIDBusca;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNum;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTextField jTTel;
    // End of variables declaration//GEN-END:variables
}
