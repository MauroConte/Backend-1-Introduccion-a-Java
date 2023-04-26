/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10extra;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
 * "calcular_area" que calcule y devuelva el área del rectángulo. Luego crea un
 * objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el
 * área del rectángulo.
 *
 *
 */
public class EJ10EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Para crear un rectangulo y saber su area indique base y altura: ");
        rectangulo1.setLado1(leer.nextInt());
        rectangulo1.setLado2(leer.nextInt());
        System.out.println("");
        System.out.println("El area es: ");
        System.out.println(rectangulo1.calcular_area() + " m2.");

    }

}
