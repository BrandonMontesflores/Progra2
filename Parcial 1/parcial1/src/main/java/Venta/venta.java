/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Venta;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class venta {
    
    private int Cantidad;
    private String Nombre;
    private Double Precio;
    private Double Peso;
    
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }
    
    public void CargarInfo(int Num){
       Scanner Lector = new  Scanner(System.in);
       System.out.println("PRODUCTOS "+(Num+1)+": ");
       System.out.println("Ingresa la cantidad "+(Num+1)+": ");
       setCantidad(Lector.nextInt());
       System.out.println("Ingresa el nombre "+(Num+1)+": ");
       setNombre(Lector.nextLine());
       setNombre(Lector.nextLine());
       System.out.println("Ingresa el precio unitario "+(Num+1)+": ");
       setPrecio((Double) Lector.nextDouble());
       System.out.println("Ingresa el peso "+(Num+1)+": ");
       setPeso((Double) Lector.nextDouble());
    }
}
