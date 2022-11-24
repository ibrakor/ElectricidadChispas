package com.ibrakor.ElectricidadChispas;

public class Sociedades implements Clientes {
    private Integer codcliente;
    private String razonsocial;
    private String cif;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    @Override
    public Integer getCodcliente() {
        return codcliente;
    }

    @Override
    public void setCodcliente(Integer codcliente) {

    }

    @Override
    public String getNombre() {
        return razonsocial;
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public String getApellido() {
        return null;
    }

    @Override
    public void setApellido(String apellido) {

    }

    @Override
    public String getDniCif() {
        return cif;
    }

    @Override
    public void setDniCif(String dniCif) {

    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {

    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {

    }
}
