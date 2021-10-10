/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Dominio.mdPokemon;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ConexionPokemon {
    
    public List<mdPokemon> SeleccionarTodo(){
        List<mdPokemon> SelecPok = new ArrayList<mdPokemon>();
        mdPokemon P=new mdPokemon();
        Connection conexion=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try{
            conexion=Conexion.getConnection();
            statement=conexion.prepareStatement("SELECT * FROM dbpokemon.pokemon;");
            resultSet=statement.executeQuery();
            while(resultSet.next()){
            String Id=resultSet.getString("id");
            String Nombre=resultSet.getString("name");
            String Generacion=resultSet.getString("generation_id");
            String Especie=resultSet.getString("species");
            String Color=resultSet.getString("color");
            String Habitat=resultSet.getString("habitat");
            String RateCapture=resultSet.getString("capture_rate");
            String ExpBase=resultSet.getString("base_experience");
            P=new mdPokemon();
            P.setId(Id);
            P.setNombre(Nombre);
            P.setGeneracion(Generacion);
            P.setEspecie(Especie);
            P.setColor(Color);
            P.setHabitat(Habitat);
            P.setRateCapture(RateCapture);
            P.setExpBase(ExpBase);
            SelecPok.add(P);
             }    
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.CloseConnection(conexion);
            Conexion.CloseResul(resultSet);
            Conexion.CloseStatement(statement);
        }     
        return SelecPok;  
    }
    
    
    public List<mdPokemon> BusquedaPoke(String columna, String valor){
       List<mdPokemon> BusPoke = new ArrayList<mdPokemon>();
        mdPokemon P=new mdPokemon();
        Connection conexion=null;
        PreparedStatement statement=null;
        ResultSet resultSet=null;
        try{
            conexion=Conexion.getConnection();
            statement=conexion.prepareStatement("select * from pokemon where "+columna+" ='"+valor+"';");
            resultSet=statement.executeQuery();          
            while(resultSet.next()){
            String Id=resultSet.getString("id");
            String Nombre=resultSet.getString("name");
            String Generacion=resultSet.getString("generation_id");
            String Especie=resultSet.getString("species");
            String Color=resultSet.getString("color");
            String Habitat=resultSet.getString("habitat");
            String RateCapture=resultSet.getString("capture_rate");
            String ExpBase=resultSet.getString("base_experience");
            P = new mdPokemon();
            P.setId(Id);
            P.setNombre(Nombre);
            P.setGeneracion(Generacion);
            P.setEspecie(Especie);
            P.setColor(Color);
            P.setHabitat(Habitat);
            P.setRateCapture(RateCapture);
            P.setExpBase(ExpBase);
            BusPoke.add(P);
             }            
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.CloseConnection(conexion);
            Conexion.CloseResul(resultSet);
            Conexion.CloseStatement(statement);
        }     
        return BusPoke;
   }
}
