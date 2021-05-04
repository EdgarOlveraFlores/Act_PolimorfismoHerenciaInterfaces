
package com.domain;

/**
 *
 * @author olver
 */
public class Rectangulo implements AccionesGlobales{
    
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetroRectangulo;
    
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }    
    
    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base= base;
    }
    public double getAltura(){
        return altura;
    }
    public double setAltura(){
        return altura;
    }
    public double getAreaRectangulo(){
        return areaRectangulo;
    }
    public double getParametroRectangulo(){
        return perimetroRectangulo;
    }

    @Override
    public void area() {
        areaRectangulo = base * altura;
    }

    @Override
    public void perimetro() {
        perimetroRectangulo = 2 * base + altura;
    }
}
