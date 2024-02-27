package com.mycompany.login.logica;

public class Validacion {

    public Validacion() {
    }
   
    public Boolean validarString(String texto){
        return texto != null && texto.isEmpty();
    }
    
    public Boolean compararStrings(String texto, String textoAcomparar){
        return (validarString(texto) ? validarString(textoAcomparar) : texto.equals(textoAcomparar));
    }
    
}
