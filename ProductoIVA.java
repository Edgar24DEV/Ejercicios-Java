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
public class ProductoIVA {
    
        public static void main(String[] args) {
            
            float precioSinIva;
            float importeTotal;
            
        Scanner reader = new Scanner(System.in);
        
        System.out.println("--CALCULA EL PRECIO CON IVA--");
        
        System.out.print("Dame el precio sin IVA: ");
        precioSinIva = reader.nextFloat();
        
        importeTotal = (float) ((precioSinIva) * 1.21);
        
        System.out.println("El importe total es de: " + importeTotal);

        }

            
}
