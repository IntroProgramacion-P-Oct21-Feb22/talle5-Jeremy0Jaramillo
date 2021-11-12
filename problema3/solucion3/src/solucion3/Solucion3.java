/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solucion3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author fabri
 */
public class Solucion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double precioventa;
        double impuestopagar = 0;
        double impuestosobre;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();

        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();

        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania")) {
            impuestopagar = 20;
            impuestosobre = (costo * impuestopagar) / 100;
            precioventa = costo - impuestosobre;

        } else {
            if (origen.equals("Japón")) {
                impuestopagar = 30;
                impuestosobre = (costo * impuestopagar) / 100;
                precioventa = costo - impuestosobre;
            } else {
                if (origen.equals("Italia")) {
                    impuestopagar = 15;
                    impuestosobre = (costo * impuestopagar) / 100;
                    precioventa = costo - impuestosobre;
                } else {
                    if (origen.equals("USA")) {
                        impuestopagar = 8;
                        impuestosobre = (costo * impuestopagar) / 100;
                        precioventa = costo - impuestosobre;
                    } else {
                        precioventa = costo;
                    }

                }

            }
        }
        
        System.out.printf("La marca del auto es: %s\n", marca);
        
        System.out.printf("El impuesto a pagar es de: %.4s", impuestopagar);
        System.out.println("%");
        //no me dejaba poner el procentaje en la línea anterior, por algún motivo simplemente no lo mostraba
        //en el output del programa sin importar las diferentes formas que intente de ponerlo.
        
        System.out.printf("Y el precio de venta incluyendo impuestos es: %.10s\n",  "$" + precioventa);
    }
}
