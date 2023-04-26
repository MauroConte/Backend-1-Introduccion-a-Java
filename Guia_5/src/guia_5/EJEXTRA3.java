/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author mauro Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
 * caracteres y, a medida que el usuario las va ingresando, construya una “sopa
 * de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se
 * ubicarán todas en orden horizontal en una fila que será seleccionada de
 * manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los
 * espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
 * por pantalla la sopa de letras creada. Nota: Para resolver el ejercicio
 * deberá investigar cómo se utilizan las siguientes funciones de Java
 * substring(), Length() y Math.random().
 *
 */
public class EJEXTRA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[][] sopaDeLetras = new String[20][20];

        llenarSopa(sopaDeLetras);

    }

    public static void llenarSopa(String[][] sopaDeLetras) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 5 palabras, de 3 o hasta 5 caracteres, para la sopa de letras");

        int cantidadPalabras = 0;

        while (cantidadPalabras < 5) {

            String palabra = leer.next();
            cantidadPalabras++;

            int aleatorioFilas = (int) (Math.random() * 19);
            int aleatorioColumnas = (int) (Math.random() * 14);
            int c = 0;

            int i = aleatorioFilas;
            int recorrido = aleatorioColumnas + palabra.length();

            for (int j = aleatorioColumnas; j < recorrido; j++) {

                sopaDeLetras[i][j] = palabra.substring(c, c + 1);
                c++;

            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                if (sopaDeLetras[i][j] == null) {

                    int numAleatorio = (int) (Math.random() * 9);
                    sopaDeLetras[i][j] = String.valueOf(numAleatorio);

                }

            }
        }
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {

                System.out.print(sopaDeLetras[i][j] + " ");

            }
            System.out.println("");
        }

    }

}
