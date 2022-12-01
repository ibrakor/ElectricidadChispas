package com.ibrakor.ElectricidadChispas.presentation;

import com.ibrakor.ElectricidadChispas.domain.models.*;
import com.ibrakor.ElectricidadChispas.domain.usecase.AddCustomerUseCase;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Creacion de un autonomo (No he puesto que todos los datos se lean con scanner porque hace las pruebas muy lentas)
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

//Creacion de una sociedad
        Sociedades s1 = new Sociedades();
        s1.setCif("D90831215");
        s1.setRazonsocial("Arroz S.A");
        s1.setDireccion("Calle rio");
        s1.setPoblacion(" Valencia");
        s1.setProvincia("Valencia");
        s1.setEmail("arroz@arroz.com");
        s1.setTelefono("92004699");

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase();
        addCustomerUseCase.execute(aut1);
        addCustomerUseCase.execute(s1);

//Creacion de uno de los dos productos
        Productos prod1 = new Productos();
        prod1.setCodproducto(242482);
        prod1.setNombre("Bombilla LED RGB.");
        prod1.setMarca("Xioami");
        prod1.setModelo("B22");
        prod1.setPrecio(20);
        prod1.setTipoiva(10);
//Creacion del otro producto
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
        //Creacion de uno de los dos servicios

        Servicios serv1 = new Servicios();
        System.out.println("Ingrese el código del servicio:");
        serv1.setCodservicio(sc.nextInt());
        serv1.setNombre("Mantenimiento Electricidad.");
        serv1.setPrecio(200);
        serv1.setTipoiva(21);
//Creacion del otro servicio

        Servicios serv2 = new Servicios();
        serv2.setCodservicio(9243);
        serv2.setNombre("Revision Electricidad.");
        serv2.setPrecio(100);
        serv2.setTipoiva(21);
//Creacion de una factura con cliente siendo un autonomo y un producto y un servicio
        HojaFactura factura1 = new HojaFactura();
        int basesf1= serv1.getPrecio() + prod1.getPrecio();
        int totalf1= (int) ((basesf1 * 0.21) + basesf1);
        factura1.setCodfactura(8434);
        factura1.setFechafactura(new Date(122, 12, 1));
        factura1.setCliente(aut1);
        factura1.setProductos(serv1.getNombre()+" Id: "+serv1.getCodproducto() + "\n"+prod1.getNombre()+" Id: "+prod1.getCodproducto());
        factura1.setBasaimponible(basesf1);
        factura1.setTotal(totalf1);
//Impresion de la primera factura
        System.out.println("Codigo de factura: "+factura1.getCodfactura());
        System.out.println("Fecha: "+factura1.getFechafactura()+"\n-----------------------");
        System.out.println("Cliente: "+factura1.getCliente().getCodcliente()+" "+factura1.getCliente().getNombre()+"\n"+factura1.getCliente().getDireccion()+"\n"+factura1.getCliente().getPoblacion()+"\n"+factura1.getCliente().getProvincia()+"\nEmail: "+factura1.getCliente().getEmail());
        System.out.println("Productos: "+"\n"+factura1.getProductos()+"\nTipo de IVA: "+serv2.getTipoiva()+"%");
        System.out.println("Basa imponible: "+factura1.getBasaimponible()+"\n-----------------------");
        System.out.println("Total: "+factura1.getTotal()+"\n-----------------------");
//Creacion de una factura con cliente siendo una sociedad y un producto y un servicio diferentes a la anterior

        HojaFactura factura2 = new HojaFactura();
        int basesf2= serv2.getPrecio() + prod2.getPrecio();
        int totalf2= (int) ((basesf2 * 0.21) + basesf2);
        factura2.setCodfactura(137844);
        factura2.setFechafactura(new Date(122, 12, 1));
        factura2.setCliente(s1);
        factura2.setProductos(serv2.getNombre()+" Id: "+serv2.getCodproducto() + "\n"+prod2.getNombre()+" Id: "+prod2.getCodproducto());
        factura2.setBasaimponible(basesf2);
        factura2.setTotal(totalf2);
//Impresion de la segunda factura

        System.out.println("Codigo de factura: "+factura2.getCodfactura());
        System.out.println("Fecha: "+factura2.getFechafactura()+"\n-----------------------");
        System.out.println("Cliente: "+factura2.getCliente().getCodcliente()+" "+factura2.getCliente().getNombre()+"\n"+factura2.getCliente().getDireccion()+"\n"+factura2.getCliente().getPoblacion()+"\n"+factura2.getCliente().getProvincia()+"\nEmail: "+factura2.getCliente().getEmail());
        System.out.println("Productos: "+"\n"+factura2.getProductos()+"\nTipo de IVA: "+serv2.getTipoiva()+"%");
        System.out.println("Basa imponible: "+factura2.getBasaimponible()+"\n-----------------------");
        System.out.println("Total: "+factura2.getTotal()+"\n-----------------------");




    }
}