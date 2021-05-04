
package com.domain;

/**
 *
 * @author olver
 */


public class Circulo implements AccionesGlobales{

    private double radio;
    private double areaRadio;
    private double perimetroCirculo;
    static final double pi=3.1415;
    
    //Metodo constructor para recibir el valor del radio del circulo
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public void getAreaRadio(double radio){
        this.radio = radio;
    }

    
    //Sobreescribimos los metodos padres con las operaciones de las figuras
    @Override
    public void area() {
        areaRadio = pi * radio * radio;
    }
    
    @Override
    public void perimetro() {
        perimetroCirculo = 2 * pi * radio;
    }
    
    
    
}
