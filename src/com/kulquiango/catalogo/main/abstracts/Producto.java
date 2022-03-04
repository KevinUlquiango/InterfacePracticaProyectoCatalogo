package com.kulquiango.catalogo.main.abstracts;

import com.kulquiango.catalogo.main.interfaces.IProducto;

public abstract class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
