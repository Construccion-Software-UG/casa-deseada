package edu.ug.model.clases;

public class Cliente extends  Persona{

    public Cliente() {
    }

    public Cliente(int id, String cedula, String nombre, String apellido, char genero, String telefono, Usuario user) {
        super(id, cedula, nombre, apellido, genero, telefono, user);
    }

    public Cliente(String cedula, String nombre, String apellido, char genero, String telefono) {
        super(cedula, nombre, apellido, genero, telefono);
    }

    public void crearProforma(){

    }

}
