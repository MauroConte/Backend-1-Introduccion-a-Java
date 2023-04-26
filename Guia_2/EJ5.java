/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
package egg.introjava;

import java.util.Scanner;

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

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        System.out.println("El doble del numero es " + num * 2 + ", el triple del numero es " + num * 3 + ", y la raiz cuadradada es " + Math.sqrt(num));

    }

}
