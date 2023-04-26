/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5). */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int centigrados;

        System.out.println("Ingrese una temperatura en grados centigrados");

        centigrados = leer.nextInt();

        int farenheit = 32 + (9 * centigrados / 5);

        System.out.println("El equivalente en Farenheit es: " + farenheit);

    }

}
