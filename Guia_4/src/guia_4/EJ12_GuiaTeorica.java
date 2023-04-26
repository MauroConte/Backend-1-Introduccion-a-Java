/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_4;

import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Ejercicio 12 Crea un procedimiento EsMultiplo que reciba los dos números
 * pasados por el usuario, validando que el primer número múltiplo del segundo e
 * imprima si el primer número es múltiplo del segundo, sino informe que no lo
 * son.
 *
 */
public class EJ12_GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");

        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        esMultiplo(n1, n2);

    }

    public static void esMultiplo(int n1, int n2) {

        if (n1 % n2 == 0) {

            System.out.println("El primer numero es multiplo del segundo");

        } else {
            System.out.println("NO es multiplo");
        }

    }

}
