package com.ibrakor.ElectricidadChispas.domain.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HojaFactura {
    private int codfactura;
    private Date fechafactura;
    private Cliente cliente;
    private String productos;
    private List<Vendible> vendibles = new ArrayList<>();
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
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
    public void addVendible(Vendible vendible) {
        this.vendibles.add(vendible);
    }
}

