package edu.ug.model.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    Persona persona;

    @Test
    void constructor_1_test(){
        int id = 1;
        String cedula = "09999999",
                nombre = "Pepe",
                apellido = "Suarez",
                telefono = "09888888";
        char genero = 'M';
        Usuario user = null;

        persona = new Persona();

        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setId(id);
        persona.setCedula(cedula);
        persona.setGenero(genero);
        persona.setTelefono(telefono);
        persona.setUser(user);

        assertEquals(id, persona.getId());
        assertEquals(cedula, persona.getCedula());
        assertEquals(nombre, persona.getNombre());
        assertEquals(apellido, persona.getApellido());
        assertEquals(genero, persona.getGenero());
        assertEquals(telefono, persona.getTelefono());
        assertEquals(user, persona.getUser());
    }

    @Test
    void constructor_2_test(){
        int id = 1;
        String cedula = "09999999",
                nombre = "Pepe",
                apellido = "Suarez",
                telefono = "09888888";
        char genero = 'M';
        Usuario user = null;

        persona = new Persona(id, cedula, nombre, apellido, genero, telefono, user);

        assertEquals(id, persona.getId());
        assertEquals(cedula, persona.getCedula());
        assertEquals(nombre, persona.getNombre());
        assertEquals(apellido, persona.getApellido());
        assertEquals(genero, persona.getGenero());
        assertEquals(telefono, persona.getTelefono());
        assertEquals(user, persona.getUser());

    }

    @Test
    void constructor_3_test(){
        String cedula = "09999999",
                nombre = "Pepe",
                apellido = "Suarez",
                telefono = "09888888";
        char genero = 'M';

        persona = new Persona(cedula, nombre, apellido, genero, telefono);

        assertEquals(cedula, persona.getCedula());
        assertEquals(nombre, persona.getNombre());
        assertEquals(apellido, persona.getApellido());
        assertEquals(genero, persona.getGenero());
        assertEquals(telefono, persona.getTelefono());
    }

}
