package com.example.demo.beans;

public class Usuario {
    String nombre;
    String apellido;
    String email;

    public Usuario() {
        this.nombre = "Juan";
        this.apellido = "Perez";
        this.email = "a@b.com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
