/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author mauro
 */
public class Juegos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int nOculto, nAdivina, intentos, triunfosJugador1, triunfosJugador2;

    public Juegos() {
    }

    public Juegos(int nOculto, int nAdivina, int intentos, int triunfosJugador1, int triunfosJugador2) {
        this.nOculto = nOculto;
        this.nAdivina = nAdivina;
        this.intentos = intentos;
        this.triunfosJugador1 = triunfosJugador1;
        this.triunfosJugador2 = triunfosJugador2;
    }

    public int getnOculto() {
        return nOculto;
    }

    public void setnOculto(int nOculto) {
        this.nOculto = nOculto;
    }

    public int getnAdivina() {
        return nAdivina;
    }

    public void setnAdivina(int nAdivina) {
        this.nAdivina = nAdivina;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getTriunfosJugador1() {
        return triunfosJugador1;
    }

    public void setTriunfosJugador1(int triunfosJugador1) {
        this.triunfosJugador1 = triunfosJugador1;
    }

    public int getTriunfosJugador2() {
        return triunfosJugador2;
    }

    public void setTriunfosJugador2(int triunfosJugador2) {
        this.triunfosJugador2 = triunfosJugador2;
    }

    public void iniciar_juego() {

        System.out.println("***MENU***");
//        System.out.println("");
//        System.out.println("Ingrese el nombre del Jugador 1");
//        String j1 = leer.next();
//        System.out.println("");
//        System.out.println("Ingrese el nombre del jugador 2");
//        String j2 = leer.next();

        System.out.println("");
        System.out.println("...");
        System.out.println("");

        String instruccion;

        do {

            System.out.println("Ingrese 1 o 2 para indicar el jugador que adivina: ");

            int jugador = leer.nextInt();
            int restante;

            if (jugador == 1) {

                restante = 2;

            } else {

                restante = 1;
            }

            System.out.println("Jugador " + restante + " ingrese el numero oculto");

            nOculto = leer.nextInt();

            System.out.println("");
            System.out.println("...");
            System.out.println("");

            System.out.println("Jugador " + jugador + " el numeros es... ");

            intentos = 0;

            do {

                nAdivina = leer.nextInt();
                intentos++;

                if (nAdivina == nOculto) {

                    System.out.println("Correcto!");
                    System.out.println("Lo lograste en: " + intentos + " intentos!");

                    if (jugador == 1) {
                        triunfosJugador1++;
                    } else {
                        triunfosJugador2++;
                    }
                    break;

                } else if (nAdivina < nOculto) {

                    System.out.println("Mas alto!");

                } else if (nAdivina > nOculto) {

                    System.out.println("Mas bajo!");

                } else if (intentos == 3) {

                    System.out.println("Se agotaron los intentos.");
                    break;
                }

            } while (intentos < 3);

            System.out.println("");

            System.out.println("Triunfos de cada jugador: ");
            System.out.println("Jugador: " + restante + ": " + triunfosJugador1 + " triunfos");
            System.out.println("Jugador: " + jugador + ": " + triunfosJugador2 + " triunfos");
            System.out.println("...");
            System.out.println("");
            System.out.println("Indique SALIR o DE NUEVO");
            instruccion = leer.next();

        } while (!"SALIR".equals(instruccion));
    }
}
