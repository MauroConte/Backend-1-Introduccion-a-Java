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
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se
 * denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        llenarMatriz(matriz);

        System.out.println("-------");
        
        trasponerMatriz(matriz, matrizB);

    }

    public static void llenarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int z = 0; z < 3; z++) {

                matriz[i][z] = (int) (Math.random() * 10);

                System.out.print(" " + matriz[i][z]);

            }
            System.out.println("");

        }
    }

    public static void trasponerMatriz(int[][] matriz, int[][] matrizB) {

        for (int z = 0; z < 3; z++) {
            for (int i = 0; i < 3; i++) {
                
                matrizB[i][z] = matriz[i][z];

                System.out.print(" " + matrizB[i][z]);

            }

            System.out.println("");
        }

    }
}
