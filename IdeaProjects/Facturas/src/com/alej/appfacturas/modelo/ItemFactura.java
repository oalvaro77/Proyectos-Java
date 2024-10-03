package com.alej.appfacturas.modelo;

public class ItemFactura {
    private Producto producto;
    private int cantidad;

    public ItemFactura(Producto producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }


    public float calcularImporte() {
        return this.cantidad * producto.getPrecio();
    }

    @Override
    public String toString() {
        return producto +
                "\t" + cantidad + "\t" +
                calcularImporte();
    }
}
