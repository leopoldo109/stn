package com.mycompany.login.logica;

import com.mycompany.login.enums.Roles;
import java.util.Date;

public class Empleado {
    private int id_empleado;
    
    private String Nombre;
    
    private double valor_dia;
    
    private Roles rol;
    
    private Date fechaAlta;
    
    private Date fechaBaja;

    public Empleado(int id_empleado, String Nombre, double valor_dia, Roles rol, Date fechaAlta, Date fechaBaja) {
        this.id_empleado = id_empleado;
        this.Nombre = Nombre;
        this.valor_dia = valor_dia;
        this.rol = rol;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public Empleado(String Nombre, double valor_dia, Roles rol, Date fechaAlta, Date fechaBaja) {
        this.Nombre = Nombre;
        this.valor_dia = valor_dia;
        this.rol = rol;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }



    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getValor_dia() {
        return valor_dia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setValor_dia(double valor_dia) {
        this.valor_dia = valor_dia;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    
}
