package org.ericksantillan.appfacturas.domain;

public class ItemFactura {

    private int cantidad;
    private Producto producto;
    //constructor

    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    //getter and setter
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //metodo
    public float calcularimporte(){
        return cantidad*producto.getPrecio();
    }

}
