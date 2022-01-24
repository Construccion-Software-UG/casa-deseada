package edu.ug.model.clases;

import java.util.List;

public class Gerente extends  Persona{

    public Gerente() {
    }

    public Gerente(int id, String cedula, String nombre, String apellido, char genero, String telefono, Usuario user) {
        super(id, cedula, nombre, apellido, genero, telefono, user);
    }

    public Gerente(String cedula, String nombre, String apellido, char genero, String telefono) {
        super(cedula, nombre, apellido, genero, telefono);
    }

    public Cliente consultarCliente(){
        return null;
    }

    public List<Venta> consultarVentas(){
        return null;
    }

}
