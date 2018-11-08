package com.gainor;

import com.gainor.libs.ModeloBase;
import com.gainor.modelos.City;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName(City.class.toString());
        System.out.println(c.getName());
//        City miCiudad = City.encontrarPorId(5);
//        if(miCiudad != null) {
//            System.out.println(miCiudad.getName());
//        } else {
//            System.out.println("No se encontro la ciudad");
//        }
    }
}