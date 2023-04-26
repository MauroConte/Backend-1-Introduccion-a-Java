/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Cuenta {

    Scanner leer = new Scanner(System.in);

    private String titular;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void retirar_dinero() {

        String respuesta;

        do {
            System.out.println("Ingrese el monto a retirar: ");

            int cantidad = leer.nextInt();

            if (cantidad > saldo) {

                System.out.println("ALERTA! Su saldo es negativo, no puede realizar la operacion");

            } else {

                saldo = saldo - cantidad;
                System.out.println("");
                System.out.println("Saldo actual: " + saldo);
            }
            System.out.println("");
            System.out.println("CONTINUAR para realizar otra operacion o escriba SALIR para terminar la extracción");
            respuesta = leer.next();

        } while (!"SALIR".equals(respuesta));

    }

}
