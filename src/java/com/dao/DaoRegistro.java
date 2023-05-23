package com.dao;

import com.conexion.Conexion;
import com.modelo.registro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josue
 */
public class DaoRegistro extends Conexion {

    public List<registro> getRegistro() throws Exception {
        ResultSet rs;
        List<registro> lst = new ArrayList();
        try {
            this.conectar();
            String sql = "SELECT * FROM registro";
            PreparedStatement pst = (PreparedStatement) this.getCon().prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                registro regis = new registro();
                regis.setId(rs.getInt("id"));
                regis.setRutaJson(rs.getString("rutaJson"));
                regis.setCreationDate(rs.getString("creationDate"));
                regis.setCreationTime(rs.getString("creationTime"));
                regis.setEstado(rs.getInt("estado"));
                lst.add(regis);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
        return lst;
    }

    public void insertRegistro(registro regis) throws Exception {
        try {
            this.conectar();
            String sql = "INSERT  INTO  registro values(?,?,?,?);";
            PreparedStatement pst = this.getCon().prepareStatement(sql);
            pst.setString(1, regis.getRutaJson());
            pst.setString(2, regis.getCreationDate());
            pst.setString(3, regis.getCreationTime());
            pst.setInt(4, regis.getEstado());
            pst.executeUpdate();

        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectar();
        }
    }

}
