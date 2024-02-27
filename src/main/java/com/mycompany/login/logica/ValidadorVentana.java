package com.mycompany.login.logica;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class ValidadorVentana extends Validacion{

    public ValidadorVentana() {
    }
    
    public Boolean validarCampos (JTextField campo, String valorEsperado){
        return compararStrings(campo.getText(), valorEsperado);
    }
    
    public Boolean validarCampos (JPasswordField campo, String valorEsperado){
        return compararStrings(String.valueOf(campo.getPassword()), valorEsperado);
    }
    
    public Boolean validarComboBox(JComboBox campo, String valorEsperado){
        return compararStrings((String) campo.getSelectedItem(), valorEsperado);
    }
}
