package com.example.examen_u2;

public class Restaurante {

    private String nombre;
    private String descripcion;
    private String direccion_tel;
    private int img;
    private float calif;

    public Restaurante(String nombre, String descripcion, String direccion_tel, int img, float calif) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion_tel = direccion_tel;
        this.img = img;
        this.calif = calif;
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

    public int getImg() { return img; }

    public float getCalif() { return calif; }
}
