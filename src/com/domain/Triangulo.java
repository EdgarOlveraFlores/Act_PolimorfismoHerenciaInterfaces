
package com.domain;

/**
 *
 * @author olver
 */
public class Triangulo implements AccionesGlobales{
    
    private double base;
    private double altura;
    private double areaTriangulo;
    private double perimetroTriangulo;

    //Metodo constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //get y set de variable base
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    //Get y set de la variable altura
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //metodo para obtener el area
    public double getAreaTriangulo(){
        return areaTriangulo;
    }
    //metodo para obtener el perimetro
    public double getPerimetroTriangulo(){
        return perimetroTriangulo;
    }
    
    //Metodos sobreescritos de clase padre
    @Override
    public void area() {
        areaTriangulo = base * altura / 2;
    }

    //variables para obtener el peribetro del rectangulo (suma de todos los lados)
    private double ladoA=5;
    private double ladoB=6;
    private double ladoC=7;
    
    @Override
    public void perimetro() {
        perimetroTriangulo = ladoA + ladoB + ladoC;
    }
    
    
}
