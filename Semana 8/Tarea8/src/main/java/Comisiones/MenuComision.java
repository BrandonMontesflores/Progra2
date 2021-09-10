/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comisiones;

import Negocio.CatalogoNegocio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MenuComision {
    
    CatalogoNegocio Cat = new CatalogoNegocio();
    
    public void Menu(){
    Scanner Lector=new Scanner(System.in);
        String op = "";
        int op2 = 0;
        
        do {      
        System.out.println("1 Ingresar\n"
                + "2 Venta mayor y menor\n"
                + "3 Venta total\n"
                + "4 Editar nombre\n"
                + "5 Editar cantidad\n"
                + "6 Borrar\n"
                + "7 Buscar\n"
                + "8 Tabla\n"
                + "9 Salir");
        System.out.println("Elije una opcion "); 
        op = Lector.nextLine();
        
        switch(op){
             case "1":
                Cat.Ingresar();
                break;
            case "2":
                Cat.VentaMay();
                System.out.println("\n");
                Cat.VentaMen();
                break;
            case "3":
                Cat.VentaMayorT();
                break;
            case "4":
                Cat.EditarNom();
            case "5":
                Cat.EditarCan();
                break;
            case "6":
                Cat.BorrarEmpleado();
                break;
            case "7":
                Cat.Busqueda();
                break;
            case "8":
                Cat.Imprimir();
                break;    
          }
        } while(!op.equals("9"));
        
        System.out.println("Deseas salir\n"
                + "1 Salir\n"
                + "2 Menu");
        System.out.println("Opcion "); 
        op2 = Lector.nextInt();
         
        if (op2==1) {
            System.exit(0);
        }
        if (op2==2) {
            Menu();
        }
    }
}
