/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        String frase;
        String fMin;
        String fMay;

        System.out.println("Ingrese una frase");

        frase = leer.next();

        System.out.println("La frase en minuscula es : " + frase.toLowerCase());

        System.out.println("La frase en mayusculas es : " + frase.toUpperCase());

    }

}
