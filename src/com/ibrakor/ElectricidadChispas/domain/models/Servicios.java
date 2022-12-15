package com.ibrakor.ElectricidadChispas.domain.models;

public class Servicios implements Vendible {
    private Integer codservicio;
    private String nombre;
    private Integer precio;
    private Integer tipoiva;

    @Override
    public Integer getCodproducto() {
        return codservicio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    public Integer getCodservicio() {
        return codservicio;
    }

    public void setCodservicio(Integer codservicio) {
        this.codservicio = codservicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setTipoiva(Integer tipoiva) {
        this.tipoiva = tipoiva;
    }

    @Override
    public Integer getTipoiva() {
        return tipoiva;
    }
}
