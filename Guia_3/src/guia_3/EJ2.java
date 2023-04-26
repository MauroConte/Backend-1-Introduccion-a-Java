/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

import java.util.Scanner;

/**
 *
 * @author mauro
 * 
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
 * sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra");
       
        boolean validacion = true;
        
        do{
        
        String frase = leer.next();
        String clave = "eureka";
        if (frase.equals(clave)){
       
        System.out.println("Correcto!");
        break;
        
        }else 
        
        System.out.println("Incorrecto");   
        
        
        }while(validacion = true);
    }
    
}
