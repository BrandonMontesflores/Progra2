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
public class mdPokemon {
    
    private String Id;
    private String Nombre;
    private String Generacion;
    private String Especie;
    private String Color;
    private String Habitat;
    private String RateCapture;
    private String ExpBase;

    @Override
    public String toString() {
        return "MdPokemon{" + "Id" + Id + ", Nombre" + Nombre + ", Generacion" + Generacion + ", Especie" + Especie + ", Color" + Color + ", Habitat" + Habitat + ", RateCapture" + RateCapture + ", ExpBase" + ExpBase + '}';
    }
   
     public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGeneracion() {
        return Generacion;
    }

    public void setGeneracion(String Generacion) {
        this.Generacion = Generacion;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String Especie) {
        this.Especie = Especie;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public String getRateCapture() {
        return RateCapture;
    }

    public void setRateCapture(String RateCapture) {
        this.RateCapture = RateCapture;
    }

    public String getExpBase() {
        return ExpBase;
    }

    public void setExpBase(String ExpBase) {
        this.ExpBase = ExpBase;
    }  
}
