package com.mycompany.login.igu;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class ImagenFrame {

    public ImagenFrame(JLabel label, String url, int width, int height) {
        try {
        ImageIcon imagenIcon = cargarIcon(url);

        if (imagenIcon != null) {

            Icon icono = escalarImagen(width, height, imagenIcon);

            label.setIcon(icono);
        } else {
            System.out.println("Error: La url de la imagen es null");
        }
        } catch (Exception e) {
            System.out.println("Error en la carga o manipulación de la imagen");
            e.printStackTrace(); // Imprime la traza de la excepción para diagnóstico
        }
    
    }
    
    private ImageIcon cargarIcon (String url){
            if (url != null) {
                return new ImageIcon(url);
            } else {
                return null;
            }
    }
    
    
    private ImageIcon escalarImagen(int width, int height,ImageIcon imagenIcon){
        return new ImageIcon(imagenIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    
}
