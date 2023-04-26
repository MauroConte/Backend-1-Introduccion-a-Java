/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

/**
 *
 * @author mauro
 *
 * Realizar un algoritmo que llene un vector con los 100 primeros números
 * enteros y los muestre por pantalla en orden descendente.
 *
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] numeros = new int[100];

        llenarVector(numeros);
    }

    public static void llenarVector(int[] numeros) {

        int i = 0;

        for (int elemento : numeros) {

            elemento = i++;
        }

        for (int elemento : numeros) {

            elemento = elemento + i;

            i--;

            System.out.print(elemento + ", ");

        }

    }

}
