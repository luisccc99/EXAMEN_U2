package com.example.examen_u2;

public class Restaurante {

    private String nombre;
    private String descripcion;
    private String direccion_tel;

    public Restaurante(String nombre, String descripcion, String direccion_tel) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion_tel = direccion_tel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDireccion_tel() {
        return direccion_tel;
    }

}
