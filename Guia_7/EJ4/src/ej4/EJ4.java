/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. Superficie = base * altura / Perímetro =
 * (base + altura) * 2.
 *
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Rectangulo r1 = new Rectangulo();

        System.out.println("Ingrese base y altura para crear un rectágulo: ");

        r1.crearRectangulo(leer.nextInt(), leer.nextInt());

        System.out.println("Superficie: " + r1.superficie(r1.getBase(), r1.getAltura()));

        System.out.println("Perimetro: " + r1.perimetro(r1.getBase(), r1.getAltura()));

        System.out.println("Rectangulo: ");
        System.out.println("");

        r1.dibujarRectangulo(r1.getBase(), r1.getAltura());

    }

}
