package com.gainor;

import com.gainor.libs.Fabrica;
import com.gainor.libs.ModeloBase;
import com.gainor.modelos.City;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        City ciudad = Fabrica.encontrarPorId(5, City.class);
        System.out.println(ciudad);
//        City miCiudad = City.encontrarPorId(5);
//        if(miCiudad != null) {
//            System.out.println(miCiudad.getName());
//        } else {
//            System.out.println("No se encontro la ciudad");
//        }
    }
}