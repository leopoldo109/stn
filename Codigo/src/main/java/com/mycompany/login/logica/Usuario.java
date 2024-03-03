package com.mycompany.login.logica;

import com.mycompany.login.enums.Roles;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_usuario;
    
    @Basic
    private String nom_usuario;
    private String contraseña;
    
    @Enumerated(EnumType.ORDINAL)
    private Roles rol;

    public Usuario() {
    }

    public Usuario(String nom_usuario, String contraseña, Roles rol) {
        this.nom_usuario = nom_usuario;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    
    public String getNom_usuario() {
        return nom_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Roles getRol() {
        return rol;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
    

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nom_usuario=" + nom_usuario + ", contrase\u00f1a=" + contraseña + ", rol=" + rol + '}';
    }
    
    
    
}
