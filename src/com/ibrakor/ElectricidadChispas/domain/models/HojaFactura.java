package com.ibrakor.ElectricidadChispas.domain.models;

import java.util.Date;

public class HojaFactura {
    private int codfactura;
    private Date fechafactura;
    private Clientes cliente;
    private String productos;
    private int basaimponible;
    private int total;

    public int getCodfactura() {
        return codfactura;
    }

    public void setCodfactura(int codfactura) {
        this.codfactura = codfactura;
    }

    public Date getFechafactura() {
        return fechafactura;
    }

    public void setFechafactura(Date fechafactura) {
        this.fechafactura = fechafactura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public int getBasaimponible() {
        return basaimponible;
    }

    public void setBasaimponible(int basaimponible) {
        this.basaimponible = basaimponible;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
