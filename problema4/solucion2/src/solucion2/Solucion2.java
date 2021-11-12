/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion2;

import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Solucion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int numerodias;
        double preciohabitacion;
        double subtotal;
        double descuento1;
        double porcentaje1 = 10;
        double porcentaje2 = 15;
        double porcentaje3 = 20;
        double totalpagar = 0;
        
        
        System.out.println("Ingreses el número de días en la hostería");
        numerodias = entrada.nextInt();
        
        System.out.println("Ingrese el precio de la habitación");
        preciohabitacion = entrada.nextDouble();
        
        subtotal = preciohabitacion * numerodias;
        
        if (numerodias > 5 && numerodias <= 10) {
            descuento1 = (porcentaje1 * subtotal)/100;
            totalpagar = subtotal - descuento1;
            
        }else{
            if (numerodias > 10 && numerodias <= 15) {
                descuento1 = (porcentaje2 * subtotal)/100;
                totalpagar = subtotal - descuento1;
            }else{
                if (numerodias > 15 && numerodias <= 20) {
                descuento1 = (porcentaje3 * subtotal)/100;
                totalpagar = subtotal - descuento1;
                }else{
                    if (numerodias < 5) {
                        totalpagar = subtotal;
                    }
                    }
                }
        }
        
        System.out.printf("El total por pagar es: %.2f\n", totalpagar);
        
        }
                
    }
    

