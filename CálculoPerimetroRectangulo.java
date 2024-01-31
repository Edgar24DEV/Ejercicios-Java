
package com.mycompany.programasbasicosjava;
import java.util.Scanner;


public class PerimetroRectangulo2 {
    
    public static void main(String[] args) {
        
        float base;
        float altura;
        float perimetro;
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("--CALCULA EL PERIMETRO DEL RECTANGULO");
        
         System.out.print("Dame la base: ");
        base = reader.nextFloat();
        
        System.out.print("Dame la altura: ");
        altura = reader.nextFloat();
        
        perimetro = ((2*base) + (2*altura));
        
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        
        
    }
    
        
    
}
