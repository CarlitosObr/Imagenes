/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacial;

import gui.JFramePrincipal;
import gui.JInternalFrameImagen;
import gui.JInternalFrameTranslacion;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import javax.swing.JButton;

/**
 *
 * @author carli
 */
public class Canva implements ActionListener {

    public JInternalFrameTranslacion principal;
    public BufferedImage i;

    public Canva(JInternalFrameTranslacion principal, BufferedImage i) {
        this.principal = principal;
        this.i = i;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton presionado = (JButton) e.getSource();
        switch (presionado.getText()) {
            case "Transladar":
                BufferedImage aux = principal.getLienzo();

                BufferedImage imgo = herramientas.HerramientasImagen.toBufferedImage(this.principal.internal.getImagenOriginal());
                int t1 = Integer.parseInt(this.principal.getJtft1().getText());
                int t2 = Integer.parseInt(this.principal.getJtft2().getText());
                for (int x = 0; x < aux.getWidth(); x++) {
                    for (int y = 0; y < aux.getHeight(); y++) {
                        try {

                            aux.setRGB(x + t1, y + t2, imgo.getRGB(x, y));
                        } catch (Exception ex) {

                        }
                    }
                }
                this.principal.internal.setImagen(herramientas.HerramientasImagen.toImage(aux));
                for (int x = 0; x < aux.getWidth(); x++) {
                    for (int y = 0; y < aux.getHeight(); y++) {
                        aux.setRGB(x, y, java.awt.Color.WHITE.getRGB());
                    }
                }
                break;
            case "Rotar":
                int max = 0;
                int[][] suavizado = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
                double degrees = Double.parseDouble(principal.getjTextFieldDegrees().getText());
                BufferedImage source = herramientas.HerramientasImagen.toBufferedImage(principal.getImagen());
                if (source.getHeight() > source.getWidth()) {
                    max = source.getHeight();
                } else if (source.getHeight() < source.getWidth()) {
                    max = source.getWidth();
                } else if (source.getHeight() == source.getWidth()) {
                    max = source.getHeight();
                }

                BufferedImage imagenRotada = new BufferedImage(max * 2, max * 2, BufferedImage.TYPE_INT_RGB);
                for (int x = 0; x < imagenRotada.getWidth(); x++) {
                    for (int j = 0; j < imagenRotada.getHeight(); j++) {
                        imagenRotada.setRGB(x, j, new Color(255, 255, 255).getRGB());
                    }
                }
                int nuevoOrigenx = (int) source.getWidth() *1;
                int nuevoOrigeny = (int) source.getHeight() * 1;
                double radianes = Math.toRadians(-1 * degrees);
                for (int y = 0; y < source.getHeight(); y++) {
                    for (int x = 0; x < source.getWidth(); x++) {
                        int nuevax = (int) (x * Math.cos(radianes) - y * Math.sin(radianes)) + nuevoOrigenx;
                        int nuevay = (int) (x * Math.sin(radianes) + y * Math.cos(radianes)) + nuevoOrigeny;
                        imagenRotada.setRGB(nuevax, nuevay, source.getRGB(x, y));
                    }
                }  
                Image nueva = espacial.Convolucion.convolucioname(herramientas.HerramientasImagen.toImage(imagenRotada), suavizado, 25, 0);
                JInternalFrameImagen nuevo1 = new JInternalFrameImagen(nueva);
                nuevo1.setVisible(true);
                this.principal.getPrincipal().getjDesktopPanePrincipal().add(nuevo1);
                break;
            case "Escalar":
                int[][] suavizado2 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
                double zoomx = Double.parseDouble(principal.getjTextFieldX().getText());
                double zoomy = Double.parseDouble(principal.getjTextFieldY().getText());
                BufferedImage source2 = herramientas.HerramientasImagen.toBufferedImage(principal.getImagen());
                int columnas = (int) (source2.getWidth() * zoomx);
                int filas = (int) (source2.getHeight() * zoomy);
                BufferedImage zoomeada = new BufferedImage(columnas,filas,BufferedImage.TYPE_INT_RGB);
                if((zoomx>=1) && (zoomy >=1)){
                    for(int y = 0; y<source2.getHeight(); y++){
                        for(int x=0; x<source2.getWidth(); x++){
                            for(int y1 = 0; y1<(int) zoomy; y1++){
                                for(int x1 = 0; x1<(int)zoomx; x1++){
                                    zoomeada.setRGB((int)(x*zoomx)+x1, (int)(y*zoomy) + y1, source2.getRGB(x, y));
                                }
                            }
                        }
                    }
                }else if((zoomx <1) && (zoomy <1)){
                    int intervalX = (int)Math.rint((double)source2.getWidth()/(double)(source2.getWidth()-zoomeada.getWidth()));
                    int intervalY = (int)Math.rint((double)source2.getHeight()/(double)(source2.getHeight()-zoomeada.getHeight()));
                    int cx = 0;
                    int cy = 0;
                    
                    for(int y = 0; y< zoomeada.getHeight(); y++){
                        for(int x =0; x< zoomeada.getWidth(); x++){
                            zoomeada.setRGB(x, y, source2.getRGB(x*intervalX, y*intervalY));
                        }
                    }
                }
                Image nueva2 = espacial.Convolucion.convolucioname(herramientas.HerramientasImagen.toImage(zoomeada), suavizado2, 25, 0);
                JInternalFrameImagen nuevon = new JInternalFrameImagen(nueva2);
                nuevon.setVisible(true);
                this.principal.getPrincipal().getjDesktopPanePrincipal().add(nuevon);
                break;
            default:
                break;
        }

    }

}
