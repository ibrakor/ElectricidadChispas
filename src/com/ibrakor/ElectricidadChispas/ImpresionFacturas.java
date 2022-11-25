package com.ibrakor.ElectricidadChispas;

public class ImpresionFacturas {


    private HojaFactura factura1;

    public void print(ImpresionFacturas Factura1) {
            System.out.println("Codigo: "+factura1.getCodfactura());
            System.out.println("Fecha: "+factura1.getFechafactura());
            System.out.println("Cliente: "+factura1.getCliente().getNombre());
            System.out.println("Productos: "+factura1.getProductos());
            System.out.println("Basaimponible: "+factura1.getBasaimponible());
            System.out.println("Total: "+factura1.getTotal());

        }
    }


    




