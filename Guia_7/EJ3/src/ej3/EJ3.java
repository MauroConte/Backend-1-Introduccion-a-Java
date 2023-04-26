/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos: Método
 * constructor con todos los atributos pasados por parámetro. Método constructor
 * sin los atributos pasados por parámetro. Métodos get y set. Método para
 * crearOperacion(): que le pide al usuario los dos números y los guarda en los
 * atributos del objeto. Método sumar(): calcular la suma de los números y
 * devolver el resultado al main. Método restar(): calcular la resta de los
 * números y devolver el resultado al main Método multiplicar(): primero valida
 * que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
 * el método devuelve 0 y se le informa al usuario el error. Si no, se hace la
 * multiplicación y se devuelve el resultado al main Método dividir(): primero
 * valida que no se haga una división por cero, si fuera a pasar una división
 * por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al
 * main.
 *
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Operacion o1 = new Operacion();

        System.out.println("Ingrese dos valores para operar: ");

        o1.crearOperacion(leer.nextInt(), leer.nextInt());
        System.out.println("");

        System.out.println("Suma: " + o1.suma(o1.getNum1(), o1.getNum2()));
        System.out.println("");

        System.out.println("Resta: " + o1.resta(o1.getNum1(), o1.getNum2()));
        System.out.println("");

        System.out.println("Multiplicacion: " + o1.multiplicar(o1.getNum1(), o1.getNum2()));
        System.out.println("");

        System.out.println("Division: " + o1.division(o1.getNum1(), o1.getNum2()));
        System.out.println("");

    }

}
