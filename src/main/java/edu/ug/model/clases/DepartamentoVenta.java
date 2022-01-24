package edu.ug.model.clases;

import java.util.List;

public class DepartamentoVenta {

    List<Venta> ventas;

    public DepartamentoVenta(){}

    public DepartamentoVenta(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void registrarVenta(Venta venta){
        this.ventas.add(venta);
    }



    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
}
