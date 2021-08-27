/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea6;

import Comision.Comisiones;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuComision {
    
    Comisiones C = new Comisiones();
    
    public void Menu(){
    Scanner Lector=new Scanner(System.in);
        String op = "";
        int op2 = 0;
        
        do {      
        System.out.println("1 Ingresar  Informacion\n"
                + "2 Venta mayor y menor por mes\n"
                + "3 Venta de todos los meses\n"
                + "4 Editar\n"
                + "5 Buscar\n"
                + "6 Tabla\n"
                + "7 Salir");
        System.out.println("Elije una opcion "); op=Lector.nextLine();
        
        switch(op){
            case "1":
                C.RegistraInformacion();
                C.Calcular();
                break;
            case "2":
                C.VentaMayorMes();
                System.out.println("\n");
                C.VentaMenorMes();
                break;
            case "3":
                C.VentaMayor();
                break;
            case "4":
                C.ModificarRegistro();
                break;
            case "5":
                C.Buscar();
                break;
            case "6":
                C.ImprimirInformacion();
                break;
          }
        } while(!op.equals("7"));
        
        System.out.println("Deseas salir\n"
                + "8 Salir\n"
                + "9 Menu");
        System.out.println("Opcion: "); op2=Lector.nextInt();
         
        if (op2==8) {
            System.exit(0);
        }
        if (op2==9) {
            Menu();
        }
    }
}
