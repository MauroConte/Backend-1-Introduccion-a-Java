/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de la suma

 */
package egg.introjava;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3; 
        
        System.out.println("Ingrese dos numeros para sumarlos");
        
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = num1 + num2;
        
        System.out.println("La suma es: " + num3 );
        
        
        
        
    }
    
}
