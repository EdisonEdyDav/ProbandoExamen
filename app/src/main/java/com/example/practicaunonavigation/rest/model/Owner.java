package com.example.practicaunonavigation.rest.model;

import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("cedula")
    private String Cedula;

    @SerializedName("nombre")
    private String Nombre;


    @SerializedName("ciudad")
    private String Ciudad;

    @SerializedName("estado")
    private String Estado;

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public Owner(String cedula, String nombre, String ciudad, String estado) {
        Cedula = cedula;
        Nombre = nombre;
        Ciudad = ciudad;
        Estado = estado;
    }





}

