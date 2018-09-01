
package View.VenderProduto;

import Model.ModelCliente;
import Painel.PainelSim;
import View.CadastroCliente.ViewAddCliente;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;


public class ViewPerguntaCliente extends javax.swing.JFrame {

    public static String nome;
    public static String cpf;

 
    public ViewPerguntaCliente() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        painelSN = new javax.swing.JPanel();
        painelN = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        painelS = new javax.swing.JPanel();
        comboClientes = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        radioBtnSim = new javax.swing.JRadioButton();
        radioBtnNao = new javax.swing.JRadioButton();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 120));

        jPanel2.setBackground(new java.awt.Color(85, 193, 180));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Já é cadastrado?");

        painelSN.setLayout(new java.awt.CardLayout());

        painelN.setBackground(new java.awt.Color(85, 193, 180));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelNLayout = new javax.swing.GroupLayout(painelN);
        painelN.setLayout(painelNLayout);
        painelNLayout.setHorizontalGroup(
            painelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        painelNLayout.setVerticalGroup(
            painelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(painelNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        painelSN.add(painelN, "card2");

        painelS.setBackground(new java.awt.Color(85, 193, 180));

        comboClientes.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        comboClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboClientesItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF: ");

        lblCpf.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("****");

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setText("Continuar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSLayout = new javax.swing.GroupLayout(painelS);
        painelS.setLayout(painelSLayout);
        painelSLayout.setHorizontalGroup(
            painelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSLayout.createSequentialGroup()
                .addGroup(painelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelSLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelSLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(painelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelSLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(lblCpf))
                            .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        painelSLayout.setVerticalGroup(
            painelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(25, 25, 25))
        );

        painelSN.add(painelS, "card3");

        radioBtnSim.setBackground(new java.awt.Color(85, 193, 180));
        radioBtnSim.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        radioBtnSim.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnSim.setText("Sim");
        radioBtnSim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioBtnSimItemStateChanged(evt);
            }
        });

        radioBtnNao.setBackground(new java.awt.Color(85, 193, 180));
        radioBtnNao.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        radioBtnNao.setForeground(new java.awt.Color(255, 255, 255));
        radioBtnNao.setText("Não");
        radioBtnNao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioBtnNaoItemStateChanged(evt);
            }
        });
        radioBtnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelSN, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioBtnSim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioBtnNao))
                    .addComponent(lblTitulo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnSim)
                    .addComponent(radioBtnNao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(painelSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 290, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnNaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnNaoActionPerformed

    private void radioBtnSimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioBtnSimItemStateChanged
        // TODO add your handling code here:
        selectRadioS();
    }//GEN-LAST:event_radioBtnSimItemStateChanged

    private void radioBtnNaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioBtnNaoItemStateChanged
        // TODO add your handling code here:
        selectRadioN();
    }//GEN-LAST:event_radioBtnNaoItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (ModelCliente.getListaClilente().size() > 0) {
            radioBtnSim.setSelected(true);
            carregarCombo();
            for (ModelCliente a : ModelCliente.getListaClilente()) {
                if (comboClientes.getSelectedItem().toString().equals(a.getNomePessoa())) {
                    lblCpf.setText(a.getCpf());
                }
            }
            
        } else {
            radioBtnNao.setSelected(true);
            radioBtnNao.setVisible(false);
            radioBtnSim.setVisible(false);
            lblTitulo.setText("<html><body><b>Não há cadastro de cliente.</b></body></html>");
        }
    }//GEN-LAST:event_formWindowOpened

    public void carregarCombo() {
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        for (ModelCliente a : ModelCliente.getListaClilente()) {
            comboModel.addElement(a.getNomePessoa());
        }
        comboClientes.setModel(comboModel);
    }

    private void comboClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboClientesItemStateChanged
        // TODO add your handling code here:
        for (ModelCliente a : ModelCliente.getListaClilente()) {
            if (comboClientes.getSelectedItem().toString().equals(a.getNomePessoa())) {
                lblCpf.setText(a.getCpf());
            }
        }
    }//GEN-LAST:event_comboClientesItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAddCliente vc = new ViewAddCliente();
        vc.setVisible(true);
        vc.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nome = null;
        cpf = null;
        ViewVender vv = new ViewVender();
        vv.setVisible(true);
        vv.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ViewVender vv = new ViewVender();
        vv.setVisible(true);
        vv.setLocationRelativeTo(null);
        nome = comboClientes.getSelectedItem().toString();
        cpf = lblCpf.getText();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void selectRadioS() {
        if (radioBtnSim.isSelected()) {
            radioBtnNao.setSelected(false);
        }
        painelS.setVisible(true);
        painelN.setVisible(false);
    }

    public void selectRadioN() {
        if (radioBtnNao.isSelected()) {
            radioBtnSim.setSelected(false);
        }
        painelN.setVisible(true);
        painelS.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(ViewPerguntaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPerguntaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPerguntaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPerguntaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPerguntaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelN;
    private javax.swing.JPanel painelS;
    private javax.swing.JPanel painelSN;
    private javax.swing.JRadioButton radioBtnNao;
    private javax.swing.JRadioButton radioBtnSim;
    // End of variables declaration//GEN-END:variables
}
