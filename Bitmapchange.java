
package bitmapchange;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;
import java.io.*;
import java.util.*;
import javafx.scene.control.TextField;
import javafx.scene.text.*;

import javax.imageio.ImageIO;

public class Bitmapchange {

    public static void gameboy(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                //media de color
                int mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);
                //convertir a modelo de tres canales
                Color colorGray = new Color(mediaPixel,mediaPixel,mediaPixel);
                if ((mediaPixel == 0) || (mediaPixel < 85)){
                colorGray = new Color(0,10,0);
                }else
                if ((mediaPixel == 85) || (mediaPixel < 170)){
                colorGray = new Color(85,95,85);
                }else
                if ((mediaPixel == 170) || (mediaPixel < 255)){
                colorGray = new Color(170,180,170);
                }else
                if ((mediaPixel == 255) || (mediaPixel > 255)){
                colorGray = new Color(255,255,255);
                }
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        ImageIO.write(image, "png", new File(ruta2.getText()));
        
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void wbfiltro(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                //media de color
                int mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);
                //convertir a modelo de tres canales
                Color colorGray = new Color(mediaPixel,mediaPixel,mediaPixel);
                
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void negativo(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                //media de color                
                //convertir a modelo de tres canales
                Color colorGray = new Color ((255-colorAux.getRed()),(255-colorAux.getGreen()),(255-colorAux.getBlue()));
                
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void randomruido(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel                
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                
                Color colorGray;
                colorGray = new Color((int)((colorAux.getRed())*(Math.random() * (1-0)+0)),(int)((colorAux.getGreen())*(Math.random() * (1-0)+0)),(int)((colorAux.getBlue())*(Math.random() * (1-0)+0)));
                colorGray = colorGray.brighter();
                colorGray = colorGray.brighter();
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void sepia(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                Color colorGray = new Color(0,0,0);
                //media de color
                int mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);
                //convertir a modelo de tres canales
                if ((mediaPixel > 35)&&(mediaPixel <= 255)){
                
                    colorGray = new Color (mediaPixel,mediaPixel-13,mediaPixel-35);
                
                }            
                
                colorGray = colorGray.darker();
                colorGray = colorGray.darker();
                colorGray = colorGray.darker();
                colorGray = colorGray.darker();
                
                colorGray = colorGray.brighter();
                colorGray = colorGray.brighter();
                colorGray = colorGray.brighter();
                colorGray = colorGray.brighter();                
                
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void material(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                
                
                int colorRed = colorAux.getRed();
                int colorGreen = colorAux.getGreen();
                int colorBlue = colorAux.getBlue();
                int colorAlfa = colorAux.getAlpha();
                
                
                Color colorGray = new Color(colorRed,colorGreen,colorBlue);
                
                colorGray = colorGray.brighter();
                 
                  if ((colorRed >= 0) && (colorRed <=64)){
                    if ((colorGreen >= 0)&&(colorGreen <=64)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(0,0,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(0,0,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(0,0,255,255);
                        }
                    }else
                    if ((colorGreen >= 64)&&(colorGreen <=192)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(0,128,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(0,128,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(0,128,255,255);
                        }
                    }else
                    if ((colorGreen >= 192)&&(colorGreen <=255)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(0,255,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(0,255,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(0,255,255,255);
                        }
                    }
                }
                if ((colorRed >= 64) && (colorRed <= 192)){
                    if ((colorGreen >= 0)&&(colorGreen <=64)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(128,0,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(128,0,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(128,0,255,255);
                        }
                    }else
                    if ((colorGreen >= 64)&&(colorGreen <=192)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(128,128,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(128,128,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(128,128,255,255);
                        }
                    }else
                    if ((colorGreen >= 192)&&(colorGreen <=255)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(128,255,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(128,255,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(128,255,255,255);
                        }
                    }
                }
                if ((colorRed >= 192) && (colorRed <= 255)){
                    if ((colorGreen >= 0)&&(colorGreen <=64)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(255,0,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(255,0,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(255,0,255,255);
                        }
                    }else
                    if ((colorGreen >= 64)&&(colorGreen <=192)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(255,128,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(255,128,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(255,128,255,255);
                        }
                    }else
                    if ((colorGreen >= 192)&&(colorGreen <=255)){
                        if ((colorBlue >= 0)&&(colorBlue <= 64)){
                            colorGray = new Color(255,255,0,255);
                        }else
                        if ((colorBlue >= 64)&&(colorBlue <= 128)){
                            colorGray = new Color(255,255,128,255);
                        }else
                        if ((colorBlue >= 192)&&(colorBlue <= 255)){
                            colorGray = new Color(255,255,255,255);
                        }
                    }
                }
                
                if ((colorGreen >= 0) && (colorGreen <=64)){
                    if ((colorBlue >= 0)&&(colorBlue <=64)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,0,0,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,0,0,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,0,0,255);
                        }
                    }else
                    if ((colorBlue >= 64)&&(colorBlue <=192)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,0,128,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,0,128,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,0,128,255);
                        }
                    }else
                    if ((colorBlue >= 192)&&(colorBlue <=255)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,0,255,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,0,255,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,0,255,255);
                        }
                    }
                }
                if ((colorGreen >= 64) && (colorGreen <= 192)){
                    if ((colorBlue >= 0)&&(colorBlue <=64)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,128,0,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,128,0,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,128,0,255);
                        }
                    }else
                    if ((colorBlue >= 64)&&(colorBlue <=192)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,128,128,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,128,128,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,128,128,255);
                        }
                    }else
                    if ((colorBlue >= 192)&&(colorBlue <=255)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,128,255,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,128,255,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,128,255,255);
                        }
                    }
                }
                if ((colorGreen >= 192) && (colorGreen <= 255)){
                    if ((colorBlue >= 0)&&(colorBlue <=64)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,255,0,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,255,0,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,255,0,255);
                        }
                    }else
                    if ((colorBlue >= 64)&&(colorBlue <=192)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,255,128,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,255,128,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,255,128,255);
                        }
                    }else
                    if ((colorBlue >= 192)&&(colorBlue <=255)){
                        if ((colorRed >= 0)&&(colorRed <= 64)){
                            colorGray = new Color(0,255,255,255);
                        }else
                        if ((colorRed >= 64)&&(colorRed <= 128)){
                            colorGray = new Color(128,255,255,255);
                        }else
                        if ((colorRed >= 192)&&(colorRed <= 255)){
                            colorGray = new Color(255,255,255,255);
                        }
                    }
                }
                if ((colorBlue >= 0) && (colorBlue <=64)){
                    if ((colorRed >= 0)&&(colorRed <=64)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(0,0,0,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(0,128,0,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(0,255,0,255);
                        }
                    }else
                    if ((colorRed >= 64)&&(colorRed <=192)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(128,0,0,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(128,128,0,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(128,255,0,255);
                        }
                    }else
                    if ((colorRed >= 192)&&(colorRed <=255)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(255,0,0,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(255,128,0,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(255,255,0,255);
                        }
                    }
                }
                if ((colorBlue >= 64) && (colorBlue <= 192)){
                    if ((colorRed >= 0)&&(colorRed <=64)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(0,0,128,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(0,128,128,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(0,255,128,255);
                        }
                    }else
                    if ((colorRed >= 64)&&(colorRed <=192)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(128,0,128,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(128,128,128,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(128,255,128,255);
                        }
                    }else
                    if ((colorRed >= 192)&&(colorRed <=255)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(255,0,128,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(255,128,128,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(255,255,128,255);
                        }
                    }
                }
                if ((colorBlue >= 192) && (colorBlue <= 255)){
                    if ((colorRed >= 0)&&(colorRed <=64)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(0,0,255,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(0,128,255,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(0,255,255,255);
                        }
                    }else
                    if ((colorRed >= 64)&&(colorRed <=192)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(128,0,255,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(128,128,255,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(128,255,255,255);
                        }
                    }else
                    if ((colorRed >= 192)&&(colorRed <=255)){
                        if ((colorGreen >= 0)&&(colorGreen <= 64)){
                            colorGray = new Color(255,0,255,255);
                        }else
                        if ((colorGreen >= 64)&&(colorGreen <= 128)){
                            colorGray = new Color(255,128,255,255);
                        }else
                        if ((colorGreen >= 192)&&(colorGreen <= 255)){
                            colorGray = new Color(255,255,255,255);
                        }
                    }
                }
                //colorGray = colorGray.brighter();
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void scanlines(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                int colorRGBPixel = image.getRGB(x,y);
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                //media de color
                int i = y%3;
                int j = (y-1)%3;
                //convertir a modelo de tres canales
                Color colorGray = new Color(colorAux.getRed(),colorAux.getGreen(),colorAux.getBlue());
                
                if (i == 0){
                    colorGray = colorGray.darker();
                    colorGray = colorGray.darker();
                }
                if (j == 0){
                    colorGray = colorGray.brighter();
                    colorGray = colorGray.brighter();                    
                }
                
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
public static void pastel(TextField ruta1, TextField ruta2, Text debug) {
        Scanner input = new Scanner(System.in);
        //variables
        int x,y,select;
        float[] hsb = new float[3];
        float ct = 81;
        float br = 0.78f;
        
        //obtener imagen
        
        try{
        File Fichero = new File(ruta1.getText());
        BufferedImage image = ImageIO.read(Fichero);
        RescaleOp op = new RescaleOp(br, ct, null);
        image = op.filter(image, image);
        
        //interpretar la imagen
        
        debug.setText("Hecho!");        
        debug.setFont(Font.font("Ubuntu",FontWeight.BOLD,16));
        debug.setX(12);
        debug.setY(44);
        
        
        for(x = 0; x < image.getWidth(); x++){
            for (y = 0; y < image.getHeight(); y++){
                //obtener color de pixel
                
                int colorRGBPixel = image.getRGB(x,y);                
                //convertir color en objeto extraido
                Color colorAux = new Color(colorRGBPixel);
                //media de color
                
                //convertir a modelo de tres canales
                
                Color colorGray = new Color(colorAux.getRed(),colorAux.getGreen(),colorAux.getBlue());
                colorGray.RGBtoHSB(colorAux.getRed(),colorAux.getGreen(),colorAux.getBlue(),hsb);
                
                float h = hsb[0];
                float s = hsb[1];
                float v = hsb[2];
                                
                int rgb = Color.HSBtoRGB(h,s*(0.88f),v);
                
                
                int r = rgb >> 16 & 0x0000fa;
                int g = rgb >> 8 & 0x0000fa;
                int b = rgb >> 0 & 0x0000fa;
                
                
                colorGray = new Color(r,g,b);
                int grayRGBPixel = colorGray.getRGB();
                //cambio de formato
                image.setRGB(x,y,grayRGBPixel);
                
            }
        }
        //reconvertir la imagen y guardar
        ImageIO.write(image, "jpg", new File(ruta2.getText()));
        
        ImageIO.write(image, "png", new File(ruta2.getText()));
        }
        catch(IOException e){
            System.out.println("No se encuentra el fichero");
    }
    
}
}