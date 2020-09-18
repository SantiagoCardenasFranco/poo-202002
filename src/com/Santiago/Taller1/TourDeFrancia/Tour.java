package com.Santiago.Taller1.TourDeFrancia;

import java.util.ArrayList;

public class Tour {
    private String nombreDelTour;
    private double distanciaDelTour;
    private Etapa numeroDeEtapas;
    public ArrayList<Equipo> equipos;
    public ArrayList<Corredor> corredores;

    public Tour(String nombreDelTour, double distanciaDelTour) {
        this.nombreDelTour = nombreDelTour;
        this.distanciaDelTour = distanciaDelTour;
        this.numeroDeEtapas = numeroDeEtapas;
        this.equipos = new ArrayList<Equipo>();
        this.corredores = new ArrayList<Corredor>();
    }

    public Tour(Etapa numeroDeEtapas) {
        this.numeroDeEtapas = numeroDeEtapas;
    }

    public String getNombreDelTour() {
        return nombreDelTour;
    }

    public double getDistanciaDelTour() {
        return distanciaDelTour;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public Etapa getNumeroDeEtapas() {
        return numeroDeEtapas;
    }
}
