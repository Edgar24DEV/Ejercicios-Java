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
public class SueldoBase {
    
    public static void main(String[] args) {
        
        float sueldoBase;
        float horasExtra;
        float precioHoraExtra;
        float sueldoBruto;
        float retencion;
        float sueldoNeto;
        
        Scanner reader = new java.util.Scanner(System.in);
        
        System.out.println("--CALCULO SUELDO NETO--");
        
        System.out.print("Inserte el sueldo base: ");
        sueldoBase = reader.nextFloat();
        
        System.out.print("Horas extras hechas: ");
        horasExtra = reader.nextFloat();
        
        System.out.print("Precio por hora extra: ");
        precioHoraExtra = reader.nextFloat();
        
        
        sueldoBruto = (sueldoBase + (horasExtra*precioHoraExtra));
        retencion = (float) (sueldoBruto * 0.19);
        sueldoNeto = sueldoBruto - retencion;
        
        System.out.println("El sueldo neto es de: " + sueldoNeto);
        
                


    }
}
