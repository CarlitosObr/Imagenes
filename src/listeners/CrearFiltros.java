/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listeners;

import fft.NumeroComplejo;
import filtros.Butterworth;
import filtros.FiltroIdealPasaAltas;
import filtros.FiltroIdealPasaBajas;
import filtros.Gaussiano;
import gui.JInternalFrameFrecuencias;
import gui.JInternalFrameImagen;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author carli
 */
public class CrearFiltros implements ActionListener{
    public JInternalFrameFrecuencias princip;
    public Image origin;
    public BufferedImage editor;
    public Dimension d;
    
    
    public CrearFiltros(JInternalFrameFrecuencias princip,Image origin){
        this.princip = princip;   
        editor = herramientas.HerramientasImagen.toBufferedImage(origin);
        d = new Dimension(this.editor.getWidth(),this.editor.getHeight());
       // this.filtroschidos = princip.getFiltroschidos();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(this.princip.getIPA().isSelected()){
            FiltroIdealPasaAltas fipa = new FiltroIdealPasaAltas(validarRadio(),d);
            fipa.crearFiltro();
            this.princip.getFiltroschidos().remove("IdealPasaAltas");
            this.princip.getFiltroschidos().put("IdealPasaAltas", fipa.getFiltroEspacial());
            //this.princip.getFiltroschidos().put("IdealPasaAltas", fipa.getFiltroEspacial());
            JInternalFrameImagen nuevo = new JInternalFrameImagen(fipa.getImagen());
            nuevo.setVisible(true);
            this.princip.getPrincial().getjDesktopPanePrincipal().add(nuevo);   
        }else if(this.princip.getIPB().isSelected()){
            FiltroIdealPasaBajas fipb = new FiltroIdealPasaBajas(validarRadio(),d);
            fipb.crearFiltro();
            this.princip.getFiltroschidos().remove("IdealPasaBajas");
            this.princip.getFiltroschidos().put("IdealPasaBajas", fipb.getFiltroEspacial());
            JInternalFrameImagen nuevo = new JInternalFrameImagen(fipb.getImagen());
            nuevo.setVisible(true);
            this.princip.getPrincial().getjDesktopPanePrincipal().add(nuevo);  
        }else if(this.princip.getButter().isSelected()){
            Butterworth b = new Butterworth(validarRadio(),d,verAccion(),(int)this.princip.getOrden().getValue());
            b.crearFiltro();
            this.princip.getFiltroschidos().remove("Butterworth");
            this.princip.getFiltroschidos().put("Butterworth", b.getFiltroEspacial());
            JInternalFrameImagen nuevo = new JInternalFrameImagen(b.getImagen());
            nuevo.setVisible(true);
            this.princip.getPrincial().getjDesktopPanePrincipal().add(nuevo);  
        }else if(this.princip.getGauss().isSelected()){
            Gaussiano g = new Gaussiano(validarRadio(),verAccion(),d);
            System.out.println(validarRadio());
            g.crearFiltro();
            this.princip.getFiltroschidos().remove("Gaussiano");
            this.princip.getFiltroschidos().put("Gaussiano", g.getFiltroEspacial());
            JInternalFrameImagen nuevo = new JInternalFrameImagen(g.getImagen());
            nuevo.setVisible(true);
            this.princip.getPrincial().getjDesktopPanePrincipal().add(nuevo);
        }else{
             JOptionPane.showMessageDialog(this.princip.getPrincial().getjDesktopPanePrincipal(), "Selecciona un filtro!");
        }
    }
    
    public int validarRadio(){
        if(this.princip.getRadio().getValue().equals(d.width)){
            return (int)this.princip.getRadio().getValue() - d.width;
        }else{
            return (int)this.princip.getRadio().getValue();
        }
    }

    public boolean verAccion() {
        if(this.princip.getPasaonopasa().isSelected()){
            return true;
        }else{
            return false;
        }
    }
    
   
}
