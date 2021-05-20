/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import fft.Gestor;
import fft.GestorGrises;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author carli
 */
public class JInternalFrameFrecuencias extends javax.swing.JInternalFrame implements ActionListener {

    /**
     * Creates new form JInternalFrameFrecuencias
     */
    Image imagen;
    JInternalFrameImagen internal;
    JFramePrincipal princial;

    public JInternalFrameFrecuencias(Image imagen, JInternalFrameImagen internal, JFramePrincipal principal) {
        initComponents();
        this.imagen = imagen;
        this.internal = internal;
        this.princial = principal;
        this.aplicar.addActionListener(this);
        this.regresa.addActionListener(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipos = new javax.swing.ButtonGroup();
        ajustar = new javax.swing.JToggleButton();
        color = new javax.swing.JRadioButton();
        grises = new javax.swing.JRadioButton();
        aplicar = new javax.swing.JButton();
        regresa = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        ajustar.setText("AjustarCuadrante");

        tipos.add(color);
        color.setText("Color");
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });

        tipos.add(grises);
        grises.setText("Grises");

        aplicar.setText("Aplicar");

        regresa.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(color)
                        .addGap(75, 75, 75)
                        .addComponent(grises))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(ajustar)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(regresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(aplicar)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(grises))
                .addGap(27, 27, 27)
                .addComponent(ajustar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aplicar)
                    .addComponent(regresa))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ajustar;
    private javax.swing.JButton aplicar;
    private javax.swing.JRadioButton color;
    private javax.swing.JRadioButton grises;
    private javax.swing.JButton regresa;
    public static javax.swing.ButtonGroup tipos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton boton = (JButton) e.getSource();
        Gestor g = new Gestor(herramientas.HerramientasImagen.toBufferedImage(this.imagen));
        GestorGrises gg = new GestorGrises(herramientas.HerramientasImagen.toBufferedImage(this.imagen));

        if (boton.getText().equals("Aplicar")) {
            JInternalFrameImagen nuevo;
            Image nuevita = null;

            if (this.color.isSelected()) {

                //g.obtenerImagenFrecuencias(this.ajustar.isSelected());
                nuevita = herramientas.HerramientasImagen.toImage(g.obtenerImagenFrecuencias(this.ajustar.isSelected()));

            } else if (this.grises.isSelected()) {
                nuevita = herramientas.HerramientasImagen.toImage(gg.obtenerImagenFrecuencias(this.ajustar.isSelected()));
            }
            nuevo = new JInternalFrameImagen(nuevita);
            nuevo.setVisible(true);
            this.princial.getjDesktopPanePrincipal().add(nuevo);
        } else if (boton.getText().equals("Regresar")) {
            JInternalFrameImagen nuevo2;
            Image nuevita2 = null;
            if (this.color.isSelected()) {

                g.obtenerImagenFrecuencias(this.ajustar.isSelected());
                nuevita2 = herramientas.HerramientasImagen.toImage(g.obtenerImagenEspacial());

            } else if (this.grises.isSelected()) {
                gg.obtenerImagenFrecuencias(this.ajustar.isSelected());
                nuevita2 = herramientas.HerramientasImagen.toImage(gg.obtenerImagenEspacial());
            }
            nuevo2 = new JInternalFrameImagen(nuevita2);
            nuevo2.setVisible(true);
            this.princial.getjDesktopPanePrincipal().add(nuevo2);
        }

    }
}
