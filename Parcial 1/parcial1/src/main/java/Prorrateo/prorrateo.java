/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prorrateo;

import Principal.principal;
import Venta.venta;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class prorrateo {
    
    public static void main(String[] args) {
    Double SeguroL = 0.0;
    Double Flete = 0.0;
    Double ImpuestoA = 0.0;
    Double Acarreo = 0.0;
    Double ComisionB = 0.0;
    Double Final = 0.0;
    
        principal P = new  principal();
        venta V = new venta();
        Scanner Lector= new  Scanner(System.in);
        System.out.println("Ingresa la cantidad de productos ");
        int Can = Lector.nextInt();
        P.CrearT1(Can);
        for (int i=0; i<Can; i++) {
            V.CargarInfo(i);
            P.AgregarT1(V);
        }        
        P.ImprimirT1(); 
        System.out.println("\n¿Cuanto es de seguro local? ");
        SeguroL = Lector.nextDouble();
        System.out.println("¿Cuanto es de flete? ");
        Flete = Lector.nextDouble();
        System.out.println("¿Cuanto es de aduana? ");
        ImpuestoA = Lector.nextDouble();
        System.out.println("¿Cuanto es de acarreo? ");
        Acarreo=Lector.nextDouble();
        System.out.println("¿Cuanto es de comision bancaria? ");
        ComisionB = Lector.nextDouble();
        Double S1 = SeguroL+ImpuestoA+ComisionB;
        Double S2 = Flete+Acarreo;
        Double S3 = P.CoeficienteGP(Can,S1,S2);
        P.CrearT2(Can);
        Final = P.AgregarT2(Can);
       
        P.ImprimirT2();
        System.out.println("\nTotal "+ Final+"\n");
        System.out.println("Total factura   "+S3+"\n"
                + "Total gastos al valor "+S1+"\n"
                + "Total gastos al peso  "+S2+"\n"                        
                + "TOTAL FINAL "+(S1+S2+S3));     
    } 
}
