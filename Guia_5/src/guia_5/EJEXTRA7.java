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
 * Realizar un programa que complete un vector con los N primeros números de la
 * sucesión de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión
 * de los siguientes números: 1, 1, 2, 3, 5, 8, 13, 21, 34, ... Donde cada uno
 * de los números se calcula sumando los dos anteriores a él. Por ejemplo: La
 * sucesión del número 2 se calcula sumando (1+1) Análogamente, la sucesión del
 * número 3 es (1+2), Y la del 5 es (2+3), Y así sucesivamente… La sucesión de
 * Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: Fibonaccin =
 * Fibonaccin-1 + Fibonaccin-2 para todo n>1 Fibonaccin = 1 para todo n<=1 Por
 * lo tanto, si queremos calcular el término “n” debemos escribir una función
 * que reciba como parámetro el valor de “n” y que calcule la serie hasta llegar
 * a ese valor. Para conocer más acerca de la serie de Fibonacci consultar el
 * siguiente link: https://quantdare.com/numeros-de-fibonacci/
 *
 */
public class EJEXTRA7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber la sucesion de Fibonacci");

        int nUsuario = leer.nextInt();
        long[] vector = new long[nUsuario];
        serieFibonacci(vector, nUsuario);

    }

    public static void serieFibonacci(long[]vector, int nUsuario) {

        long fibonacci;

        for (int i = 0; i < nUsuario; i++) {

            if (i == 0 || i == 1) {

                vector[i] = 1;

            } else {
                fibonacci = vector[i - 1] + vector[i - 2];
                vector[i] = fibonacci;
            }

            System.out.print(vector[i] + ", ");

        }

    }

}
