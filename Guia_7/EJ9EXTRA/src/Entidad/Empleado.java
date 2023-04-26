/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author mauro
 */
public class Empleado {

    private String nombre;
    private int edad, salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void calcular_aumento() {
        double aumento = 0;

        if (edad >= 30) {

            aumento = salario * 0.10;

        } else if (edad < 30) {

            aumento = salario * 0.05;
        }

        System.out.println(nombre + " de " + edad + " años de edad, recibe un aumento de "
                + aumento + " pesos. Su salario total es " + (salario + aumento) + " pesos.");

    }

}
