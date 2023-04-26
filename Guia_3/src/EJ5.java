
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
 * Escriba un programa en el cual se ingrese un valor límite positivo, 
 * y a continuación solicite números al usuario hasta que la suma de los números introducidos
 * supere el límite inicial.
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero limite");
        
        int limite = leer.nextInt();
        int suma = 0;
        System.out.println("Ahora ingrese numeros hasta que sumados supere el limite");
        
        do{
            
            int adicion = leer.nextInt();
            
            suma = suma + adicion;
            
            if (suma > limite){
                
                System.out.println("Supero el limite");
                
                System.out.println("La suma es " + suma);
            }
        }while(suma < limite);

    }
    
}
