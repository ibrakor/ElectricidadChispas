package com.ibrakor.ElectricidadChispas;

public class Productos implements Vendible {
    private Integer codproducto;
    private String nombre;
    private String marca;
    private String modelo;
    private Integer precio;
    private Integer tipoiva;

    @Override
    public Integer getCodproducto() {
        return codproducto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setCodproducto(Integer codproducto) {
        this.codproducto = codproducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setTipoiva(Integer tipoiva) {
        this.tipoiva = tipoiva;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public Integer getTipoiva() {
        return tipoiva;
    }
}
