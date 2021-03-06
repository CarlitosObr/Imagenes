/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisimagenes2021.pkg2;

import espacial.Histograma;
import graficar.Grafica;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author working
 */
public class AnalisisImagenes20212 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // visualización de la imagen dentro de la GUI
        Image imagen = herramientas.HerramientasImagen.abrirImagen();
        // para cuantización de la imagen vamos a un ocupar BufferedImage
        BufferedImage bImagen = herramientas.HerramientasImagen.toBufferedImage(imagen);
        
        Histograma h = new Histograma(imagen);
        h.calcularHistogramas();
        Grafica nuevo = new Grafica("RGB", "Muestras", "Histograma de una imagen");
        nuevo.agregarSerie("Rojo", h.getR());
        nuevo.agregarSerie("Azul", h.getB());
        nuevo.agregarSerie("Verde",h.getG());
        nuevo.crearGrafica();
        nuevo.muestraGrafica();
        /*Color color = new Color(bImagen.getRGB(300,240));
        int r = color.getRed();
        int g =color.getGreen();
        int b = color.getBlue();*/
        System.out.println();
    }
    
}
