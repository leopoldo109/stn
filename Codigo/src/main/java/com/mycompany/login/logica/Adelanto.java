package com.mycompany.login.logica;

import java.util.Date;

public class Adelanto {
    private int id_adelanto;
    
    private long adelanto;
    
    private Date fecha;

    public Adelanto(int id_adelanto, long adelanto, Date fecha) {
        this.id_adelanto = id_adelanto;
        this.adelanto = adelanto;
        this.fecha = fecha;
    }

    public Adelanto(long adelanto, Date fecha) {
        this.adelanto = adelanto;
        this.fecha = fecha;
    }

    public int getId_adelanto() {
        return id_adelanto;
    }

    public long getAdelanto() {
        return adelanto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId_adelanto(int id_adelanto) {
        this.id_adelanto = id_adelanto;
    }

    public void setAdelanto(long adelanto) {
        this.adelanto = adelanto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
