/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;


import DominioMD.mdUsuario;
import java.sql.*;
import java.util.*;


/**
 *
 * @author Usuario
 */
public class ConexionUsuarioJDBC {
    
    private static final String SQL_SELECT ="SELECT * from tb_usuarios";
    private static final String SQL_INSERT ="INSERT into tb_usuarios(usuario,contraseña) values(?,?)";
    private static final String SQL_DELETE ="DELETE from tb_usuarios where id=";
    private static final String SQL_UPDATE ="UPDATE tb_usuarios set usuario=?,contraseña=? where id=?";
    

    public List<mdUsuario> Seleccionar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        mdUsuario emp = null;
        List<mdUsuario> com = new ArrayList<mdUsuario>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String usuario = rs.getString("usuario");
                String contraseña = rs.getString("contraseña");
                emp = new mdUsuario();
                emp.setid(id);
                emp.setusuario(usuario);
                emp.setcontraseña(contraseña);
                com.add(emp);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.CloseConnection(conn);
            Conexion.CloseStatement(stmt);
            Conexion.CloseResul(rs);
        }
        return com;
    }

    public int Ingresar(mdUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getusuario());
            stmt.setString(2, usuario.getcontraseña());          
            rows = stmt.executeUpdate();                      
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.CloseConnection(conn);
            Conexion.CloseStatement(stmt);
        }
        return rows;
    }

    public int Editar(mdUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();           
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getusuario());
            stmt.setString(2, usuario.getcontraseña());
            stmt.setInt(3, usuario.getid());
            rows = stmt.executeUpdate();            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.CloseConnection(conn);
            Conexion.CloseStatement(stmt);
        }
        return rows;
    }

    public int Borrar(mdUsuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();           
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getid());
            rows = stmt.executeUpdate();          
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.CloseConnection(conn);
            Conexion.CloseStatement(stmt);  
        }
        return rows;
    }
    
    public boolean Validar (mdUsuario V){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean Val = false;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM dbcomisiones.tb_usuarios where usuario = '"+V.getusuario()+"' and contraseña = '"+V.getcontraseña()+"';");
            rs = stmt.executeQuery();
            while (rs.next()) {
            Val = true;
            }      
        }   
        catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.CloseConnection(conn);
            Conexion.CloseResul(rs);
            Conexion.CloseStatement(stmt);
        }
        return Val;
    }         
}
