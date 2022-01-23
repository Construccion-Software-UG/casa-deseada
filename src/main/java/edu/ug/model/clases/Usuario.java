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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
