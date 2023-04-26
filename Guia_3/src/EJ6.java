
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
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y
 * el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
 * que, si el usuario selecciona la opción 5, en vez de salir del programa
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
 * seguro que desea salir del programa (S/N)? Si el usuario selecciona el
 * carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el
 * menú.
 *
 *
 */
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");

        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        boolean validacion = true;
        System.out.println("Ahora seleccione una opcion del menu");

        do {
            
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("");
            System.out.println("Elija opcion:");

            int respuesta = leer.nextInt();
           
            
            switch (respuesta) {

                case 1:
                    System.out.println("El resultado es " + (n1 + n2));
                    continue;
                    
                case 2:
                    System.out.println("El resultado es " + (n1 - n2));
                    continue;
                    
                case 3:
                    System.out.println("El resultado es " + n1 * n2);
                    continue;
                    
                case 4:
                    System.out.println("El resultado es " + n1 / n2);
                    continue;
                    
                case 5:
                    System.out.println("Está seguro que desea salir del programa? S/N");
                    String confirmar = leer.next();
                    
                    if("S".equals(confirmar))
                        
                        validacion = false;
            
            }
 
        } while (validacion == true);

    }

}


