/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import BaseDatos.ComisionesJDBC;
import Dominio.mdEmpleado;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CatalogoNegocio {
    
    Scanner Lec = new Scanner(System.in);
    mdEmpleado c = new mdEmpleado();
    ComisionesJDBC comision = new ComisionesJDBC();
    
    public void Ingresar(){
       System.out.println("Ingresa la cantidad de personas ");
        int cant = Lec.nextInt(); 
        for(int i=0; i<cant; i++){
          Double ENE = 0.0, FEB = 0.0, MAR = 0.0, PROM = 0.0;
          System.out.println("Ingresa su nombre");
          c.setNombre(Lec.nextLine());
          c.setNombre(Lec.nextLine());
          System.out.println("Ingresa total enero");
          ENE = Lec.nextDouble();
          c.setEnero(ENE);
          System.out.println("Ingresa total febrero");
          FEB = Lec.nextDouble();
          c.setFebrero(FEB);
          System.out.println("Ingresa total marzo");
          MAR = Lec.nextDouble();
          c.setMarzo(MAR);
          c.setVentasTotales(ENE + FEB + MAR);
          PROM =(ENE + FEB + MAR)/3;
          c.setPromedio(PROM);
          comision.IngresarEmpleado(c);
        }
        System.out.println("Se ha ingresado los datos");
    }

    public void Imprimir(){
        List<mdEmpleado> Imprimir = comision.SeleccionarInformacion();
        for (mdEmpleado C : Imprimir) {
            System.out.println("Empleado" +C);       
        }
    }

    public void VentaMay(){
        comision.VentaMayor("Enero");
        comision.VentaMayor("Febrero");
        comision.VentaMayor("Marzo");
    }   

    public void VentaMen(){
        comision.VentaMenor("Enero");
        comision.VentaMenor("Febrero");
        comision.VentaMenor("Marzo");
    }

    public void VentaMayorT(){
        comision.VentaMayor("Total");  
    }

    public void BorrarEmpleado(){
        List<mdEmpleado> Imprimir=comision.SeleccionarInformacion();
        for (mdEmpleado CO : Imprimir) {
            System.out.println("Codigo "+CO.getCodigo()+" Nombre "+CO.getNombre()+" Promedio "+CO.getPromedio());
        }
        System.out.println("Ingresa el codigo del empleado ");
        int Cod = Lec.nextInt();
        comision.Borrar(Cod);
        System.out.println("Dato eliminado");
    }

    public void EditarNom(){
        String Cod = "";
        List<mdEmpleado> Imprimir = comision.SeleccionarInformacion();
        for (mdEmpleado CO : Imprimir) {
            System.out.println("Codigo "+CO.getCodigo()+" Nombre "+CO.getNombre());
        }
            System.out.println("Ingresa el codigo del empleado");
            Cod = Lec.nextLine();
            Cod = Lec.nextLine();
            System.out.println("Ingresa el nuevo nombre ");
            String Nombre=Lec.nextLine();
            comision.EditarNombre("nombre","'"+Nombre+"'", Cod);
    }

    public void EditarCan(){
        String Cod = "", Col = "";
        Double Cant1 = 0.0, Cant2 = 0.0, Cant3 = 0.0;
        Double S = 0.0, P = 0.0;
        List<mdEmpleado> Imprimir = comision.SeleccionarInformacion();
        System.out.println("Ingresa el mes\n"
                + "1 ENERO\n"
                + "2 FEBRERO\n"
                + "3 MARZO");
        int op = Lec.nextInt();

        if (op==1) {
            for (mdEmpleado CO : Imprimir) {
                System.out.println("Codigo "+CO.getCodigo()+" Nombre "+CO.getNombre()+" Ventas Enero Q"+CO.getEnero());   
            }
            System.out.println("\nIngresa el codigo del empleado");
            Cod = Lec.nextLine();
            Cod = Lec.nextLine();
            System.out.println("Ingresa la nueva cantidad");
            Cant1 = Lec.nextDouble();
            Col = "enero";
            for (mdEmpleado md : Imprimir) {
                if (md.getCodigo()==(Integer.parseInt(Cod))) {
                    Cant2 = md.getFebrero();
                    Cant3 = md.getMarzo();                  
                }
            }    
        }

        else if (op==2) {
            for (mdEmpleado CO : Imprimir) {
                System.out.println("Codigo "+CO.getCodigo()+" Nombre "+CO.getNombre()+" Ventas Febrero Q"+CO.getFebrero());   
            }
            System.out.println("\nIngresa el codigo del empleado");
            Cod = Lec.nextLine();
            Cod = Lec.nextLine();
            System.out.println("Ingresa la nueva cantidad");
            Cant1 = Lec.nextDouble();
            Col = "febrero";
            for (mdEmpleado md : Imprimir) {
                if (md.getCodigo()==(Integer.parseInt(Cod))) {
                    Cant2 = md.getEnero();
                    Cant3 = md.getMarzo();                  
                }
            }    
        }

        else if (op==3) {
            for (mdEmpleado CO : Imprimir) {
                System.out.println("Codigo "+CO.getCodigo()+" Nombre "+CO.getNombre()+" Ventas Marzo Q"+CO.getMarzo());   
            }
            System.out.println("\nIngresa el codigo del empleado");
            Cod = Lec.nextLine();
            Cod = Lec.nextLine();
            System.out.println("Ingresa la nuea cantidad");
            Cant1 = Lec.nextDouble();
            Col = "marzo";
            for (mdEmpleado md : Imprimir) {
                if (md.getCodigo()==(Integer.parseInt(Cod))) {
                    Cant2 = md.getEnero();
                    Cant3 = md.getFebrero();                  
                }
            }    
        }
        S = Cant1 + Cant2 + Cant3;
        P = S/3;
        comision.EditarCantidad(Col, Cod, Cant1, S, P);
    }
    
    public void Busqueda(){
        System.out.println("Ingresa la cantidad que deseas buscar ");
        Double b = Lec.nextDouble();
        comision.Buscar(b);
    }
}
