package edu.ug.model.clases;

public class Vendedor extends Persona{
    private int horasTrabajadas;

    public Vendedor() {

    }

    public Vendedor(int id, String cedula, String nombre, String apellido, char genero, String telefono, Usuario user) {
        super(id, cedula, nombre, apellido, genero, telefono, user);
  
    }

    public Vendedor(String cedula, String nombre, String apellido, char genero, String telefono) {
        super(cedula, nombre, apellido, genero, telefono);

    }

    public void registrarProforma(Casa casa){

    }




    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }


}
