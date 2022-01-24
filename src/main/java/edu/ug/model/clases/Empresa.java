package edu.ug.model.clases;

public class Empresa {

    private int id;
    private String nombre;
    private String direccion;
    private DepartamentoVenta departamentoVenta;

    public Empresa(){}

    public Empresa(int id, String nombre, String direccion, DepartamentoVenta departamentoVenta) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamentoVenta = departamentoVenta;
    }

    public Empresa(String nombre, String direccion, DepartamentoVenta departamentoVenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamentoVenta = departamentoVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public DepartamentoVenta getDepartamentoVenta() {
        return departamentoVenta;
    }

    public void setDepartamentoVenta(DepartamentoVenta departamentoVenta) {
        this.departamentoVenta = departamentoVenta;
    }
}
