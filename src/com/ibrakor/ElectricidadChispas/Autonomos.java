package com.ibrakor.ElectricidadChispas;

public class Autonomos implements Clientes {
    private Integer codcliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private Integer telefono;

    @Override
    public Integer getCodcliente() {
        return null;
    }

    @Override
    public void setCodcliente(Integer codcliente) {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {

    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {

    }

    @Override
    public String getDniCif() {
        return dni;
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
