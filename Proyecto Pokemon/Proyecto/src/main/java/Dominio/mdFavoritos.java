/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author Usuario
 */
public class mdFavoritos {
    
    private String Numero;
    private String Correlativo;
    private String Nombre;
    private String Entrenador;
    private String Correo;
    
    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCorrelativo() {
        return Correlativo;
    }

    public void setCorrelativo(String Correlativo) {
        this.Correlativo = Correlativo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEntrenador() {
        return Entrenador;
    }

    public void setEntrenador(String Entrenador) {
        this.Entrenador = Entrenador.toUpperCase();
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
}
