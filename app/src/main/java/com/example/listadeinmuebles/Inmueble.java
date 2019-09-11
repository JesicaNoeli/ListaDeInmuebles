package com.example.listadeinmuebles;

import java.io.Serializable;

public class Inmueble implements Serializable {
    private int foto;
    private String direccion;
    private double precio;
    private String descripcion;

    public Inmueble(int foto, String direccion, double precio, String descripcion) {
        this.foto = foto;
        this.direccion = direccion;
        this.precio = precio;
       this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
