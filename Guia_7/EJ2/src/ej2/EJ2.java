/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * Método constructor que inicialice el radio pasado como parámetro. Métodos get
 * y set para el atributo radio de la clase Circunferencia. Método para
 * crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto. Método area(): para calcular el área de la circunferencia
 * (Area=〖π*radio〗^2). Método perimetro(): para calcular el perímetro
 * (Perimetro=2*π*radio).
 *
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        Circunferencia c1 = new Circunferencia();

        System.out.println("Ingrese el radio de una circunferencia");

        c1.crearCircunferencia(leer.nextInt());

        double area = c1.area(c1.getRadio());
        System.out.println("Area: " + area);

        double perimetro = c1.perimetro(c1.getRadio());
        System.out.println("Perimetro: " + perimetro);

    }

}
