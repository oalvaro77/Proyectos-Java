package com.alej.appfacturas.modelo;

public class Producto {
    private int idProducto;
    private String nombre;
    private float precio;
    private static int ultimoIdProducto;

    public Producto() {
        this.idProducto = ++ultimoIdProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return idProducto + "\t" +
                nombre +  "\t" + precio;
    }
}
