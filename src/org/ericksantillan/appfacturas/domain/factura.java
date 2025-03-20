package org.ericksantillan.appfacturas.domain;

import java.util.Date;

public class factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;
    public static final int MAX_ITEMS=10;
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
}
