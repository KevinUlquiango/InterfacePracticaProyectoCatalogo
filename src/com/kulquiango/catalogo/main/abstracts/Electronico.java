package com.kulquiango.catalogo.main.abstracts;

import com.kulquiango.catalogo.main.interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {
    protected String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return fabricante;
    }


}
