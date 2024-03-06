package com.mycompany.login.logica;

import com.mycompany.login.enums.Categoria;

public class Herramienta {
    private int id_herramienta;
    
    private String nombre;
    
    private String descripcion;
    
    private String ubicacion;
    
    private long CantiadEnStock;
    
    private Categoria categoria;

    public Herramienta(int id_herramienta, String nombre, String descripcion, String ubicacion, long CantiadEnStock, Categoria categoria) {
        this.id_herramienta = id_herramienta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.CantiadEnStock = CantiadEnStock;
        this.categoria = categoria;
    }
    

    public Herramienta(String nombre, String descripcion, String ubicacion, long CantiadEnStock, Categoria categoria) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.CantiadEnStock = CantiadEnStock;
        this.categoria = categoria;
    }

    public Herramienta() {
    }

    public int getId_herramienta() {
        return id_herramienta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public long getCantiadEnStock() {
        return CantiadEnStock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setId_herramienta(int id_herramienta) {
        this.id_herramienta = id_herramienta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setCantiadEnStock(long CantiadEnStock) {
        this.CantiadEnStock = CantiadEnStock;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Herramienta{" + "id_herramienta=" + id_herramienta + ", nombre=" + nombre + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", CantiadEnStock=" + CantiadEnStock + ", categoria=" + categoria + '}';
    }
    
    
}
