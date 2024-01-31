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
public class SumaCifras {
    

        public static void main(String[] args) {
            
           Scanner reader = new java.util.Scanner(System.in);
           
           int num;
           int d1;
           int d2;
           int d3;
           int d4;
           int suma;
           
           System.out.println("--SUMA LAS CIFRAS DE UN NÚMERO DE 4 CIFRAS--");
           
            System.out.print("Ingrese un número de 4 cifras: ");
               num = reader.nextInt();
               
               if (num > 999 && num < 9999){
                      
               d1 = num%10;
               
               num = num/10;
               d2 = num%10;
               
               num = num/10;
               d3 = num%10;
               
               d4 = num/10;
               
               suma = d1 + d2 + d3 + d4;
           
           
           System.out.println("La suma de los digito es: " + suma);
           
               }else{
                   System.out.println("El número no es de 4 cifras");
               }

        }
}
