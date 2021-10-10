/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import Dominio.mdFavoritos;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class ConexionFavoritos {
    
    String SQL_INSERT = "insert into tb_favoritos(id_pokemon,nombre,entrenador,correo) values(?,?,?,?)";
    
      public List<mdFavoritos> SeleccionarTodo(){
        List<mdFavoritos> Selec = new ArrayList<mdFavoritos>();
        mdFavoritos S = new mdFavoritos();
        Connection conn =null;
        PreparedStatement stmt =null;
        ResultSet rs =null;
        try{
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM dbpokemon.tb_favoritos;");
            rs = stmt.executeQuery();
            while(rs.next()){
            String Id=rs.getString("id");
            String Id_Pokemon=rs.getString("id_pokemon");
            String Nombre=rs.getString("nombre");
            String Entrenador=rs.getString("entrenador");
            String Correo=rs.getString("correo");
            
            S = new mdFavoritos();
            S.setNumero(Id);
            S.setCorrelativo(Id_Pokemon);
            S.setNombre(Nombre);
            S.setEntrenador(Entrenador);
            S.setCorreo(Correo);           
            Selec.add(S);
            }    
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.CloseConnection(conn);
            Conexion.CloseResul(rs);
            Conexion.CloseStatement(stmt);
        }     
        return Selec;  
    }
    
    public List<mdFavoritos> BusquedaEntrenador(String entre){
        List<mdFavoritos> Entrenador=new ArrayList<mdFavoritos>();
        mdFavoritos E=new mdFavoritos();
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs=null;
        try{
            conn=Conexion.getConnection();
            stmt=conn.prepareStatement("SELECT * FROM dbpokemon.tb_favoritos where entrenador='"+entre+"';");
            rs=stmt.executeQuery();           
            while(rs.next()){
            String Id=rs.getString("id");
            String Correlativo=rs.getString("id_pokemon");
            String Nombre=rs.getString("nombre");
            String Entre=rs.getString("entrenador");
            String Correo=rs.getString("correo");
            E=new mdFavoritos();
            E.setNumero(Id);
            E.setCorrelativo(Correlativo);
            E.setNombre(Nombre);
            E.setEntrenador(Entre);
            E.setCorreo(Correo);
            Entrenador.add(E);
            }          
        }  catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.CloseConnection(conn);
            Conexion.CloseResul(rs);
            Conexion.CloseStatement(stmt);
        }
        return Entrenador;
    } 
}
