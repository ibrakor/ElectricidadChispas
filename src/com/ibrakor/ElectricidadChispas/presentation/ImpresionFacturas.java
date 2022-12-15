package com.ibrakor.ElectricidadChispas.presentation;

import com.ibrakor.ElectricidadChispas.domain.models.HojaFactura;

public class ImpresionFacturas {


    public void print(HojaFactura hojaFactura) {
            System.out.println("Codigo: "+hojaFactura.getCodfactura());
            System.out.println("Fecha: "+hojaFactura.getFechafactura());
            System.out.println("Cliente: "+hojaFactura.getCliente().getNombre());
            System.out.println("Productos: "+hojaFactura.getProductos());
            System.out.println("Basaimponible: "+hojaFactura.getBasaimponible());
            System.out.println("Total: "+hojaFactura.getTotal());

        }
    }


    




