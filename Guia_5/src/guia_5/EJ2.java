/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido
 *
 *
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int[] vector = new int[100];

        llenarVector(vector);

        System.out.println("Ingrese un numero para buscarlo en el vector");
        int num = leer.nextInt();

        int veces = buscarN(vector, num);

        System.out.println("El " + num + " coincide " + veces + " veces");
    }

    public static void llenarVector(int[] vector) {

        int i;

        for (i = 0; i < 100; i++) {

            vector[i] = (int) (Math.random() * 100);

        }

    }

    public static int buscarN(int[] vector, int num) {

        int coincidencias = 0;

        for (int elemento : vector) {

            if (elemento == num) {

                coincidencias += 1;

            }
        }

        return coincidencias;
    }

}
