package com.mycompany.login.enums;

public enum Roles {
    ADMIN("admin"),
    OFICIALES("oficiales");
    
    private Roles(String rol){
        this.rol = rol;
    }
    
    public String get_Rol(){
        return rol;
    }
    
    private final String rol;
}
