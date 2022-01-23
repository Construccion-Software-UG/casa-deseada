package edu.ug.model.clases;

public class Usuario {
    private String userName;
    private String password;
    private Rol rol;

    public Usuario(String userName, String password, Rol rol) {
        this.userName = userName;
        this.password = password;
        this.rol = rol;
    }

    public String getUserName() {
        return userName;
    }

    public Rol getRol() {
        return rol;
    }
}
