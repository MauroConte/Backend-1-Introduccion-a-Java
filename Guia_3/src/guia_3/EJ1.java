/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3;

/**
 *
 * @author mauro
 * 
 * Crear un programa que dado un número determine si es par o impar.
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int numero = (int) (Math.random()*100) + 1 ;
        System.out.println(numero);
        
       int resto = numero % 2;
       
       if (resto == 0) 
            System.out.println("Par");
       
       else 
            System.out.println("Impar");
        
    }
    
}
