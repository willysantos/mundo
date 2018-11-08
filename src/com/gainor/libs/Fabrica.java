package com.gainor.libs;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fabrica {
    public static <T extends ModeloBase> T encontrar(int id,Class modelo){
        Connection con = Database.getInstancia().getConexion();
        T resulatado = null;
        try {
            Statement sentencia = con.createStatement();
            String sql = "SELECT * FROM " + T.getNombreTabla()
                    + " WHERE "+T.getLlavePrimaria()+" = " + id;
            ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
