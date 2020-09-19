package com.Santiago.Taller1.TourDeFrancia;

import java.util.ArrayList;

public class Equipo {
    private String nombreDelEquipo;
    private byte cantidadDeCorredores;
    public ArrayList<Corredor> corredor;

    public Equipo(String nombreDelEquipo, byte cantidadDeCorredores) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.cantidadDeCorredores = cantidadDeCorredores;
        this.corredor = new ArrayList<Corredor>();
    }

    public String getNombreDelEquipo() {
        return nombreDelEquipo;
    }

    public byte getCantidadDeCorredores() {
        return cantidadDeCorredores;
    }


}
