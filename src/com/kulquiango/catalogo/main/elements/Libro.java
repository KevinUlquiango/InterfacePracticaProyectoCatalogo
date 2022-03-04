package com.kulquiango.catalogo.main.elements;

import com.kulquiango.catalogo.main.abstracts.Producto;
import com.kulquiango.catalogo.main.interfaces.ILibro;


import java.util.Date;

public class Libro extends Producto implements  ILibro {
    private Date FechaPublicacion = new Date();
    private String autor;
    private String titulo;
    private String editorial;

    public Libro(int precio, String autor, String titulo, String editorial) {
        super(precio);
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return FechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 20;
    }
}
