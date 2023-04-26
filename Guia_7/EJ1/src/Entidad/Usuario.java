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
public class Usuario {

    private String nombre, apellido;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public void setEdad(int edad) {

        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
    

}
