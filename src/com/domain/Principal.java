
package com.domain;

import java.util.Scanner;

/**
 *
 * @author olver
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        int opcion;

        System.out.println("Que figura deseas obtener area y perimetro");
        System.out.println("1 Circulo\n2 Cuadrado\n3 Triangulo\n4 Rectangulo");
        System.out.println("Ingresa un numero entero del 1 al 4: ");
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                //Instanciamos un objeto cuadrado
                Circulo circulo1 = new Circulo(200);                
                //Obtenermos el area y perimetro de figuras
                circulo1.area();  
                circulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+circulo1);

                break;
            case 2:
                //Instanciamos un objeto cuadrado
                Cuadrado cuadrado1 = new Cuadrado(10);                
                //Obtenermos el area y perimetro de figuras
                cuadrado1.area();  
                cuadrado1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+cuadrado1.getAreaCuadrado());
                System.out.println("Perimetro del cuadrado: "+cuadrado1.getPerimetroCuadrado());
                break;
            case 3:
                //Instanciamos un objeto cuadrado
                Triangulo triangulo1 = new Triangulo(5, 10);              
                //Obtenermos el area y perimetro de figuras
                triangulo1.area();  
                triangulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del triangulo: "+triangulo1.getAreaTriangulo());
                System.out.println("Perimetro del triangulo: "+triangulo1.getPerimetroTriangulo());
                break;
            case 4:
                //Instanciamos un objeto cuadrado
                Rectangulo rectangulo1 = new Rectangulo(100, 20);
                //Obtenermos el area y perimetro de figuras
                rectangulo1.area();  
                rectangulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+rectangulo1.getAreaRectangulo());
                System.out.println("Perimetro del cuadrado: "+rectangulo1.getParametroRectangulo());
                break;
            default:
                System.out.println("Error, ingresa un numero del 1 al 4"); break;
                
       /* //Entrada de datos para la opcion del usuario
        
        //Instanciamos las clases 'circulo' 'cuadrado' 'rectangulo' 'triangulo'
        
        Cuadrado cuadrado1 = new Cuadrado(10);
        Circulo circulo1 = new Circulo(200);
        Rectangulo rectangulo1 = new Rectangulo(100, 20);
        Triangulo triangulo1 = new Triangulo(5, 10);
        
        
        
        //Obtenermos el area y perimetro de figuras
        cuadrado1.area();  
        cuadrado1.perimetro();  
        //Mostramos en pantalla:
        System.out.println("Area del cuadrado: "+cuadrado1.getAreaCuadrado());
        System.out.println("Perimetro del cuadrado: "+cuadrado1.getPerimetroCuadrado());
                ...Insertando opciones a un case
        */
       
    }
    
    /*
    public void Menu(){
        Scanner entrada =new Scanner(System.in);
        
        int opcion;

        System.out.println("Que figura deseas obtener area y perimetro");
        System.out.println("1 Circulo\n2 Cuadrado\n3 Triangulo\n4 Rectangulo");
        System.out.println("Ingresa un numero entero del 1 al 4: ");
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                //Instanciamos un objeto cuadrado
                Circulo circulo1 = new Circulo(200);                
                //Obtenermos el area y perimetro de figuras
                circulo1.area();  
                circulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+circulo1);

                break;
            case 2:
                //Instanciamos un objeto cuadrado
                Cuadrado cuadrado1 = new Cuadrado(10);                
                //Obtenermos el area y perimetro de figuras
                cuadrado1.area();  
                cuadrado1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+cuadrado1.getAreaCuadrado());
                System.out.println("Perimetro del cuadrado: "+cuadrado1.getPerimetroCuadrado());
                break;
            case 3:
                //Instanciamos un objeto cuadrado
                Triangulo triangulo1 = new Triangulo(5, 10);              
                //Obtenermos el area y perimetro de figuras
                triangulo1.area();  
                triangulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del triangulo: "+triangulo1.getAreaTriangulo());
                System.out.println("Perimetro del triangulo: "+triangulo1.getPerimetroTriangulo());
                break;
            case 4:
                //Instanciamos un objeto cuadrado
                Rectangulo rectangulo1 = new Rectangulo(100, 20);
                //Obtenermos el area y perimetro de figuras
                rectangulo1.area();  
                rectangulo1.perimetro();  
                //Mostramos en pantalla:
                System.out.println("Area del cuadrado: "+rectangulo1.getAreaRectangulo());
                System.out.println("Perimetro del cuadrado: "+rectangulo1.getParametroRectangulo());
                break;
            default:
                System.out.println("Ingresa un numero del 1 al 4");
                throw new AssertionError(); 
        }
    }*/
    }
}
    
