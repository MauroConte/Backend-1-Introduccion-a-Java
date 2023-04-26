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
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[3][3];

        System.out.println("Ingrese numeros para llenar el cuadrado, luego se determinara si es magico.");

        boolean esMagico = esMagico(matriz);

        System.out.println("Es un cuadrado magico? " + esMagico);

    }

    public static boolean esMagico(int[][] matriz) {

        Scanner leer = new Scanner(System.in);
        int[] vFilas = new int[3];
        int[] vColumnas = new int[3];
        int diagUno = 0;
        int diagDos = 0;
        boolean validacion = false;

        for (int i = 0; i < 3; i++) {
            int fila = 0;

            for (int j = 0; j < 3; j++) {

                matriz[i][j] = leer.nextInt();

                fila += matriz[i][j];

                if (j == i) {

                    diagUno += matriz[i][j];

                }

            }

            vFilas[i] = fila;

        }

        for (int j = 0; j < 3; j++) {
            int columna = 0;

            for (int i = 0; i < 3; i++) {

                columna += matriz[j][i];

            }

            vColumnas[j] = columna;

        }

        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {

                if (j == i) {

                    diagDos += matriz[i][j];

                }
            }
        }
        System.out.println("------");
        System.out.println("MATRIZ: ");
        System.out.println("");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Diagonal 1: " + diagUno);
        System.out.println("Diagonal 2: " + diagDos);
        System.out.println("");
        System.out.print("vFilas: ");

        for (int i = 0; i < 3; i++) {

            System.out.print(vFilas[i] + ", ");

        }

        System.out.println("");
        System.out.print("vColumnas:");

        for (int i = 0; i < 3; i++) {

            System.out.print(vColumnas[i] + ", ");
        }

        System.out.println("");
        System.out.println("------");
        
        validacion=true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (vFilas[j] != vColumnas[i] || vFilas[j] != diagUno || vFilas[j] != diagDos) {

                    validacion = false;
                    break;

                }
            }           
        }
        
        return validacion;

    }

}
