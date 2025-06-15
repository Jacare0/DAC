
package Visao;

import Modelo.FuncionariosM;
import javax.swing.JOptionPane;

public class TelaAtualizaFuncionarioV extends javax.swing.JInternalFrame {

    public TelaAtualizaFuncionarioV() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLIDBusca = new javax.swing.JLabel();
        jTIDBusca = new javax.swing.JTextField();
        jLDadosPessoais = new javax.swing.JLabel();
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
        jLBairro = new javax.swing.JLabel();
        jTBairro = new javax.swing.JTextField();
        jLCidade = new javax.swing.JLabel();
        jTCidade = new javax.swing.JTextField();
        jLEstados = new javax.swing.JLabel();
        jCBEstados = new javax.swing.JComboBox<>();
        jLEmpresa = new javax.swing.JLabel();
        jLSal = new javax.swing.JLabel();
        jTSal = new javax.swing.JTextField();
        jLFunc = new javax.swing.JLabel();
        jTFunc = new javax.swing.JTextField();
        jBAtualizar = new javax.swing.JButton();
        jLDataContr = new javax.swing.JLabel();
        jTDataContr = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLTitulo.setText("Atualizar Funcionário");

        jLIDBusca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDBusca.setText("CPF do Funcionário:");

        jLDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLDadosPessoais.setText("Dados Pessoais");

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

        jLBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLBairro.setText("Bairro:");

        jLCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLCidade.setText("Cidade:");

        jLEstados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLEstados.setText("Estado:");

        jCBEstados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC  ", "AL  ", "AM  ", "AP  ", "BA  ", "CE  ", "DF  ", "ES  ", "GO  ", "MA  ", "MG  ", "MS  ", "MT  ", "PA  ", "PB  ", "PE  ", "PI  ", "PR  ", "RJ  ", "RN  ", "RO  ", "RR  ", "RS  ", "SC  ", "SE  ", "SP  ", "TO" }));

        jLEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLEmpresa.setText("Empresa");

        jLSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSal.setText("Salário:");

        jLFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLFunc.setText("Função:");

        jBAtualizar.setText("Atualizar");
        jBAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarFuncionario(evt);
            }
        });

        jLDataContr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDataContr.setText("Data de Contratação:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLIDBusca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTIDBusca, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(jTSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                                .addComponent(jLDadosPessoais)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLBairro)
                                .addGap(18, 18, 18)
                                .addComponent(jTBairro))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLEndereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCEP)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLRua)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLNum)
                                        .addGap(38, 38, 38)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTRua, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(jTNum))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLCidade)
                                        .addGap(12, 12, 12)
                                        .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLEstados)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEmpresa)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLSal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLFunc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTDataContr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTSal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jBAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLDataContr)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 26, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLEmpresa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLSal)
                            .addComponent(jTSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFunc)
                            .addComponent(jTDataContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLEndereco)
                                .addComponent(jLDadosPessoais))
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
                                .addComponent(jTNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLDataContr)
                                .addComponent(jTFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLBairro)
                                .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLCidade)
                                .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLEstados)
                                .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
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
                                .addComponent(jTTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEmail)
                    .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAtualizar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarFuncionario
            
            // Get Dados Pessoais
            String nome = jTNome.getText();
            String cpf = jTCPF.getText();
            
            int idade = -123;
            try {
                idade = Integer.parseInt(jTIdade.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para a idade.");
                return;
            }
 
            String sexo = jTSexo.getText();
            String dataNasc = jTDataNasc.getText();
            
            
            int tel = -131231223;
            try {
                tel = Integer.parseInt(jTTel.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o telefone.");
                return;
            }
            String email = jTEmal.getText();
            
            // Get Endereço
            String cep = jTCEP.getText();
            String rua = jTRua.getText();
            
            int num = -666;
            try {
                num = Integer.parseInt(jTNum.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o número.");
                return;
            }
            
            String bairro = jTBairro.getText();
            String cidade = jTCidade.getText();
            String estado = (String) jCBEstados.getSelectedItem();
            
            
            // Get Informações da Empresa
            float sal = 0;
            
            try {
                sal = Float.parseFloat(jTSal.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o salário.");
                return;
            }
            String func = jTFunc.getText();
            String dataCont = jTDataContr.getText();
            
            FuncionariosM F1 = new FuncionariosM(dataCont,sal,func,nome,cpf,idade,sexo,dataNasc,tel,email,rua,num,bairro,cep,cidade,estado);
    }//GEN-LAST:event_atualizarFuncionario


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizar;
    private javax.swing.JComboBox<String> jCBEstados;
    private javax.swing.JLabel jLBairro;
    private javax.swing.JLabel jLCEP;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCidade;
    private javax.swing.JLabel jLDadosPessoais;
    private javax.swing.JLabel jLDataContr;
    private javax.swing.JLabel jLDataNasc;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLEmpresa;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLEstados;
    private javax.swing.JLabel jLFunc;
    private javax.swing.JLabel jLIDBusca;
    private javax.swing.JLabel jLIdade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLNum;
    private javax.swing.JLabel jLRua;
    private javax.swing.JLabel jLSal;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTel;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTBairro;
    private javax.swing.JTextField jTCEP;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTCidade;
    private javax.swing.JTextField jTDataContr;
    private javax.swing.JTextField jTDataNasc;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTFunc;
    private javax.swing.JTextField jTIDBusca;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNum;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTSal;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTextField jTTel;
    // End of variables declaration//GEN-END:variables
}
