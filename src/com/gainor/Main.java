package com.gainor;

import com.gainor.libs.ModeloBase;
import com.gainor.modelos.City;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName(City.class.toString());
        System.out.println(c.getName());

    }
}