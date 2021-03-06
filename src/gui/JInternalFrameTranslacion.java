/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import espacial.Canva;
import java.awt.image.BufferedImage;

/**
 *
 * @author carli
 */
public class JInternalFrameTranslacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameTranslacion
     */
    private JFramePrincipal principal;
    public Image imagen;
    public BufferedImage lienzo;
    public JInternalFrameImagen internal;
    
    public JInternalFrameTranslacion(JFramePrincipal principal, Image imagen,BufferedImage lienzo,JInternalFrameImagen internal) {
        initComponents();
        this.principal = principal;
        this.imagen = imagen;
        this.lienzo = lienzo;
        this.internal = internal;
        Canva t = new Canva(this,herramientas.HerramientasImagen.toBufferedImage(imagen));
        this.jBtransladame.addActionListener(t);
        this.jButtonRotar.addActionListener(t);
        this.jButtonEscalar.addActionListener(t);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtft1 = new javax.swing.JTextField();
        jtft2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtransladame = new javax.swing.JButton();
        jTextFieldDegrees = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonRotar = new javax.swing.JButton();
        jTextFieldX = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldY = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonEscalar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jtft1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtft1ActionPerformed(evt);
            }
        });

        jLabel1.setText("T1");

        jLabel2.setText("T2");

        jBtransladame.setText("Transladar");

        jTextFieldDegrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDegreesActionPerformed(evt);
            }
        });

        jLabel3.setText("Degrees");

        jButtonRotar.setText("Rotar");

        jLabel4.setText("ZoomX");

        jLabel5.setText("ZoomY");

        jButtonEscalar.setText("Escalar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEscalar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jLabel1)
                            .addGap(124, 124, 124)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldDegrees)
                                .addComponent(jtft1)
                                .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtft2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonRotar))
                                .addComponent(jTextFieldY, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(37, 37, 37)
                            .addComponent(jBtransladame, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(jLabel4)
                            .addGap(97, 97, 97)
                            .addComponent(jLabel5))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtft2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jtft1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jBtransladame, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtonRotar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldY, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jTextFieldX))
                .addGap(8, 8, 8)
                .addComponent(jButtonEscalar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtft1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtft1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtft1ActionPerformed

    private void jTextFieldDegreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDegreesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDegreesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtransladame;
    private javax.swing.JButton jButtonEscalar;
    private javax.swing.JButton jButtonRotar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDegrees;
    private javax.swing.JTextField jTextFieldX;
    private javax.swing.JTextField jTextFieldY;
    private javax.swing.JTextField jtft1;
    private javax.swing.JTextField jtft2;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jtft1
     */
    public javax.swing.JTextField getJtft1() {
        return jtft1;
    }

    /**
     * @return the jtft2
     */
    public javax.swing.JTextField getJtft2() {
        return jtft2;
    }

    /**
     * @return the principal
     */
    public JFramePrincipal getPrincipal() {
        return principal;
    }

    public Image getImagen() {
        return imagen;
    }

    public BufferedImage getLienzo() {
        return lienzo;
    }

    public JInternalFrameImagen getInternal() {
        return internal;
    }

    /**
     * @return the jButtonEscalar
     */
    public javax.swing.JButton getjButtonEscalar() {
        return jButtonEscalar;
    }

    /**
     * @return the jButtonRotar
     */
    public javax.swing.JButton getjButtonRotar() {
        return jButtonRotar;
    }

    /**
     * @return the jTextFieldDegrees
     */
    public javax.swing.JTextField getjTextFieldDegrees() {
        return jTextFieldDegrees;
    }

    /**
     * @return the jTextFieldX
     */
    public javax.swing.JTextField getjTextFieldX() {
        return jTextFieldX;
    }

    /**
     * @return the jTextFieldY
     */
    public javax.swing.JTextField getjTextFieldY() {
        return jTextFieldY;
    }
    
    
}
