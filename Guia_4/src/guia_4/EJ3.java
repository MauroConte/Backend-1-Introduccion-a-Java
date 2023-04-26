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
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 *
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cantidad de euros para hacer la conversion");

        double euros = leer.nextInt();

        conversion(euros, "libras");
        conversion(euros, "dolares");
        conversion(euros, "yenes");
    }

    public static void conversion(double euros, String moneda) {

        switch (moneda) {

            case "libras":

                double libras = euros * 0.86;

                System.out.println(euros + " euros = " + libras + " " + moneda);
                break;

            case "dolares":

                double dolar = euros * 1.28611;

                System.out.println(euros + " euros = " + dolar + " " + moneda);
                break;

            case "yenes":

                double yen = euros * 129.852;

                System.out.println(euros + " euros = " + yen + " " + moneda);
                break;
        }

    }

}
