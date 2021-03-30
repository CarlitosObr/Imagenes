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
        }
    }
}
