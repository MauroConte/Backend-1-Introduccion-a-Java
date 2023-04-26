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
 * Ejercicio 11 Escribir un programa que procese una secuencia de caracteres
 * ingresada por teclado y terminada en punto, y luego codifique la palabra o
 * frase ingresada de la siguiente manera: cada vocal se reemplaza por el
 * carácter que se indica en la tabla y el resto de los caracteres (incluyendo a
 * las vocales acentuadas) se mantienen sin cambios. a e i o u
 * @ # $ * %
 *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 *
 *
 */
public class EJ11_GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una secuencia de caracteres y termine con un punto.");

        String mensaje = leer.nextLine();

        String nuevoMensaje = codificacion(mensaje);

        System.out.println(nuevoMensaje);

    }

    public static String codificacion(String mensaje) {

        String cod = "";

        for (int i = 0; i < mensaje.length(); i++) {

            String recorrido = mensaje.substring(i, i + 1);

            switch (recorrido) {

                case "a":

                    cod = cod.concat("@");
                    break;

                case "e":

                    cod = cod.concat("#");
                    break;

                case "i":

                    cod = cod.concat("$");
                    break;

                case "o":

                    cod = cod.concat("*");
                    break;

                case "u":

                    cod = cod.concat("%");
                    break;

                default:

                    cod += recorrido;

            }

        }

        return cod;
    }

}
