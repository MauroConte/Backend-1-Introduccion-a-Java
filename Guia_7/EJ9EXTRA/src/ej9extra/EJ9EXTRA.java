/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9extra;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
 * "salario". Luego, crea un método "calcular_aumento" que calcule el aumento
 * salarial de un empleado en función de su edad y salario actual. El aumento
 * salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si
 * tiene menos de 30 años.
 *
 */
public class EJ9EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        Empleado e1 = new Empleado();
        
        
        System.out.println("***TRABAJO***");
        System.out.println("");
        System.out.println("Ingrese nombre, edad y salario del empleado");
        e1.setNombre(leer.next());
        e1.setEdad(leer.nextInt());
        e1.setSalario(leer.nextInt());
        System.out.println("");
        e1.calcular_aumento();
        
        
        
    }

}
