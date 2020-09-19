package com.Santiago.Taller1.TourDeFrancia;

public class Corredor {
    private String nombreDeCorredor;
    private byte edad;
    private double peso;
    private double altura;

    public Corredor(String nombreDeCorredor, byte edad, double peso, double altura) {
        this.nombreDeCorredor = nombreDeCorredor;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombreDeCorredor() {
        return nombreDeCorredor;
    }

    public byte getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

}
