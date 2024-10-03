package com.alej.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;




public class Factura {
    private String descripcion;
    private int folio;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] item;
    private int indiceItems;
    public static final int MAX_ITEMS = 1000;
    public static int ultimoFolio;

    public Factura(Cliente cliente, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.item = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }


    public void addItem(ItemFactura items) {
        if (indiceItems < Factura.MAX_ITEMS) {
            this.item[indiceItems++] = items;
        }

    }

    public float calcularTotal() {
        float total = 0;
        for (ItemFactura item : item) {
            if (item == null) {
                continue;
            }
            total += item.calcularImporte();
        }
        return total;
    }

    public String verDetalles() {
        StringBuilder sb = new StringBuilder("Factura N");
        sb.append(folio)
                .append("\nCliente: ")
                .append(cliente.getNombre())
                .append("\t Documento: ")
                .append(cliente.getDocumento())
                .append("\nDescripcion: ")
                .append(descripcion)
                .append("\n");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sb.append("Fecha emission:")
                .append(sdf.format(fecha))
                .append("\n")
                .append("#\tNombre\t\t$\tCant\tTotal\n");




        for (ItemFactura item : this.item) {
            if (item == null) {
                continue;
            }
            sb.append(item)
                    .append("\n");
        }
        sb.append("\nTotal: ")
                .append(calcularTotal());
        return sb.toString();
    }

    @Override
    public String toString() {
        return verDetalles();
    }
}



