/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6extra;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos
 * números y los ingresa en los atributos del objeto. Después, a través de otro
 * método calcular y devolver la distancia que existe entre los dos puntos que
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos
 * puntos consulte el siguiente link:
 * http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 *
 */
public class EJ6EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Puntos c1 = new Puntos();

        System.out.println("Ingrese las coordenadas x,y del puntoA y luego del puntoB ");
        c1.crearPuntos(leer.nextInt(), leer.nextInt(), leer.nextInt(), leer.nextInt());

        System.out.println("Punto A: " + c1.getX1() + "," + c1.getY1());
        System.out.println("");
        System.out.println("Punto B: " + c1.getX2() + "," + c1.getY2());
        
        System.out.println("La distancia entre el punto A y el punto B es: ");
        
        System.out.println(c1.distancia(c1.getX1(), c1.getY1(), c1.getX2(), c1.getY2()));
    }

}
