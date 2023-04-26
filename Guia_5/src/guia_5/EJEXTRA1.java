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
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 *
 */
public class EJEXTRA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int largo = leer.nextInt();

        int[] vector = new int[largo];
        
        System.out.println("La suma es: " + sumaSubindice(vector));

    }

    public static int sumaSubindice(int[] vector) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ahora ingrese el valor de los elementos");
        int suma = 0;
        for (int i = 0; i < vector.length; i++) {

            vector[i] = leer.nextInt();

            suma = suma + vector[i];

        }
        return suma;

    }

}
