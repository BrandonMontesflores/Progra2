/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Venta.venta;
import java.text.DecimalFormat;

/**
 *
 * @author Usuario
 */
public class principal {
    
    private String [][] Tabla1;
    private final int Enc = 0;
    private final int Cantidad = 0;
    private final int Nombre = 1;
    private final int Precio = 2;
    private final int Peso = 3;
    private int Fila = 1;
    private final int MaxColumnas1 = 4;
       
    private String [][] Tabla2;
    private final int GastoalValor = 3;
    private final int GastoalPeso = 4;
    private final int CostoUnidad = 5;
    private final int CostoTotal = 6;
    private final int MaxColumnas2 = 7;

    double SumaPrecio = 0.0;
    double SumaPeso = 0.0;
    double CoeficienteGasto = 0.0;
    double CoeficientePeso = 0.0;
    double SumaTotal = 0.0;
    
    public  void CrearT1(int nfilas){
        Tabla1 = new String[nfilas+1][MaxColumnas1];
        Tabla1[Enc][Cantidad]="Cant";
        Tabla1[Enc][Nombre]="Nombre";
        Tabla1[Enc][Precio]="Precio";
        Tabla1[Enc][Peso]="Peso";
    } 

    public void AgregarT1(venta Productos){
        Tabla1[Fila][Cantidad]=Productos.getCantidad()+"";
        Tabla1[Fila][Nombre]=Productos.getNombre();
        Tabla1[Fila][Precio]=Productos.getPrecio()+"";
        Tabla1[Fila][Peso]=Productos.getPeso()+"";
        Fila++;           
    }
  
    public void ImprimirT1(){
       for (int i=0; i<Tabla1.length; i++) {
            System.out.print("|");
            for (int x=0; x<Tabla1[i].length; x++) {
                System.out.print(Tabla1[i][x]);
                if (x != Tabla1[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    
    }

    public Double CoeficienteGP(int nfilas, double gastos, double pesos){
        int fila = nfilas+1;
        for (int i=1; i<fila; i++) {
           SumaPrecio+=Double.valueOf(Tabla1[i][Cantidad])*Double.valueOf(Tabla1[i][Precio]);
           SumaPeso+=Double.valueOf(Tabla1[i][Cantidad])*Double.valueOf(Tabla1[i][Peso]);
        }
        CoeficienteGasto = gastos/SumaPrecio;
        CoeficientePeso = pesos/SumaPeso;
        return SumaPrecio;      
    }

    public  void CrearT2(int nfilas){
        Tabla2= new String[nfilas+1][MaxColumnas2];
        Tabla2[Enc][Cantidad]="Cant";
        Tabla2[Enc][Nombre]="Nombre";
        Tabla2[Enc][Precio]="Precio";
        Tabla2[Enc][GastoalValor]="GastoV";
        Tabla2[Enc][GastoalPeso]="GastoP";
        Tabla2[Enc][CostoUnidad]="CostoU";
        Tabla2[Enc][CostoTotal]="CostoT";     
    } 

    public Double AgregarT2(int nfilas){
       int fila = nfilas+1;
       DecimalFormat formato = new DecimalFormat("#.##");
        for (int i=1; i<fila; i++) {
           Tabla2[i][Cantidad]=Tabla1[i][Cantidad];
           Tabla2[i][Nombre]=Tabla1[i][Nombre];
           Tabla2[i][Precio]=Tabla1[i][Precio]; 
           Tabla2[i][GastoalValor]=(formato.format(Double.valueOf(Tabla1[i][Precio])*CoeficienteGasto))+"";
           Tabla2[i][GastoalPeso]=(formato.format(Double.valueOf(Tabla1[i][Peso])*CoeficientePeso))+"";
           Tabla2[i][CostoUnidad]=(formato.format(Double.valueOf(Tabla1[i][Precio])+Double.valueOf(Tabla2[i][GastoalValor])+Double.valueOf(Tabla2[i][GastoalPeso])))+"";
           Tabla2[i][CostoTotal]=(formato.format(Double.valueOf(Tabla2[i][Cantidad])*Double.valueOf(Tabla2[i][CostoUnidad])))+"";
           SumaTotal+=Double.valueOf(Tabla2[i][CostoTotal]);
        } 
        return SumaTotal;      
    }

    public void ImprimirT2(){
       for (int i=0; i<Tabla2.length; i++) {
            System.out.print("|");
            for (int x=0; x<Tabla2[i].length; x++) {
                System.out.print(Tabla2[i][x]);
                if (x != Tabla2[i].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }  
    }
}