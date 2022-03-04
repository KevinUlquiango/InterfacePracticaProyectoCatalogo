package com.kulquiango.catalogo.main.elements;

import com.kulquiango.catalogo.main.abstracts.Electronico;
import com.kulquiango.catalogo.main.interfaces.IProducto;

public class TvLcd extends Electronico {

    private int pulgada;



    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }


    public int getPulgada() {
        return pulgada;
    }
    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 0.80;
    }

}
