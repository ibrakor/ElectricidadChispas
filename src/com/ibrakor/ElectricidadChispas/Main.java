package com.ibrakor.ElectricidadChispas;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autonomos aut1 = new Autonomos();
        aut1.setNombre("Maria");
        aut1.setApellido("Perez");
        System.out.println("Ingrese el DNI cliente:");
        aut1.setDni(sc.next());
        aut1.setDireccion("Calle Falsa");
        aut1.setPoblacion("Madrid");
        aut1.setProvincia("Madrid");
        aut1.setEmail("maria_perez@correo.com");
        aut1.setTelefono("914553210");

        Sociedades s1 = new Sociedades();
        s1.setCif("D90831215");
        s1.setRazonsocial("Arroz S.A");
        s1.setDireccion("Calle rio");
        s1.setPoblacion(" Valencia");
        s1.setProvincia("Valencia");
        s1.setEmail("arroz@arroz.com");
        s1.setTelefono("92004699");

        Productos prod1 = new Productos();
        prod1.setCodproducto(242482);
        prod1.setNombre("Bombilla LED RGB");
        prod1.setMarca("Xioami");
        prod1.setModelo("B22");
        prod1.setPrecio(20);
        prod1.setTipoiva(10);

        Productos prod2 = new Productos();
        prod2.setCodproducto(234382);
        System.out.println("Ingrese el nombre del producto:");
        prod2.setNombre(sc.next());
        System.out.println("Ingrese la marca del producto:");
        prod2.setMarca(sc.next());
        System.out.println("Ingrese el modelo del producto:");
        prod2.setModelo(sc.next());
        System.out.println("Ingrese el precio del producto:");
        prod2.setPrecio(sc.nextInt());
        System.out.println("Ingrese el tipo de iva del producto:");
        prod2.setTipoiva(sc.nextInt());

        Servicios serv1 = new Servicios();
        System.out.println("Ingrese el código del servicio:");
        serv1.setCodservicio(sc.nextInt());
        serv1.setNombre("Mantenimiento electricidad");
        serv1.setPrecio(200);
        serv1.setTipoiva(21);

        Servicios serv2 = new Servicios();
        serv2.setCodservicio(9243);
        serv2.setNombre("Revision electricidad");
        serv2.setPrecio(100);
        serv2.setTipoiva(21);

        HojaFactura factura1 = new HojaFactura();
        factura1.setCodfactura(8434);
        factura1.setFechafactura(new Date(122, 12, 1));
        factura1.setCliente(aut1);
        factura1.setProductos(prod1);
        factura1.setBasaimponible(prod1.getPrecio());
        factura1.setTotal((prod1.getPrecio())+(prod1.getTipoiva()*100));

        System.out.println("Número factura "+ factura1.getCodfactura());
        System.out.println("Fecha: "+ factura1.getFechafactura());
        System.out.println("Dni "+ factura1.getCliente().getCodcliente());

    }
}