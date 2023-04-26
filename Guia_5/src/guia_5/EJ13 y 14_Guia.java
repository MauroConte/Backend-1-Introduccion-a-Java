/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_5;

import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Ejercicio 13 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad
 * de compañeros de equipo y define su tipo de dato de tal manera que te permita
 * alojar sus nombres más adelante.
 *
 * Ejercicio 14 Utilizando un Bucle for, aloja en el vector Equipo, los nombres
 * de tus compañeros de equipo
 *
 *
 */
public class EJ13_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[10];

        for (String elemento : equipo) {

            System.out.println("Ingrese nombre de integrante de equipo");
            elemento = leer.next();

        }

    }

}
