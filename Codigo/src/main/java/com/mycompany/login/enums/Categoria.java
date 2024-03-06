package com.mycompany.login.enums;

public enum Categoria {
    HERRAMIENTA("herramienta"),
    MAQUINARIA("maquinaria"),
    ACCESORIOS("accesorio");
    
    private Categoria(String categoria){
        this.categoria = categoria;
    }
    
    public String get_Categoria(){
        return categoria;
    }
    
    private final String categoria;
}
