package com.Santiago.Taller1.dispensadorDeMecato;

import java.util.ArrayList;
import java.util.List;

public class DispensadorDeMecato {
    private String serial;
    private String marca;
    public ArrayList<Producto> producto;

    public DispensadorDeMecato(String serial, String marca) {
        this.serial = serial;
        this.marca = marca;
        this.producto = new ArrayList<Producto>();
    }

    public String getSerial() {
        return serial;
    }

    public String getMarca() {
        return marca;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = new ArrayList<>();
    }
}
