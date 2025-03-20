package org.ericksantillan.appfacturas.domain;

import java.util.Date;

public class factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS=12;
    private static int ultimofolio;

    //constructor
    public factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items=new ItemFactura[MAX_ITEMS];
        this.folio=++ultimofolio;
        this.fecha=new Date();
    }

    //getter and setter
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFolio() {
        return folio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    //add
    public void itemfactura(ItemFactura item){
        if (indiceItems<MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }
    //metodo
    public float total() {
        float valor = 0.0f;
        for (int i = 0; i < MAX_ITEMS; i++) {
            if (items== null) {
                continue;
            }
                valor += this.items[i].calcularimporte();

        }
        return valor;
}
public String detalle (){
        return "Factura No."+folio
                +"\nCliente: "+cliente
                +"\nNif: "+cliente.getNif()
                +"\ndesecripcion: "+descripcion+
                "\nfecha: " +fecha
                +"\nNombre: " +items.getClass().getName();

}
}
