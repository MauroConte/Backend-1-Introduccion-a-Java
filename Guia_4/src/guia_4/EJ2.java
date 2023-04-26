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
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 *
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese nombre y edad de N personas");
        String respuesta;
        do {

            String nombre = leer.next();

            int edad = leer.nextInt();

            datos(nombre, edad);

            System.out.println("Desea seguir mostrando personas? Si/No");
            respuesta = leer.next();

        } while ("Si".equals(respuesta));

    }

    public static void datos(String nombre, int edad) {

        boolean mayor;

        if (edad < 18) {

            mayor = false;
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Mayoria de edad: " + mayor);

        } else if (edad >= 18) {

            mayor = true;
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Mayoria de edad: " + mayor);

        }

    }

}
