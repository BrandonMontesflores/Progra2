/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encriptador;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class tarea2 {
    
    private static Scanner texto = new Scanner(System.in);
    
    public static String EncCod(String P){
      String respuesta = "";
      int N = 14;
      int cod = 0;
        for(int x=0; x<P.length();x++){
            cod =(int)P.charAt(x);
            cod = cod + N;
            char car =(char) cod;
            respuesta = respuesta + car;               
        }
        return respuesta;
    }
    public static String DesCod(String C,int N){
        String respuesta = "";
        int cod = 0;
        for(int x=0; x<C.length();x++){
            cod =(int)C.charAt(x);
            cod = cod - N;
            char car =(char) cod;
            respuesta = respuesta + car;             
        }
        return respuesta;      
    }
    public static void main(String[] args) {
        String P = "", respuesta = "", R = "";
        System.out.println("¡Escribe el mensaje que quieras!");
        P =texto.nextLine();
        respuesta = EncCod(P);
        System.out.println("Tu mensaje es " + respuesta);
        R = DesCod(respuesta, 14);
        System.out.println("El codigo es " + R);      
    }    
}
