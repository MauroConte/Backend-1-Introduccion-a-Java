/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author mauro
 *
 *
 */
public class Circunferencia {

    private double radio;
   
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia(double radio) {
        this.radio = radio;

    }
    
    public double area(double radio){
        
        double area = Math.PI * Math.pow(radio, 2);
        
        return area;
    }
    
    public double perimetro(double radio){
        
        double perimetro = 2 * Math.PI * radio;
        
        return perimetro;
    }

    

}
