/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import listeners.BinarioListener;
import listeners.CopiarSegmentoListener;
import listeners.FiltroListener;
import listeners.HistoListener;
import listeners.IluminaListener;
import listeners.InternalFrameListener;
import listeners.ModificarImagenListener;
import listeners.PegarImagenListener;

/**
 *
 * @author working
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipa
     */
    private Image segmento;
    
    public JFramePrincipal() {
        initComponents();
        this.segmento = null;
        BinarioListener bl = new BinarioListener(this);
        IluminaListener il = new IluminaListener(this);
        this.jMenuItem1.addActionListener(new InternalFrameListener(this));
        this.jMenuItem2.addActionListener(new ModificarImagenListener(this));
        this.jMenuItem3.addActionListener(new CopiarSegmentoListener(this));
        this.jMenuItem4.addActionListener(new PegarImagenListener(this));
        this.jMenuItem5.addActionListener(new FiltroListener(this));
        this.jMenuItem6.addActionListener(new HistoListener(this));
        this.jMenuItem7.addActionListener(bl);
        this.jMenuItem8.addActionListener(il);
        this.jMenuItem9.addActionListener(bl);
        this.jMenuItem10.addActionListener(bl);
        this.jMenuItem11.addActionListener(bl);
        this.jMenuItem12.addActionListener(il);
        this.jMenuItem14.addActionListener(il);
        this.jMenuItem15.addActionListener(il);
        this.jMenuItem16.addActionListener(il);
         this.jMenuItem17.addActionListener(il);
         this.jMenuItem18.addActionListener(il);
    }

    public Image getSegmento() {
        return segmento;
    }

    public void setSegmento(Image segmento) {
        this.segmento = segmento;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem13 = new javax.swing.JMenuItem();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1268, Short.MAX_VALUE)
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 728, Short.MAX_VALUE)
        );

        jMenu1.setText("Imagen");

        jMenuItem1.setText("AbrirImagen");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Espacial");

        jMenuItem2.setText("Modificar Pixeles");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Cortar");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Pegar");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Filtros");
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Histograma");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenu5.setText("Binarizar");

        jMenuItem7.setText("1 umbral");
        jMenu5.add(jMenuItem7);

        jMenuItem9.setText("2 umbrales");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Automático");
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Otsu");
        jMenu5.add(jMenuItem11);

        jMenu2.add(jMenu5);

        jMenuItem8.setText("Iluminación");
        jMenu2.add(jMenuItem8);

        jMenu3.setText("Expansión");

        jMenuItem12.setText("Lineal");
        jMenu3.add(jMenuItem12);

        jMenuItem14.setText("Logarítmica");
        jMenu3.add(jMenuItem14);

        jMenuItem15.setText("Exponencial");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenu2.add(jMenu3);

        jMenuItem16.setText("Ecualizar");
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("Convolución");
        jMenu2.add(jMenuItem17);

        jMenuItem18.setText("Sal y pimienta");
        jMenu2.add(jMenuItem18);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jDesktopPanePrincipal
     */
    public javax.swing.JDesktopPane getjDesktopPanePrincipal() {
        return jDesktopPanePrincipal;
    }

    /**
     * @param jDesktopPanePrincipal the jDesktopPanePrincipal to set
     */
    public void setjDesktopPanePrincipal(javax.swing.JDesktopPane jDesktopPanePrincipal) {
        this.jDesktopPanePrincipal = jDesktopPanePrincipal;
    }
}
