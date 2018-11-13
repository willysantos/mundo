package com.gainor.modelos;

import com.gainor.libs.Database;
import com.gainor.libs.ModeloBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class City extends ModeloBase {

    private int id;
    private String name;
    private String countryCode;
    private String district;
    private int population;

    public String getNombreTabla() {
        return "city";
    }
    public static String getLlavePrimaria(){ return "ID";}

    public String getLlavePrimaria() {
        return "ID";
    }

    public static City encontrarPorId(int id) {
        Connection con = Database.getInstancia().getConexion();
        City ciudad = null;
        try {
            Statement sentencia = con.createStatement();
            String sql = "";
//            String sql = "SELECT * FROM " + getNombreTabla()
//                    + " WHERE ID = " + id;
            ResultSet resultado = sentencia.executeQuery(sql);
            if (resultado.next()) {
                ciudad = new City();
                ciudad.setId(resultado.getInt("ID"));
                ciudad.setName(resultado.getString("Name"));
                ciudad.setCountryCode(resultado.getString("CountryCode"));
                ciudad.setDistrict(resultado.getString("District"));
                ciudad.setPopulation(resultado.getInt("Population"));
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return ciudad;
    }

    public static ArrayList<City> getTodosLosRegistros(int limite) {
        Connection con = Database.getInstancia().getConexion();
        ArrayList<City> lista = new ArrayList<City>();
        try {
            Statement sentencia = con.createStatement();
            String sql = "";
//            String sql = "SELECT * FROM " + getNombreTabla();
            if(limite > 0) {
                sql += " LIMIT " + limite;
            }
            ResultSet resultados = sentencia.executeQuery(sql);

            while (resultados.next()) {
                City ciudad = new City();
                ciudad.setId(resultados.getInt("ID"));
                ciudad.setName(resultados.getString("Name"));
                ciudad.setCountryCode(resultados.getString("CountryCode"));
                ciudad.setDistrict(resultados.getString("District"));
                ciudad.setPopulation(resultados.getInt("Population"));
                lista.add(ciudad);
            }
            resultados.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
