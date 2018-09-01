
package View;

import View.CadastroCliente.ViewAddCliente;
import View.VenderProduto.ViewPerguntaCliente;
import View.ResumoVendas.ViewMostrarDados;
import View.Gerenciamento.ViewEditarProduto;
import View.Gerenciamento.ViewAddProduto;
import View.Gerenciamento.ViewRemoveProduto;
import DAO.DaoVerdoce;


public class ViewIndex extends javax.swing.JFrame {

 
    public ViewIndex() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();
        btnCompraVenda = new javax.swing.JButton();
        btnVender1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGere = new javax.swing.JMenu();
        menuRemoveP = new javax.swing.JMenu();
        menuAddP = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuEditarP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Charlemagne Std", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/4.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(85, 193, 180));

        btnVender.setBackground(new java.awt.Color(255, 255, 255));
        btnVender.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVender.setText("Vender produto");
        btnVender.setBorderPainted(false);
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnCompraVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnCompraVenda.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCompraVenda.setText("Resumo de vendas");
        btnCompraVenda.setBorderPainted(false);
        btnCompraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraVendaActionPerformed(evt);
            }
        });

        btnVender1.setBackground(new java.awt.Color(255, 255, 255));
        btnVender1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnVender1.setText("Cadastrar cliente");
        btnVender1.setBorderPainted(false);
        btnVender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVender1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVender1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnVender, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                .addComponent(btnCompraVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(btnVender1)
                .addGap(31, 31, 31)
                .addComponent(btnVender)
                .addGap(30, 30, 30)
                .addComponent(btnCompraVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnVender.getAccessibleContext().setAccessibleName("");
        btnCompraVenda.getAccessibleContext().setAccessibleName("");
        btnVender1.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuGere.setText("Gerenciamento");

        menuRemoveP.setText("Produto");

        menuAddP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        menuAddP.setText("Adicionar produto");
        menuAddP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddPActionPerformed(evt);
            }
        });
        menuRemoveP.add(menuAddP);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Remover produto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuRemoveP.add(jMenuItem2);

        menuEditarP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        menuEditarP.setText("Editar produto");
        menuEditarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarPActionPerformed(evt);
            }
        });
        menuRemoveP.add(menuEditarP);

        menuGere.add(menuRemoveP);

        jMenuBar1.add(menuGere);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        ViewPerguntaCliente vv = new ViewPerguntaCliente();
        vv.setVisible(true);
        vv.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnCompraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraVendaActionPerformed
        // TODO add your handling code here:
        ViewMostrarDados vm = new ViewMostrarDados();
        vm.setVisible(true);
        vm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCompraVendaActionPerformed

    private void btnVender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVender1ActionPerformed
        // TODO add your handling code here:
        ViewAddCliente vc = new ViewAddCliente();
        vc.setVisible(true);
        vc.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnVender1ActionPerformed

    private void menuEditarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarPActionPerformed
        // TODO add your handling code here:
        ViewLogin.escolha = menuEditarP.getText();
        ViewLogin vl = new ViewLogin();
        vl.setVisible(true);
        vl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuEditarPActionPerformed
    
    
    private void menuAddPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddPActionPerformed
        // TODO add your handling code here:
        ViewLogin.escolha = menuAddP.getText();
        ViewLogin vl = new ViewLogin();
        vl.setVisible(true);
        vl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuAddPActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ViewLogin.escolha = menuRemoveP.getText();
        ViewLogin vl = new ViewLogin();
        vl.setVisible(true);
        vl.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompraVenda;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVender1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuAddP;
    private javax.swing.JMenuItem menuEditarP;
    private javax.swing.JMenu menuGere;
    private javax.swing.JMenu menuRemoveP;
    // End of variables declaration//GEN-END:variables
}
