package org.ericksantillan.appfacturas;

import org.ericksantillan.appfacturas.domain.*;

import java.util.Scanner;

public class ejemplofactura {
    public static void main(String[] args) {
        Cliente erick =new Cliente();
        erick.setNif("5555-5");
        erick.setNombre("Erick");

        Scanner s=new Scanner(System.in);
        System.out.print("ingrese la descripcion de la factura: ");
        String descripcion=s.nextLine();

        factura factura=new factura(descripcion,erick);

        System.out.println("\n");

        for (int i=0; i<5; i++){
            Producto producto1=new Producto();
            System.out.print("Ingrese producto No."+producto1.getCodigo()+": ");
            producto1.setNombre(s.nextLine());

            System.out.print("Ingrese el precio del producto: ");
            producto1.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad del producto: ");

            factura.additemfactura(new ItemFactura(s.nextInt(),producto1));

            System.out.println("\n");
            s.nextLine();//se agrega para que no haya problema si pones palabras de una o mas lineas
        }
        System.out.println(factura);
    }
}
