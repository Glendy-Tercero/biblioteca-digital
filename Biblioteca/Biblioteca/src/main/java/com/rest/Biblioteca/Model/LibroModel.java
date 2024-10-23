package com.rest.Biblioteca.Model;

public class LibroModel {
    private String titulo, autor, genero;
    private int año, cantidad;

    public LibroModel() {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
