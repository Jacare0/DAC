
package Visao;

import Controle.FuncionariosC;
import Controle.DadosPessoaisC;
import Controle.EnderecoC;
import Modelo.DadosPessoaisM;
import Modelo.EnderecoM;
import Modelo.FuncionariosM;

import javax.swing.JOptionPane;
public class TelaCadastroFuncionarioV extends javax.swing.JInternalFrame {

    private FuncionariosC FC1;
    private EnderecoC EC1;
    private DadosPessoaisC DP1;
    
    public TelaCadastroFuncionarioV() {
        initComponents();
        FC1 = new FuncionariosC();
        EC1 = new EnderecoC();
        DP1 = new DadosPessoaisC();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLDadosPessoais = new javax.swing.JLabel();
        jLIDDados = new javax.swing.JLabel();
        jTIDDados = new javax.swing.JTextField();
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
        jTEmal = new javax.swing.JTextField();
        jLEndereco = new javax.swing.JLabel();
        jLIDEnd = new javax.swing.JLabel();
        jTIDEnd = new javax.swing.JTextField();
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
        jLIDFunc = new javax.swing.JLabel();
        jTIDFunc = new javax.swing.JTextField();
        jLSal = new javax.swing.JLabel();
        jTSal = new javax.swing.JTextField();
        jLFunc = new javax.swing.JLabel();
        jTFunc = new javax.swing.JTextField();
        jLDataContr = new javax.swing.JLabel();
        jTDataContr = new javax.swing.JTextField();
        jBCadastrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLTitulo.setText("Cadastrar Funcionário");

        jLDadosPessoais.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLDadosPessoais.setText("Dados Pessoais");

        jLIDDados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDDados.setText("ID Dados Pessoais:");

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

        jLIDEnd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDEnd.setText("ID Endereço:");

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

        jLIDFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLIDFunc.setText("ID Funcionario:");

        jLSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLSal.setText("Salário:");

        jLFunc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLFunc.setText("Função:");

        jLDataContr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLDataContr.setText("Data Contratação:");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionario(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTTel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTEmal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jTNome, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLIDDados)
                                .addGap(18, 18, 18)
                                .addComponent(jTIDDados)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLEstados, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCidade)
                                        .addComponent(jLRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLBairro, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLIDEnd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTIDEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTNum, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTRua, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(jTCEP)
                                        .addComponent(jCBEstados, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLSal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLFunc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                    .addComponent(jLIDFunc)
                                    .addComponent(jLDataContr))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTDataContr, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jTFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                    .addComponent(jTSal)
                                    .addComponent(jTIDFunc)))
                            .addComponent(jBCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEndereco)
                    .addComponent(jLDadosPessoais)
                    .addComponent(jLEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLIDEnd)
                        .addComponent(jTIDEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLIDFunc)
                        .addComponent(jTIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLIDDados)
                        .addComponent(jTIDDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jLBairro)
                            .addComponent(jTBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCidade)
                            .addComponent(jTCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEstados)
                            .addComponent(jCBEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLNome)
                                    .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLCPF)
                                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLIdade)
                                    .addComponent(jTIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLSal)
                                    .addComponent(jTSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLFunc)
                                    .addComponent(jTFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLDataContr)
                                    .addComponent(jTDataContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                            .addComponent(jTEmal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBCadastrar))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarFuncionario(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionario
            
            // Get Dados Pessoais
            int idDados = -1;
            try{
                idDados = Integer.parseInt(jTIDDados.getText());
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o ID Dados.");
                return;
            }
            
            String nome = jTNome.getText();
            String CPF = jTCPF.getText();
            
            int idade = -1;
            try {
                idade = Integer.parseInt(jTIdade.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para a idade.");
                return;
            }
 
            String sexo = jTSexo.getText();
            String dataNascimento = jTDataNasc.getText();
            String telefone = jTTel.getText();
            String email = jTEmal.getText();
            
            // Get Endereço
            
            int idEndereco = -1;
            try{
                idEndereco = Integer.parseInt(jTIDEnd.getText());
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o ID Endereço.");
                return;
            }
            
            String CEP = jTCEP.getText();
            String rua = jTRua.getText();
            
            int numCasa = -1;
            try {
                numCasa = Integer.parseInt(jTNum.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o número.");
                return;
            }
            
            String bairro = jTBairro.getText();
            String cidade = jTCidade.getText();
            String estado = (String) jCBEstados.getSelectedItem();
            
            
            // Get Informações da Empresa
            
            int idFuncionario = -1;
            try{
                idFuncionario = Integer.parseInt(jTIDFunc.getText());
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o ID Funcionario.");
                return;
            }
            
            float salario = 0;
            
            try {
                salario = Float.parseFloat(jTSal.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico válido para o salário.");
                return;
            }
            String func = jTFunc.getText();
            String dataContratacao = jTDataContr.getText();
            
            EnderecoM E1 = new EnderecoM(idEndereco,rua, numCasa, bairro, CEP, cidade, estado);
            DadosPessoaisM DP1 = new DadosPessoaisM(idDados, nome, CPF, idade, sexo, dataNascimento, telefone, email, E1);
            
            FuncionariosM F1 = new FuncionariosM(idFuncionario, dataContratacao, salario, func, DP1);
            try{
                FC1.CadastraFuncionarios(F1);
                JOptionPane.showMessageDialog(null, "FUNCIONARIO CADASTRADO COM SUCESSO!!!");
            } catch(Exception  err){
                err.printStackTrace();
            }
    }//GEN-LAST:event_cadastrarFuncionario


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
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
    private javax.swing.JLabel jLIDDados;
    private javax.swing.JLabel jLIDEnd;
    private javax.swing.JLabel jLIDFunc;
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
    private javax.swing.JTextField jTEmal;
    private javax.swing.JTextField jTFunc;
    private javax.swing.JTextField jTIDDados;
    private javax.swing.JTextField jTIDEnd;
    private javax.swing.JTextField jTIDFunc;
    private javax.swing.JTextField jTIdade;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTextField jTNum;
    private javax.swing.JTextField jTRua;
    private javax.swing.JTextField jTSal;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTextField jTTel;
    // End of variables declaration//GEN-END:variables
}
