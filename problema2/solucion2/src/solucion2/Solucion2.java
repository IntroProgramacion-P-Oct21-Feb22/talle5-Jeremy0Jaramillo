/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion2;

import java.util.Locale;
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
        entrada.useLocale(Locale.US);
        
        String nombre;
        int cantidad;
        double precioU;
        double valortotal;
        double porcentaje = 15;
        double descuento;
        
        System.out.println("Ingrese el nombre del artículo");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la cantidad de artículos");
        cantidad = entrada.nextInt();
        
        System.out.println("Ingrese el precio unitario del producto");
        precioU = entrada.nextDouble();
        
        valortotal = cantidad * precioU;
        
        
        if (cantidad > 50) {
            descuento = (porcentaje * valortotal)/100;
            valortotal = valortotal - descuento;
        }
        
        System.out.printf("El valor total por pagar de: %s %s es $%.10s\n", cantidad, nombre, valortotal);
        
        }
        
    }
    

