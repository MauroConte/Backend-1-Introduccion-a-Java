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
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 *
 */
public class EJEXTRA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] vA = new int[3];
        int[] vB = new int[3];

        
        llenarVector(vA);
        System.out.println("");
        llenarVector(vB);
        System.out.println("");
        System.out.println("---------");
        System.out.println("");
        System.out.println("La igualdad es: " + igualdad(vA,vB));
    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < 3; i++) {

            vector[i] = (int) (Math.random() * 5);

            System.out.print(vector[i] + " ");

        }
    }

    public static boolean igualdad(int[] vA, int[] vB) {

        boolean comparacion = true;

        for (int i = 0; i < 3; i++) {

            if (vA[i] != vB[i]) {

                comparacion = false;
                break;

            }

        }
        return comparacion;
    }
}
