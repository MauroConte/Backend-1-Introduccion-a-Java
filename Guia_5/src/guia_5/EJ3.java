/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import static guia_5.EJ2.llenarVector;

/**
 *
 * @author mauro
 *
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] vector = new int[10];

        llenarVector(vector);
        
        System.out.println("");

        buscarN(vector);

    }

    public static void llenarVector(int[] vector) {

        int i;

        for (i = 0; i < 10; i++) {

            vector[i] = (int) (Math.random() * 10000);
            
            System.out.print(vector[i] + ", ");

        }

    }

    public static void buscarN(int[] vector) {

        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;

        for (int elemento : vector) {

            if (elemento > 0 && elemento < 10) {

                c1++;

            } else if (elemento > 9 && elemento < 100) {

                c2++;

            } else if (elemento > 99 && elemento < 1000) {

                c3++;

            } else if (elemento > 999 && elemento < 10000) {

                c4++;

            } else if (elemento > 9999 && elemento < 100000) {

                c5++;
            }

        }
        
        System.out.println("Numero de 1 digito que aparecen: " + c1);
        System.out.println("Numero de 2 digito que aparecen: " + c2);
        System.out.println("Numero de 3 digito que aparecen: " + c3);
        System.out.println("Numero de 4 digito que aparecen: " + c4);
        System.out.println("Numero de 5 digito que aparecen: " + c5);
    }

}
