package com.mycompany.login.logica;
import com.mycompany.login.enums.Estado;
import java.util.Date;

public class Obra {
    private int id_obra;
    
    private String nombre;
    
    private String direccion;
    
    private Date fechaDeInicio;
    
    private Date fechaDeFinalizacion;
    
    private Estado estado;

    public Obra(int id_obra, String nombre, String direccion, Date fechaDeInicio, Date fechaDeFinalizacion, Estado estado) {
        this.id_obra = id_obra;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.estado = estado;
    }

    public Obra(String nombre, String direccion, Date fechaDeInicio, Date fechaDeFinalizacion, Estado estado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFinalizacion = fechaDeFinalizacion;
        this.estado = estado;
    }

    public Obra() {
    }
    
    

    public int getId_obra() {
        return id_obra;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public Date getFechaDeFinalizacion() {
        return fechaDeFinalizacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setId_obra(int id_obra) {
        this.id_obra = id_obra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public void setFechaDeFinalizacion(Date fechaDeFinalizacion) {
        this.fechaDeFinalizacion = fechaDeFinalizacion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    
    
    
}
