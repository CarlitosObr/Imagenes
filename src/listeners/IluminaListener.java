/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import espacial.Histograma;
import graficar.Grafica;
import gui.JFramePrincipal;
import gui.JInternalFrameIluminacion;
import gui.JInternalFrameImagen;
import gui.JInternalFrameLineal;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author carli
 */
public class IluminaListener implements ActionListener{
    private JFramePrincipal principal;

    public IluminaListener(JFramePrincipal principal) {
        this.principal = principal;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem  item = (JMenuItem) e.getSource();
        if(item.getText().equals("Iluminación")){
            JInternalFrameImagen imagen = (JInternalFrameImagen) this.principal.getjDesktopPanePrincipal().getSelectedFrame();
            JInternalFrameIluminacion in = new JInternalFrameIluminacion(imagen,imagen.getImagenOriginal());
            in.setVisible(true);
            this.principal.getjDesktopPanePrincipal().add(in);
        }else if(item.getText().equals("Lineal")){
            JInternalFrameImagen internal = (JInternalFrameImagen) this.principal.getjDesktopPanePrincipal().getSelectedFrame();
            // se puede extraer la imagen orginal         
            Image imagen = internal.getImagenOriginal();
            JInternalFrameLineal li = new JInternalFrameLineal(internal,imagen);
            //double[] umbral = BinarioAutomatico.devuelveHisto(imagen);
           // JOptionPane.showMessageDialog(this.principal.getjDesktopPanePrincipal(), "El umbral es: "+BinarioAutomatico.otsu(umbral));
            //Image nueva = espacial.Expansion.Expande(imagen, 100,255);
            
            //JInternalFrameImagen i = new JInternalFrameImagen(nueva);
            //i.setVisible(true);
            li.setVisible(true);
            this.principal.getjDesktopPanePrincipal().add(li);
        }
    }
}
