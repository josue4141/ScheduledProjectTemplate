
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author josue
 */
public class Conexion {
    private Connection con;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
     public String conectar() throws SQLException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-N35U6MO\\MSSQLSERVER:1433;databaseName=retoDigital2;user=sa;password=admin123;encrypt=true;trustServerCertificate=true");
            return "Conexión exitosa";
            
        } catch (ClassNotFoundException | SQLException e) {
             e.getMessage();
            return "Error al conectar "+e.getMessage();
        }
    }
    
      public String desconectar() throws SQLException {
        try {
            if (con != null) {
                if (con.isClosed() == false) {
                    con.close(); 
                }
            }
            return "Desconecto Exitosamente";
        } catch (SQLException e) {
            e.getMessage();
            return "Error al desconectar"+e.getMessage();
        }
    }
}
