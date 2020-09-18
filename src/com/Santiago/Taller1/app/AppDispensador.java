package com.Santiago.Taller1.app;

import com.Santiago.Taller1.dispensadorDeMecato.DispensadorDeMecato;
import com.Santiago.Taller1.dispensadorDeMecato.Producto;
import com.alejandro.tvdomain.Televisor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDispensador {
    public static void main(String[] args) {
        Producto productoUno = new Producto("Cheetos",1500,"A", (byte) 8);
        Producto productoDos = new Producto("De Todito", 2000,"B", (byte) 8);
        Producto productoTres = new Producto("Chpis", 1000,"C", (byte) 2);
        Producto productoCuatro = new Producto("Chocorramo", 2500,"D", (byte) 3);
        Producto productoCinco = new Producto("Gala", 1700,"E", (byte) 5);
        Producto productoSeis = new Producto("Jumbo", 2500,"F", (byte) 3);
        Producto productoSiete = new Producto("Almendras", 3000,"G", (byte) 4);
        Producto productoOcho = new Producto("Maní", 500,"H", (byte) 6);
        Producto productoNueve = new Producto("Choclitos", 750,"I", (byte) 2);
        Producto productoDiez = new Producto("Doritos", 1650,"J", (byte) 5);



        DispensadorDeMecato dispensadorDeMecatoUno = new DispensadorDeMecato("1185105", "Sony");
        List<Producto> productos = Arrays.asList(productoUno, productoDos, productoTres, productoCuatro, productoCinco, productoSeis, productoSiete, productoOcho, productoNueve, productoDiez);
        /*dispensadorDeMecatoUno.producto.add(productoUno);
        dispensadorDeMecatoUno.producto.add(productoDos);
        dispensadorDeMecatoUno.producto.add(productoTres);
        dispensadorDeMecatoUno.producto.add(productoCuatro);
        dispensadorDeMecatoUno.producto.add(productoCinco);
        dispensadorDeMecatoUno.producto.add(productoSeis);
        dispensadorDeMecatoUno.producto.add(productoSiete);
        dispensadorDeMecatoUno.producto.add(productoOcho);
        dispensadorDeMecatoUno.producto.add(productoNueve);
        dispensadorDeMecatoUno.producto.add(productoDiez);*/

        productos.forEach(x -> System.out.println("Hay " + x.getCantidad() + " unidades del prducto " + x.getNombre()));

        System.out.println("Se agregan unidadades: " + productoCinco.aumentarCantidad((byte) 4) + " " + " quedan " + productoCinco.getCantidad());

        System.out.println("El producto: " + productoDiez.getNombre() + " tiene: " + productoCinco.getCantidad() + "unidades");

        System.out.println("Producto retirado: " + productoSiete.sacarMecato((byte) 5) + ", quedan " + productoSiete.getCantidad());

        System.out.println("Productos agotados; " + productoUno.verficarCantidad(productoUno) + productoUno.getNombre());
    }
}
