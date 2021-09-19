/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasedeDatos;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    private static final String JDBC_URL="jdbc:mysql://localhost:3306/dbcomisiones?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASW="brandon";
    
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASW);

    }
    public static void CloseResul(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void CloseStatement(PreparedStatement statement){
        try {
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void CloseConnection(Connection cn){
        try {
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
