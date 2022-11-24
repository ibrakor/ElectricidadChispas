package com.ibrakor.ElectricidadChispas;

public class Autonomos implements Clientes {
    private String codcliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    @Override
    public String getCodcliente() {
        return dni;
    }

    @Override
    public String getNombre() {
        return nombre+" "+apellido;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
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

    public void setCodcliente(String codcliente) {
        this.codcliente = codcliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
}

