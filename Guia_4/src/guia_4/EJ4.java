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
 * Crea una aplicación que nos pida un número por teclado y con una función se
 * lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 *
 *
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es primo o no");
        int primo = leer.nextInt();

        System.out.println(esPrimo(primo));

    }

    public static boolean esPrimo(int primo) {

        int contador = 0;
        boolean validacion = true;
        
        for (int i = 2; i < primo; i++) {

            if (primo % i == 0) {

                contador++;
            }

        }
        if (contador > 0) {

            validacion = false;
        }

        return validacion;
    }
}
