package edu.ug.model.clases;

import java.util.Date;

public class Proforma {

    private int codigo;
    private Casa casa;
    private Date fecha;

    public Proforma(){}

    public Proforma(int codigo, Casa casa, Date fecha) {
        this.codigo = codigo;
        this.casa = casa;
        this.fecha = fecha;
    }

    public Proforma(Casa casa, Date fecha) {
        this.casa = casa;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
