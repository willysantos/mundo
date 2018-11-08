package com.gainor.libs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private static final String USUARIO_DB = "root";
    private static final String CLAVE_DB = "123456";

    private static Database instancia;
    private Connection conexion;

    private Database() {
    }

    public static Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
            try {
                instancia.conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world",
                        USUARIO_DB, CLAVE_DB);
            } catch (SQLException e) {
                System.err.println("La conexión fallo " + e.getMessage());
            }
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

}
