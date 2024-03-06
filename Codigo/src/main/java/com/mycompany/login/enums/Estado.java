package com.mycompany.login.enums;

public enum Estado {
    PROCESO("proceso"),
    FINALIZADA("finalizada"),
    CANCELADA("cancelada"),
    ESPERA("espera");
    
    private Estado(String estado){
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
    private final String estado;
}
