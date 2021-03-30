/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author carli
 */
public class JInternalFrameBin2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrameBin2
     */
    private JInternalFrameImagen internal;
    private Image imagenOriginal;
    public JInternalFrameBin2(JInternalFrameImagen internal) {
        initComponents();
         this.internal = internal;
        initComponents();
        int umbral = this.jSlider1.getValue();
        this.imagenOriginal = herramientas.HerramientasImagen.copiarImagen(internal.getImagenOriginal());
        this.Binariza2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                 BufferedImage bi = herramientas.HerramientasImagen.toBufferedImage(imagenOriginal);
                 Color color;
                 System.out.println(jSlider1.getValue());
                 for(int j = 0 ; j< bi.getWidth();j++){
                    for(int m = 0 ; m < bi.getHeight();m++){
                        color = new Color(bi.getRGB(j, m));
                       
                        int r = color.getRed(); // (0-255)
                        int g = color.getGreen(); // (0-255)
                        int b = color.getBlue(); // (0-255)
                        int med = (r+g+b)/3;
                        
                        if(med<=jSlider2.getValue() && med>=jSlider1.getValue()){
                          bi.setRGB(j, m, Color.WHITE.getRGB());  
                        }else{
                           bi.setRGB(j, m, 0); 
                        }
                    }
                }
                Image nueva = herramientas.HerramientasImagen.toImage(bi);
                internal.setImagen(nueva); 
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider2 = new javax.swing.JSlider();
        jSlider1 = new javax.swing.JSlider();
        Binariza2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jSlider2.setMajorTickSpacing(25);
        jSlider2.setMaximum(255);
        jSlider2.setPaintLabels(true);
        jSlider2.setValue(0);

        jSlider1.setMajorTickSpacing(25);
        jSlider1.setMaximum(255);
        jSlider1.setPaintLabels(true);
        jSlider1.setValue(0);

        Binariza2.setText("Binarizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Binariza2)
                        .addGap(252, 252, 252))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(53, Short.MAX_VALUE)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Binariza2)
                .addGap(21, 21, 21))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Binariza2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    // End of variables declaration//GEN-END:variables
}
