/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

import Entidad.Libro;
import Entidad.Usuario;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 *
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Usuario U1 = new Usuario();

        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro l3 = new Libro();

        System.out.println("Nombre:");
        U1.setNombre(leer.next());
        System.out.println("Apellido:");
        U1.setApellido(leer.next());
        System.out.println("Edad:");
        U1.setEdad(leer.nextInt());

        System.out.println("Ahora ingrese los datos sobre el libro");
        System.out.println("ISBN:");
        l1.setIsbn(leer.nextInt());
        System.out.println("Titulo:");
        l1.setTitulo(leer.next());
        System.out.println("Autor:");
        l1.setAutor(leer.next());
        System.out.println("Cantidad de paginas:");
        l1.setCantidadPaginas(leer.nextInt());

        System.out.println(U1);
        System.out.println("");
        System.out.println(l1);

    }

}
