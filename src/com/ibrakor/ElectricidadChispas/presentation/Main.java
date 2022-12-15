package com.ibrakor.ElectricidadChispas.presentation;

import com.ibrakor.ElectricidadChispas.domain.models.*;
import com.ibrakor.ElectricidadChispas.domain.usecase.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Creacion de un autonomo (No he puesto que todos los datos se lean con scanner porque hace las pruebas muy lentas)
        Autonomos aut1 = new Autonomos();
        aut1.setNombre("Maria");
        aut1.setApellido("Perez");
        aut1.setCodcliente("983489K");
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


private void crearVendibles() {


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
        serv1.setCodservicio(6438);
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
      AddItemUseCase addItemUseCase = new AddItemUseCase();
      addItemUseCase.execute(serv2);
      addItemUseCase.execute(serv1);
      addItemUseCase.execute(prod1);
      addItemUseCase.execute(prod2);

        }
        private void CrearFactura(){


//Creacion de una factura con cliente siendo un autonomo y un producto y un servicio
        HojaFactura factura1 = new HojaFactura();
        factura1.setCodfactura(1);
        factura1.setFechafactura(new Date());
        factura1.setBasaimponible(30);
        factura1.setTotal(120);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase();
        Cliente cliente = getCustomerUseCase.execute("983489K");

        factura1.setCliente(cliente);

        GetItemUseCase getItemUseCase = new GetItemUseCase();
        Vendible prod1 = getItemUseCase.execute(242482);
        Vendible serv1 = getItemUseCase.execute(6438);

        factura1.addVendible(prod1);
        factura1.addVendible(serv1);

        AddFacturaUseCase addFacturaUseCase = new AddFacturaUseCase();
        addFacturaUseCase.execute(factura1);

        }
        private void mostrarFactura() {
            //Recupero la factura
            GetFacturaUseCase getFacturaUseCase = new GetFacturaUseCase();
            HojaFactura factura1 = getFacturaUseCase.execute(1);

            //Imprimo la factura
            ImpresionFacturas impresionFacturas = new ImpresionFacturas();
            impresionFacturas.print(factura1);
        }



    }
}