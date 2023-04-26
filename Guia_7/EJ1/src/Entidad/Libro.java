/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author mauro
 */
public class Libro {

    private int isbn, cantidadPaginas;
    private String titulo, autor;

    public Libro() {
    }

    public Libro(int isbn, int cantidadPaginas, String titulo, String autor) {
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setIsbn(int isbn) {

        this.isbn = isbn;
    }

    public void setCantidadPaginas(int cantidadPaginas) {

        this.cantidadPaginas = cantidadPaginas;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", cantidadPaginas=" + cantidadPaginas + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
    
    

}
