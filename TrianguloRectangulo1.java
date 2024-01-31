/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programasbasicosjava;
import java.util.Scanner;

/**
 *
 * @author edgar
 */
public class TrianguloRectangulo1 {
    
    public static void main(String[] args) {
        
        float base;
        float altura;
        float resultado;
        
        Scanner reader = new java.util.Scanner(System.in);
        
        System.out.println("--CALCULA EL AREA DE UN TRIANGULO RECTANGULO--");
        
        System.out.print("Dame la base: ");
        base = reader.nextFloat();
        
        System.out.print("Dame la altura: ");
        altura = reader.nextFloat();
        
        resultado = (base * altura)/2;
        
        System.out.println("La superficie es: " + resultado);
       
    }
    
}
