package com.alejandro.poo;

public class App {
    public static void main(String[] args) {
        Calculadora instancia1 = new Calculadora("Sony", "Estandar");
        Calculadora instancia2 = new Calculadora("Samsung", "Cientifica");
        Calculadora intancia3 = new Calculadora("LG", "Estandar");
        Calculadora instancia4 = new Calculadora("Kalley", "Estandar");
        Calculadora instancia5 = new Calculadora("Challenger", "Cientifica");

        System.out.println("Las instancias que se realizron fuero: " + Calculadora.operaciones);
    }
}
