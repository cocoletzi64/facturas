package org.ericksantillan.appfacturas;

import org.ericksantillan.appfacturas.domain.Cliente;
import org.ericksantillan.appfacturas.domain.ItemFactura;
import org.ericksantillan.appfacturas.domain.Producto;
import org.ericksantillan.appfacturas.domain.factura;

import java.util.Scanner;

public class ejemplofactura {
    public static void main(String[] args) {
        Cliente erick =new Cliente();
        erick.setNombre("erick");
        erick.setNif("5555-5");
        erick.setNombre("Erick");

        Scanner s=new Scanner(System.in);
        System.out.print("ingrese la descripcion de la factura: ");
        String descripcion=s.nextLine();
        factura factura=new factura(descripcion,erick);

        Producto producto1=new Producto();
        String nombre;
        float precio;
        int cantidad;
        System.out.println("\n");

        for (int i=0; i<5; i++){
            producto1=new Producto();
            System.out.print("Ingrese producto No."+producto1.getCodigo()+": ");
            nombre =s.nextLine();
            producto1.setNombre(nombre);

            System.out.print("Ingrese el precio del producto: ");
            precio =s.nextFloat();
            producto1.setPrecio(precio);

            System.out.print("Ingrese la cantidad del producto: ");
            cantidad =s.nextInt();
            ItemFactura item=new ItemFactura(cantidad,producto1);
            factura.additemfactura(item);

            System.out.println("\n");
            s.nextLine();//se agrega para que no haya problema si pones palabras de una o mas lineas
        }
        System.out.println(factura.detalle());
        System.out.println(factura.arreglodetalle());
    }
}
