package com.ibrakor.ElectricidadChispas.domain.models;

public class Sociedades implements Clientes {
    private Integer codcliente;
    private String razonsocial;
    private String cif;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    @Override
    public String getCodcliente() {
        return cif;
    }

    @Override
    public String getNombre() {
        return razonsocial;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }
}

