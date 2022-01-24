package edu.ug.model.clases;

import java.util.Date;

public class Venta {

    private int codVenta;
    private Cliente cliente;
    private Vendedor vendedor;
    private Proforma proforma;
    private Date fechaVenta;

    public Venta() {}

    public Venta(int codVenta, Cliente cliente, Vendedor vendedor, Proforma proforma, Date fechaVenta) {
        this.codVenta = codVenta;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.proforma = proforma;
        this.fechaVenta = fechaVenta;
    }

    public Venta(Cliente cliente, Vendedor vendedor, Proforma proforma, Date fechaVenta) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.proforma = proforma;
        this.fechaVenta = fechaVenta;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Proforma getProforma() {
        return proforma;
    }

    public void setProforma(Proforma proforma) {
        this.proforma = proforma;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
}
