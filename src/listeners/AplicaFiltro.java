/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import filtros.Butterworth;
import filtros.FiltroIdealPasaAltas;
import filtros.FiltroIdealPasaBajas;
import filtros.Gaussiano;
import gui.JInternalFrameFrecuencias;
import gui.JInternalFrameImagen;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JOptionPane;

/**
 *
 * @author carli
 */
public class AplicaFiltro implements ActionListener {

    public JInternalFrameFrecuencias principal;
    public BufferedImage editor;

    public AplicaFiltro(JInternalFrameFrecuencias principal, Image image) {
        this.principal = principal;
        this.editor = herramientas.HerramientasImagen.toBufferedImage(image);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.principal.getIdealpafiltro().isSelected()) {

            if (this.principal.getFiltroschidos().containsKey(this.principal.getIdealpafiltro().getText())) {
                this.principal.gg.aplicarFiltro(this.principal.getFiltroschidos().get(this.principal.getIdealpafiltro().getText())); 
                Image nuevita1 = null;  
                nuevita1 = herramientas.HerramientasImagen.toImage(this.principal.gg.obtenerImagenEspacial());
                JInternalFrameImagen nuevo = new JInternalFrameImagen(nuevita1);
                nuevo.setVisible(true);
                this.principal.getPrincial().getjDesktopPanePrincipal().add(nuevo);
            }else{
                JOptionPane.showMessageDialog(this.principal.getPrincial().getjDesktopPanePrincipal(), "El filtro no se ha creado aún");
            }
            

        } else if (this.principal.getIpbfiltro().isSelected()) {
            if (this.principal.getFiltroschidos().containsKey(this.principal.getIpbfiltro().getText())) {
                this.principal.gg.aplicarFiltro(this.principal.getFiltroschidos().get(this.principal.getIpbfiltro().getText())); 
                Image nuevita1 = null;  
                nuevita1 = herramientas.HerramientasImagen.toImage(this.principal.gg.obtenerImagenEspacial());
                JInternalFrameImagen nuevo = new JInternalFrameImagen(nuevita1);
                nuevo.setVisible(true);
                this.principal.getPrincial().getjDesktopPanePrincipal().add(nuevo);
            }else{
                JOptionPane.showMessageDialog(this.principal.getPrincial().getjDesktopPanePrincipal(), "El filtro no se ha creado aún");
            }
        } else if (this.principal.getButtfiltro().isSelected()) {
           if (this.principal.getFiltroschidos().containsKey(this.principal.getButtfiltro().getText())) {
                this.principal.gg.aplicarFiltro(this.principal.getFiltroschidos().get(this.principal.getButtfiltro().getText())); 
                Image nuevita1 = null;  
                nuevita1 = herramientas.HerramientasImagen.toImage(this.principal.gg.obtenerImagenEspacial());
                JInternalFrameImagen nuevo = new JInternalFrameImagen(nuevita1);
                nuevo.setVisible(true);
                this.principal.getPrincial().getjDesktopPanePrincipal().add(nuevo);
                
            }else{
                JOptionPane.showMessageDialog(this.principal.getPrincial().getjDesktopPanePrincipal(), "El filtro no se ha creado aún");
            }
        } else if (this.principal.getGaussfiltro().isSelected()) {
            if (this.principal.getFiltroschidos().containsKey(this.principal.getGaussfiltro().getText())) {
                this.principal.gg.aplicarFiltro(this.principal.getFiltroschidos().get(this.principal.getGaussfiltro().getText())); 
                Image nuevita1 = null;  
                nuevita1 = herramientas.HerramientasImagen.toImage(this.principal.gg.obtenerImagenEspacial());
                JInternalFrameImagen nuevo = new JInternalFrameImagen(nuevita1);
                nuevo.setVisible(true);
                this.principal.getPrincial().getjDesktopPanePrincipal().add(nuevo);
            }else{
                JOptionPane.showMessageDialog(this.principal.getPrincial().getjDesktopPanePrincipal(), "El filtro no se ha creado aún");
            }
        } else {
            JOptionPane.showMessageDialog(this.principal.getPrincial().getjDesktopPanePrincipal(), "Selecciona un filtro!");
        }
    }

}
