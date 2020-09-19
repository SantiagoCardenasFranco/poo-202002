package com.alejandro.Dispensador;

public class DispensadorDeAgua {
    public long serial;
    public String Marca;
    public double cantidadMaxima;
    public double cantidadActual;
    public double temperatura;

    public void llenar(){
        this.cantidadActual = this.cantidadMaxima;
    }

    public void vaciar(){
        this.cantidadActual = 0;
    }
    
}

