
package com.mycompany.programasbasicosjava;
import java.util.Scanner;


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
        // Recibimos toda la información.
        System.out.print("Inserte el sueldo base: ");
        sueldoBase = reader.nextFloat();
        
        System.out.print("Horas extras hechas: ");
        horasExtra = reader.nextFloat();
        
        System.out.print("Precio por hora extra: ");
        precioHoraExtra = reader.nextFloat();
        
        // Sumamos el valor de las horas extras al sueldo base.
        sueldoBruto = (sueldoBase + (horasExtra*precioHoraExtra));
        retencion = (float) (sueldoBruto * 0.19);    // Calculamos las retenciones.
        sueldoNeto = sueldoBruto - retencion; // Restamos las retenciones al sueldo bruto.
        // Mostramos el resultado.
        System.out.println("El sueldo neto es de: " + sueldoNeto);
        
                


    }
}
