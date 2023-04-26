/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8extra;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author mauro
 *
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego,
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después
 * de realizar una transacción de retiro.
 *
 */
public class EJ8EXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        Cuenta c1 = new Cuenta();

        System.out.println("***CAJERO AUTOMATICO***");
        System.out.println("");
        System.out.println("Ingrese titular: ");
        c1.setTitular(leer.next());
        System.out.println("");
        c1.setSaldo((int) (Math.random() * 100));
        System.out.println("Su saldo actual es: " + c1.getSaldo());

        System.out.println("");
        c1.retirar_dinero();

    }

}
