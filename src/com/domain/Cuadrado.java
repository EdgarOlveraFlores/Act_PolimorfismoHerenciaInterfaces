
package com.domain;

/**
 *
 * @author olver
 */
public class Cuadrado implements AccionesGlobales{

    private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;

    //Metodo constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Metodos get y set para manejar el atributo 'lado'
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Metodo para obtener area
    public double getAreaCuadrado(){
        return areaCuadrado;
    }
    //Metodo para obtener perimetro
    public double getPerimetroCuadrado(){
        return perimetroCuadrado;
    }
    
    
    // Sobreescribiendo metodos de la clase padre donde se incluyen las operaciones
    @Override
    public void area() {
        areaCuadrado = lado *lado;
    }
    @Override
    public void perimetro() {
        perimetroCuadrado = lado+lado+lado+lado;
    }
    
}
