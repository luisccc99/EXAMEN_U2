package com.example.examen_u2;

public class Restaurante {

    private String nombre;
    private String descripcion;
    private String direccion;
    private String telefono;

    public Restaurante(String nombre, String descripcion, String direccion, String telefono) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
}
