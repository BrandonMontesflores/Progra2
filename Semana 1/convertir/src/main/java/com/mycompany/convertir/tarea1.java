/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.convertir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */

public class tarea1 {
    
public static void main (String arg[]) throws IOException{
        
       BufferedReader lector=new BufferedReader (new InputStreamReader(System.in));
       Scanner lectornum=new Scanner(System.in);
       
       String nombre,con;
       double cantidad,total;
       int numero=1;
       
       while(numero==1){
       System.out.println("¿Como te llamas?");
       nombre= lector.readLine();
       System.out.println("Ingresa la cantidad de quetzales");
       cantidad=lectornum.nextDouble();
       System.out.println("¿En que moneda deseas convertir?\n"
               + "Ingresa la moneda que deseas\n"
               + "(dolares) Dolares 0.13\n"
               + "(euros) Euros 0.11\n"
               + "(yuanes) Yuanes 0.84");
       con=lector.readLine();
       
       switch(con){
           case "dolares":
               total= cantidad * 0.13;
               System.out.println("Tu nombre es " + nombre);
               System.out.println("El total convertido es: $"+ total);
               break;
           case "euros":
               total= cantidad * 0.11;
               System.out.println("Tu nombre es " + nombre);
               System.out.println("El total convertido es: €"+ total);
               break;
           case "yuanes":
               total= cantidad * 0.84;
               System.out.println("Tu nombre es " + nombre);
               System.out.println("El total convertido es: ¥"+ total);
               break;      
           default: 
              System.out.println("Opcion no valida");
              break;  
       } 
       System.out.println("¿Quieres volver a convertir?");
       System.out.println("Presiona el 1 para continuar");
       System.out.println("Presiona el 2 para salir");
       numero=lectornum.nextInt();       
       }  
       
    }         

}
