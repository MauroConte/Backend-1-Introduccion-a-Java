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
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 *
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numero y luego seleccione una opcion del menu");

        int n1 = leer.nextInt();
        int n2 = leer.nextInt();

        System.out.println("");
        System.out.println("MENU");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");

        int opcion = leer.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("La suma es: " + suma(n1, n2));
                break;
                
            case 2:
                
                System.out.println("La resta es: " + resta(n1,n2));
                break;
                
            case 3:
                
                System.out.println("La multiplicacion es: " + multiplicar(n1,n2));
                break;
                
            case 4:
                
                System.out.println("La division es: " + dividir(n1,n2));
                break;

        }

    }

    public static int suma(int n1, int n2) {

        int sumar;

        sumar = n1 + n2;

        return sumar;
    }

    public static int resta(int n1, int n2) {

        int restar;

        restar = n1 - n2;

        return restar;
    }

    public static int multiplicar(int n1, int n2) {

        int multiplicacion;

        multiplicacion = n1 * n2;

        return multiplicacion;
    }

    public static int dividir(int n1, int n2) {

        int division;

        division = n1 / n2;

        return division;
    }

}
