/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Solucion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double edad;
        double costokilovatiohora;
        double kilovatiosmes;
        double porcentaje = 10;
        double descuento;
        double valortotal;
        
        System.out.println("Ingreses su edad por favor");
        edad = entrada.nextDouble();
        
        System.out.println("Ingrese el costo de kilovatio por hora ");
        costokilovatiohora = entrada.nextDouble();
        
        System.out.println("Ingrese los kilovatios consumidos en el mes");
        kilovatiosmes = entrada.nextDouble();
        
       valortotal = kilovatiosmes * costokilovatiohora;
       
       if (edad>65) {
           
           descuento = (valortotal * porcentaje)/100;
           valortotal = valortotal - descuento;
           
           System.out.printf("El valor a cancelar es: %.2f\n", valortotal);
            
        }else{
           System.out.printf("El valor a cancelar es: %.2f\n", valortotal);
       }
       
      
                 
    }
    
}
