package com.alejandro.poo;

public class Calculadora {
    public static int operaciones = 0;
    private String marca;
    private int serial;
    private String tipo;

    public Calculadora(String marca, String tipo) {
        this.marca = marca;
        this.serial = operaciones + 1;
        this.tipo = tipo;

        Calculadora.operaciones++;
    }

    public String getMarca() {
        return marca;
    }

    public int getSerial() {
        return serial;
    }

    public String getTipo() {
        return tipo;
    }


}
