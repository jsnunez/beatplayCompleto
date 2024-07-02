package com.jsnunez.model;

public class Entrada {
    String id;
    Partido partido;
    Usuario comprador;
    String fechaCompra;
    int cantidad;
    int PrecioTotal;
    String ubicacion;
    public Entrada() {
    }
    public Entrada(String id, Partido partido, Usuario comprador, String fechaCompra, int cantidad, int precioTotal,
            String ubicacion) {
        this.id = id;
        this.partido = partido;
        this.comprador = comprador;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        PrecioTotal = precioTotal;
        this.ubicacion = ubicacion;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Partido getPartido() {
        return partido;
    }
    public void setPartido(Partido partido) {
        this.partido = partido;
    }
    public Usuario getComprador() {
        return comprador;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getPrecioTotal() {
        return PrecioTotal;
    }
    public void setPrecioTotal(int precioTotal) {
        PrecioTotal = precioTotal;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    
}
