/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comision;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Comisiones {
    
    Scanner Lector=new Scanner(System.in);
    
    public List<Datos> Comisiones = new ArrayList<Datos>();
    
    double SumaEnero,sumaFebrero,SumaMarzo;
    
    public Datos RegistraInformacion(){
        Datos Car = new Datos(); 
        System.out.println("Ingresa el numero de personas ");
        int cant=Lector.nextInt();
        for (int i = 0; i <cant; i++) {
            System.out.println("Ingresa el nombre");
            Car.setNombre(Lector.nextLine());
            Car.setNombre(Lector.nextLine());
            System.out.println("Ingresa las ventas de enero");
            Car.setEnero(Lector.nextDouble());
            System.out.println("Ingresa las ventas de febrero");
            Car.setFebrero(Lector.nextDouble());
            System.out.println("Ingresa las ventas de marzo");
            Car.setMarzo(Lector.nextDouble());
            Comisiones.add(Car);
            Car = new Datos();         
        }
        return Car;
    
    }

    public void Calcular(){
        SumaEnero = 0.0; sumaFebrero = 0.0; SumaMarzo = 0.0;
        for (Datos Cal : Comisiones) {
             SumaEnero+=Cal.getEnero();
             sumaFebrero+=Cal.getFebrero();
             SumaMarzo+=Cal.getMarzo();
             Cal.setVentasTotales(Cal.getEnero() + Cal.getFebrero() + Cal.getMarzo());
             Cal.setPromedio(Cal.getVentasTotales() / 3);
             Cal=new Datos();
        }
    }
   
    public void ImprimirInformacion(){
        System.out.println("\n---NOMBRE---ENERO---FEBRERO---MARZO---TOTAL---PROMEDIO");
        for(Datos Car :Comisiones){
            System.out.println("---"+Car.getNombre()+"---Q"+Car.getEnero()+"---Q"+Car.getFebrero()+"---Q"+Car.getMarzo()+"---Q"+Car.getVentasTotales()+"--Q"+Car.getPromedio());     
        }
        System.out.println("\nVentas totales de los meses");
        System.out.println("Enero Q"+SumaEnero);
        System.out.println("Febrero Q"+sumaFebrero);
        System.out.println("Marzo Q"+SumaMarzo+"\n");
    }
  
    public void VentaMayorMes(){
         String Ene="", Feb="", Mar="";
         Double ene=0.0, feb=0.0, mar=0.0;
         for (Datos Car : Comisiones) {
             
             if (ene <Car.getEnero()) {
                 ene =Car.getEnero();
                 Ene =Car.getNombre();
             }
             if (feb <Car.getFebrero()) {
                 feb =Car.getFebrero();
                 Feb =Car.getNombre();
             }
             if (mar <Car.getMarzo()) {
                 mar =Car.getMarzo();
                 Mar =Car.getNombre();
             }
         }
         System.out.println("La persona con mayor venta enero "+Ene+" total Q"+ene);
         System.out.println("La persona con mayor venta febrero "+Feb+" total Q"+feb);
         System.out.println("La persona con mayor venta marzo "+Mar+" total Q"+mar);   
     }

    public void VentaMenorMes(){
         String Ene="", Feb="", Mar="";
         Double ene=1000000000000.0, feb=1000000000000.0, mar=1000000000000.0;
         for (Datos Car : Comisiones) {
             if (ene >Car.getEnero()) {
                 ene =Car.getEnero();
                 Ene =Car.getNombre();
             }
             if (feb >Car.getFebrero()) {
                 feb =Car.getFebrero();
                 Feb =Car.getNombre();
             }
             if (mar >Car.getMarzo()) {
                 mar =Car.getMarzo();
                 Mar =Car.getNombre();
             }
         }
         System.out.println("La persona con menor venta enero "+Ene+" total Q"+ene);
         System.out.println("La persona con menor venta febrero "+Feb+" total Q"+feb);
         System.out.println("La persona con menor venta marzo "+Mar+" total Q"+mar);
    }
  
    public void VentaMayor(){
        String Mayor = "";
        Double NumMayor=0.0;
        for(Datos Car: Comisiones){
            if (NumMayor<Car.getVentasTotales()) {
                NumMayor =Car.getVentasTotales();
                Mayor =Car.getNombre();
                
            }
        }
        System.out.println("La persona con mayor venta "+Mayor+" total Q"+NumMayor);
    }
   
    public void ModificarRegistro(){
        int ele=0, ele1=0, a=0, indice=0 ;
        String Name="";
        double cant=0.0;
        
        System.out.println("Deseas hacer alguna modificacion\n"
                + "1 Nombre\n"
                + "2 Cantidad");
        ele = Lector.nextInt();
        
        if (ele==1) {
            System.out.println("Cual nombre se modificara ");
            for (Datos Car : Comisiones) {
                System.out.println("Indice "+a+" = "+Car.getNombre());
                a++;
            }
            System.out.println("Cual es el indice del nombre a modificar ");
            indice=Lector.nextInt();
            System.out.println("Ingresa el nuevo nombre ");
            Name=Lector.nextLine();
            Name=Lector.nextLine();
            Comisiones.get(indice).setNombre(Name);
                       
        }
        
        if (ele==2) {
            System.out.println("Cual mes se modificara \n"
                    + "1 Enero\n"
                    + "2 Febrero\n"
                    + "3 Marzo");
            ele1=Lector.nextInt();
            if (ele1==1) {
                for(Datos Car: Comisiones){
                    System.out.println("Indice "+a+" = "+Car.getEnero()+" le pertenece a "+Car.getNombre());
                    a++;
                }
            System.out.println("Cual es el indice de la cantidad de Enero a modificar ");
            indice=Lector.nextInt();
            System.out.println("Ingresa la nueva cantidad");
            cant=Lector.nextDouble();
            Comisiones.get(indice).setEnero(cant);
                
            }
            if (ele1==2) {
               for(Datos Car: Comisiones){
                   System.out.println("Indice "+a+" = "+Car.getFebrero()+" le pertenece a "+Car.getNombre());
                    a++; 
                } 
           System.out.println("Cual es el indice de la cantidad de Febrero a modificar ");
            indice=Lector.nextInt();
            System.out.println("Ingresa la nueva cantidad");
            cant=Lector.nextDouble();
            Comisiones.get(indice).setFebrero(cant);
            }
            
            if (ele1==3) {
                for(Datos Car: Comisiones){
                   System.out.println("Indice "+a+" = "+Car.getMarzo()+" le pertenece a "+Car.getNombre());
                    a++; 
                }
            System.out.println("Cual es el indice de la cantidad de Marzo a modificar ");
            indice=Lector.nextInt();
            System.out.println("Ingresa la nueva cantidad");
            cant=Lector.nextDouble();
            Comisiones.get(indice).setMarzo(cant);
            }
            Calcular();           
        }     
    }
 
    public void Buscar(){
        String Nombre = "", Mes = "";
        Double Busqueda = 0.0;
        System.out.println("Ingresa la cantidad que vendio ");
        Busqueda = Lector.nextDouble();
        for (Datos Car : Comisiones) {
             
            if(Car.getEnero()==Busqueda){
                Mes = "Enero";
                Nombre = Car.getNombre();
            }
            
            if(Car.getFebrero()==Busqueda){
                Mes = "Febrero";
                Nombre = Car.getNombre();
            }
            
            if(Car.getMarzo()==Busqueda){
                Mes = "Marzo";
                Nombre = Car.getNombre();
            }
            
        }       
        System.out.println("Su nombre es "+Nombre);
        System.out.println("El mes de la venta es "+Mes);
    }
}
