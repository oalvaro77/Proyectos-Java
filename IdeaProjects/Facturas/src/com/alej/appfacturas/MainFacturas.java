package com.alej.appfacturas;

import com.alej.appfacturas.modelo.*;


import java.util.Scanner;

public class MainFacturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("Ingrese documento del cliente: ");
        cliente.setDocumento(sc.nextLine());
        System.out.println("Ingrese nombre del cliente");
        cliente.setNombre(sc.nextLine());


        System.out.println("Ingrese una descripcion para la factura: ");
        String descripcion = sc.nextLine();
        Factura factura = new Factura(cliente, descripcion);

        Producto producto;
        /**String nombre;
        float precio;
        int cantidad;**/


        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto = new Producto();
            System.out.print("Ingrese producto numero " + producto.getIdProducto() + ": ");
            producto.setNombre(sc.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(sc.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItem(new ItemFactura(producto, sc.nextInt()));

            System.out.println();
            sc.nextLine();

        }

        System.out.println(factura);

    }


}
