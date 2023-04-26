
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
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 * este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas
 * deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres
 * de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y
 * toda secuencia distinta de FDE, que no respete el formato se considera
 * incorrecta. Al finalizar el proceso, se imprime un informe indicando la
 * cantidad de lecturas correctas e incorrectas recibidas. Para resolver el
 * ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
 * Substring(), Length(), equals().
 *
 */
public class EJ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese palabras para un dispositivo RS232");
        String mensaje;
        int largo;
        int correctas = 0;
        int incorrectas = 0;
        boolean acierto = true;
        String fde = "&&&&&";
        String equis = "x";
        String o = "o";

        do {
            mensaje = leer.next();
            largo = mensaje.length();
            String primerLetra = mensaje.substring(0, 1);
            String ultimaLetra = mensaje.substring(largo - 1);

            if (mensaje.equals(fde)) {

                break;

            } else if (primerLetra.equals(equis) && ultimaLetra.equals(o) && largo == 5) {

                correctas = correctas + 1;

            } else if (acierto == true) {

                incorrectas = incorrectas + 1;

            }

        } while (acierto = true);

        System.out.println("Lecturas correctas = " + correctas);
        System.out.println("Lecturas incorrectas = " + incorrectas);

    }

}
