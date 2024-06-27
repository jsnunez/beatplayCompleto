package com.jsnunez.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.google.gson.Gson;

public class LecturaJson {

public static void start() {
    Gson gson = new Gson();
    String fichero = "";{};
    try(
    BufferedReader br = new BufferedReader(new FileReader("beatplay\\src\\main\\java\\datos.json")))
    {
        String linea;
        while ((linea = br.readLine()) != null) {
            fichero += linea;
        }

    }catch(
    FileNotFoundException ex)
    {
        System.out.println(ex.getMessage());
    }catch(
    IOException ex)
    {
        System.out.println(ex.getMessage());
    }
    Properties properties = gson.fromJson(fichero,
            Properties.class);System.out.println(properties.get("nombre"));System.out.println(properties.get("apellidos"));System.out.println(properties.get("edad"));


}

    }
