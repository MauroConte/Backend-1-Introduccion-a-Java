/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

/**
 *
 * @author mauro
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] matriz = new int[3][3];
        int[][] matrizB = new int[3][3];

        llenarMatriz(matriz);

        System.out.println("-------");

        trasponerMatriz(matrizB, matriz);

    }

    public static void llenarMatriz(int[][] matriz) {

        for (int i = 0; i < 3; i++) {
            for (int z = 0; z < 3; z++) {

                matriz[i][z] = (int) (Math.random() * (3 - (-3)+1) + (-3));

                System.out.print(" " + matriz[i][z]);

            }
            System.out.println("");

        }
    }

    public static void trasponerMatriz(int[][] matrizB, int[][] matriz) {

        for (int z = 0; z < 3; z++) {
            for (int i = 0; i < 3; i++) {

                if (-matrizB[i][z] != matriz[i][z]) {

                    System.out.println("La matriz NO es antisimetrica");
                    break;
             
                }else
                    
                    System.out.print(" " + matrizB[i][z]);
                    
            }

            System.out.println("");
        }

    }

}
