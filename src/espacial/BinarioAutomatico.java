/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espacial;

import herramientas.HerramientasImagen;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 *
 * @author carli
 */
public class BinarioAutomatico {

    public static int calculaUmbral(double[] histograma) {
        int umbral = 0, umbralaux = 0;
        Random ran = new Random();
        umbral = ran.nextInt(256);
        //BufferedImage bi = HerramientasImagen.toBufferedImage(imagen);
        System.out.println("Primerisimo: "+umbral);
        do {
            umbralaux = umbral;
            umbral = reajustarUmbral(umbral, histograma);
            System.out.println(umbral);
        } while (umbralaux != umbral);
        return umbral;
    }

    public static Image Binariza(Image imagen,int umbral) {
        Image nueva = null;
        BufferedImage bi = herramientas.HerramientasImagen.toBufferedImage(imagen);
                 Color color;
               //  System.out.println(jSlider1.getValue());
                 for(int j = 0 ; j< bi.getWidth();j++){
                    for(int m = 0 ; m < bi.getHeight();m++){
                        color = new Color(bi.getRGB(j, m));
                       
                        int r = color.getRed(); // (0-255)
                        int g = color.getGreen(); // (0-255)
                        int b = color.getBlue(); // (0-255)
                        int med = (r+g+b)/3;
                        
                        if(med<=umbral){
                          bi.setRGB(j, m, Color.WHITE.getRGB());  
                        }else{
                           bi.setRGB(j, m, 0); 
                        }
                    }
                }
                nueva = herramientas.HerramientasImagen.toImage(bi);
        return nueva;
    }

    public static double[] devuelveHisto(Image imagen) {
        double[] histo = new double[256];
        BufferedImage bi = herramientas.HerramientasImagen.toBufferedImage(imagen);
        Color color, aux;
        for (int x = 0; x < bi.getWidth(); x++) {
            for (int y = 0; y < bi.getHeight(); y++) {
                color = new Color(bi.getRGB(x, y));
                int r = color.getRed(); // (0-255)
                int g = color.getGreen(); // (0-255)
                int b = color.getBlue(); // (0-255)
                int media = (r + g + b) / 3;
                histo[media]++;
                //aux = new Color(media, media, media);
                // bi.setRGB(x, y, aux.getRGB());
            }
        }
        return histo;
    }

    private static int reajustarUmbral(int umbralPrin, double[] histograma) {
        int u1, u2;
        int a1 = 0, a2 = 0, n1 = 0, n2 = 0;
        a1 += histograma[0];
        for (int x = 1; x < umbralPrin; x++) {
            a1 += histograma[x] * x;
            n1 += histograma[x];
        }

        for (int y = umbralPrin; y <= 255; y++) {
            a2 += histograma[y] * y;
            n2 += histograma[y];
        }
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        u1 = a1 / n1;
        u2 = a2 / n2;
        return (int) ((u1 + u2) / 2);
    }
}
