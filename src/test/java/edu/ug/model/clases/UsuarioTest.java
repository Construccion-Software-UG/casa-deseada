package edu.ug.model.clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioTest {

    Usuario user;

    @Test
    void constructor_test(){
        String name = "pepe",
                pass = "12345";

        user = new Usuario(name, pass, Rol.CLIENTE);

        assertEquals(name, user.getUserName());
        assertEquals("CLIENTE", user.getRol().toString());

    }

    @Test
    void actualizar_test(){
        String name = "pepe",
                pass = "12345";

        user = new Usuario(name, pass, Rol.CLIENTE);

        user.setRol(Rol.VENDEDOR);
        user.setUserName("pepe1");
        user.setPassword("abcd");

        assertEquals("pepe1", user.getUserName());
        assertEquals("VENDEDOR", user.getRol().toString());
    }


}
