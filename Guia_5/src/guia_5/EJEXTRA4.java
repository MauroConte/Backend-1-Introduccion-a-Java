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
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
 * aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4
 * notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las
 * ponderaciones de cada nota son: Primer trabajo práctico evaluativo 10%
 * Segundo trabajo práctico evaluativo 15% Primer Integrador 25% Segundo
 * integrador 50% Una vez cargadas las notas, se calcula el promedio y se guarda
 * en el arreglo. Al final del programa los profesores necesitan obtener por
 * pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo
 * aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 *
 * Primer trabajo práctico evaluativo 10% Segundo trabajo práctico evaluativo
 * 15% Primer Integrador 25% Segundo integrador 50%
 *
 */
public class EJEXTRA4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[][] tabla = new int[11][7];

        crearTabla(tabla);
    }

    public static void crearTabla(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {

            double promedio;
            boolean aprobado = false;

            for (int j = 0; j <= 7; j++) {

                int tpA = (int) (Math.random() * 10) + 1;
                int tpB = (int) (Math.random() * 10) + 1;
                int exA = (int) (Math.random() * 10) + 1;
                int exB = (int) (Math.random() * 10) + 1;

                if (i == 0 && j == 0) {

                    System.out.print("_______  ");

                } else if (i > 0 && j == 0) {
                    if (i == 10) {
                        System.out.print("Alumn" + i);
                    } else {
                        System.out.print("Alumno" + i);
                    }
                } else if (i == 0 && j == 1) {
                    System.out.print(" tpA ");
                } else if (i == 0 && j == 2) {
                    System.out.print(" tpB ");
                } else if (i == 0 && j == 3) {
                    System.out.print(" exA ");
                } else if (i == 0 && j == 4) {
                    System.out.print(" exB ");
                } else if (i == 0 && j == 5) {
                    System.out.print(" nFinal ");
                } else if (i == 0 && j == 6) {
                    System.out.print(" Aprobado");
                } else if (i == 0 && j == 7) {
                    System.out.print("");
                } else if (j == 1 && i > 0) {
                    if (tpA == 10) {
                        System.out.print("   " + tpA);
                    } else {
                        System.out.print("    " + tpA);
                    }
                } else if (j == 2 && i > 0) {
                    if (tpB == 10) {
                        System.out.print("    " + tpB);
                    } else {
                        System.out.print("     " + tpB);
                    }
                } else if (j == 3 && i > 0) {
                    if (exA == 10) {
                        System.out.print("   " + exA);
                    } else {
                        System.out.print("    " + exA);
                    }
                } else if (j == 4 && i > 0) {
                    if (exB == 10) {
                        System.out.print("   " + exB);
                    } else {
                        System.out.print("    " + exB);
                    }
                } else if (j == 5 && i > 0) {

                    promedio = (tpA * 0.10) + (tpB * 0.15) + (exA * 0.25) + (exB * 0.50);
                    System.out.print("    " + promedio);

                } else if (j == 6 && i > 0) {
                    
                    if (matriz[i][5] > 7.0) {
                        
                        aprobado = true;
                    }

                    System.out.print("   " + aprobado);

                } else if (j == 7 && i > 0) {

                }

            }

            System.out.println("");
        }

    }

}
}
