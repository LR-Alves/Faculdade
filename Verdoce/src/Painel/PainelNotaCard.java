
package Painel;

import Model.ModelNota;
import Utils.Format;
import View.ResumoVendas.ViewMostrarDados;
import View.ResumoVendas.ViewMostrarNota;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Window;


public class PainelNotaCard extends javax.swing.JPanel {
    
    private ModelNota nota;
    private boolean sN = false;
    
    public PainelNotaCard(ModelNota nota) {
        setNotaC(nota);
        initComponents();
    }
    
    
    public void setNotaC(ModelNota notaC){
        this.nota = notaC;
    }
    
    public ModelNota getNotaC(){
        return this.nota;
    }
    
    public void setLblNome(){
        lblNome.setText(nota.getCliente());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNF = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(137, 102));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel4.setText("NF: ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel5.setText("CPF: ");

        lblNome.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        lblNome.setText(this.nota.getCliente());

        lblNF.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        lblNF.setText(this.nota.getNF());

        lblCPF.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        lblCPF.setText(this.nota.getCPF());
        try{lblCPF.setText(Format.formatCpf(this.nota.getCPF()));}catch(Exception e){lblCPF.setText(this.nota.getCPF());}

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-note.png"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jLabel2.setText("Cliente: ");

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCPF)
                    .addComponent(lblNF)
                    .addComponent(lblNome))
                .addGap(19, 19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNF)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(jLabel5))))
                .addGap(23, 28, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ViewMostrarNota.mostrar = getNotaC();
        for(Window w: Window.getWindows()){
            w.dispose();
        }
        ViewMostrarNota vm = new ViewMostrarNota();
        vm.setVisible(true);
        vm.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNF;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}
