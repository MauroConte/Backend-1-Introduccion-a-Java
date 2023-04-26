
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mauro
 * 
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

 */
public class EJ3 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Frase o palabra de 8 caracteres de largo: ");

        do{
            
        String palabra = leer.next(); 
        int longitud = palabra.length();
            
            if(longitud == 8){
                
                System.out.println("Correcto");
                
            }else{
                
                System.out.println("Incorrecto. Intente de nuevo");
            
            }while(longitud != 8)

         
        
        
