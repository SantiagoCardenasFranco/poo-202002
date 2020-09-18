package com.Santiago.Taller1.app;

import com.Santiago.Taller1.TourDeFrancia.Corredor;
import com.Santiago.Taller1.TourDeFrancia.Equipo;
import com.Santiago.Taller1.TourDeFrancia.Tour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AppTourDeFrancia {
    public static void main(String[] args) {
        Corredor Corredor1 = new Corredor("Jaime", (byte) 18, 80, 180);
        Corredor Corredor2 = new Corredor("Joseph", (byte) 20, 75, 170);
        Corredor Corredor3 = new Corredor("Pedro", (byte) 18, 85, 185);
        Corredor Corredor4 = new Corredor("Aguilar", (byte) 21, 70, 168);
        Corredor Corredor5 = new Corredor("Juaquin", (byte) 19, 78, 175);
        Corredor Corredor6 = new Corredor("Pepe", (byte) 23, 87, 188);
        Corredor Corredor7 = new Corredor("Paco", (byte) 20, 68, 168);

        Equipo equipo1 = new Equipo("Boca", (byte) 5);
        equipo1.corredor.add(Corredor1);
        equipo1.corredor.add(Corredor2);
        equipo1.corredor.add(Corredor3);
        equipo1.corredor.add(Corredor4);
        equipo1.corredor.add(Corredor5);
        equipo1.corredor.add(Corredor6);
        equipo1.corredor.add(Corredor7);
        System.out.println(equipo1.getNombreDelEquipo());
        equipo1.corredor.forEach(x-> System.out.println("Los jugadores son: " + x.getNombreDeCorredor()));


        Corredor Corredor8 = new Corredor("Marco", (byte) 22, 85, 185);
        Corredor Corredor9 = new Corredor("Pablo", (byte) 20, 75, 172);
        Corredor Corredor10 = new Corredor("Alargon", (byte) 18, 78, 175);
        Corredor Corredor11 = new Corredor("Pirlo", (byte) 24, 88, 189);
        Corredor Corredor12 = new Corredor("Armando", (byte) 20, 70, 168);
        Corredor Corredor13 = new Corredor("German", (byte) 22, 86, 188);
        Corredor Corredor14 = new Corredor("Felipe", (byte) 20, 79, 178);

        Equipo equipo2 = new Equipo("Los corredores", (byte) 5);
        equipo2.corredor.add(Corredor8);
        equipo2.corredor.add(Corredor9);
        equipo2.corredor.add(Corredor10);
        equipo2.corredor.add(Corredor11);
        equipo2.corredor.add(Corredor12);
        equipo2.corredor.add(Corredor13);
        equipo2.corredor.add(Corredor14);
        System.out.println(equipo2.getNombreDelEquipo());
        equipo2.corredor.forEach(x-> System.out.println("Los jugadores son: " + x.getNombreDeCorredor()));


        Corredor Corredor15 = new Corredor("Alejandro", (byte) 18, 68, 170);
        Corredor Corredor16 = new Corredor("Raul", (byte) 23, 87, 188);
        Corredor Corredor17 = new Corredor("Federico", (byte) 20, 68, 168);
        Corredor Corredor18 = new Corredor("Connor", (byte) 22, 85, 185);
        Corredor Corredor19 = new Corredor("Ruben", (byte) 20, 75, 172);
        Corredor Corredor20 = new Corredor("Jorge", (byte) 18, 78, 175);
        Corredor Corredor21 = new Corredor("Samuel", (byte) 22, 90, 190);

        Equipo equipo3 = new Equipo("Los velocistas", (byte) 5);

        equipo3.corredor.add(Corredor15);
        equipo3.corredor.add(Corredor16);
        equipo3.corredor.add(Corredor17);
        equipo3.corredor.add(Corredor18);
        equipo3.corredor.add(Corredor19);
        equipo3.corredor.add(Corredor20);
        equipo3.corredor.add(Corredor21);
        System.out.println(equipo3.getNombreDelEquipo());
        equipo3.corredor.forEach(x-> System.out.println("Los jugadores son: " + x.getNombreDeCorredor()));


        Corredor Corredor22 = new Corredor("Fargan", (byte) 20, 70, 172);
        Corredor Corredor23 = new Corredor("Vicente", (byte) 19, 70, 170);
        Corredor Corredor24 = new Corredor("Fierro", (byte) 21, 79, 181);
        Corredor Corredor25 = new Corredor("Alicante", (byte) 18, 67, 170);
        Corredor Corredor26 = new Corredor("Alargon", (byte) 20, 70, 172);
        Corredor Corredor27 = new Corredor("Fernando segundo", (byte) 19, 70, 170);
        Corredor Corredor28 = new Corredor("Denis", (byte) 21, 79, 181);

        Equipo equipo4 = new Equipo("Le monarque", (byte) 5);
        equipo4.corredor.add(Corredor23);
        equipo4.corredor.add(Corredor24);
        equipo4.corredor.add(Corredor25);
        equipo4.corredor.add(Corredor26);
        equipo4.corredor.add(Corredor27);
        equipo4.corredor.add(Corredor28);
        System.out.println(equipo4.getNombreDelEquipo());
        equipo4.corredor.forEach(x-> System.out.println("Los jugadores son: " + x.getNombreDeCorredor()));


        Corredor Corredor29 = new Corredor("Filipino", (byte) 20, 70, 172);
        Corredor Corredor30 = new Corredor("Arrochuelo", (byte) 19, 70, 170);
        Corredor Corredor31 = new Corredor("Fenrir", (byte) 21, 79, 181);
        Corredor Corredor32 = new Corredor("Alfonso", (byte) 18, 67, 170);
        Corredor Corredor33 = new Corredor("Manxel", (byte) 20, 70, 172);
        Corredor Corredor34 = new Corredor("Ismael", (byte) 19, 70, 170);
        Corredor Corredor35 = new Corredor("Tom", (byte) 21, 79, 181);

        Equipo equipo5 = new Equipo("Jotun", (byte) 5);
        equipo5.corredor.add(Corredor29);
        equipo5.corredor.add(Corredor30);
        equipo5.corredor.add(Corredor31);
        equipo5.corredor.add(Corredor32);
        equipo5.corredor.add(Corredor33);
        equipo5.corredor.add(Corredor34);
        equipo5.corredor.add(Corredor35);
        System.out.println(equipo5.getNombreDelEquipo());
        equipo5.corredor.forEach(x-> System.out.println("Los jugadores son: " + x.getNombreDeCorredor()));


        Tour tourDeFrancia = new Tour("Le France", 250);
        /*tourDeFrancia.equipos.add(equipo1);
        tourDeFrancia.equipos.add(equipo2);
        tourDeFrancia.equipos.add(equipo3);
        tourDeFrancia.equipos.add(equipo4);
        tourDeFrancia.equipos.add(equipo5);*/
        tourDeFrancia.corredores.add(Corredor1);
        tourDeFrancia.corredores.add(Corredor2);
        tourDeFrancia.corredores.add(Corredor3);
        tourDeFrancia.corredores.add(Corredor4);
        tourDeFrancia.corredores.add(Corredor5);
        tourDeFrancia.corredores.add(Corredor6);
        tourDeFrancia.corredores.add(Corredor7);
        tourDeFrancia.corredores.add(Corredor8);
        tourDeFrancia.corredores.add(Corredor9);
        tourDeFrancia.corredores.add(Corredor10);
        tourDeFrancia.corredores.add(Corredor11);
        tourDeFrancia.corredores.add(Corredor12);
        tourDeFrancia.corredores.add(Corredor13);
        tourDeFrancia.corredores.add(Corredor14);
        tourDeFrancia.corredores.add(Corredor15);
        tourDeFrancia.corredores.add(Corredor16);
        tourDeFrancia.corredores.add(Corredor17);
        tourDeFrancia.corredores.add(Corredor18);
        tourDeFrancia.corredores.add(Corredor19);
        tourDeFrancia.corredores.add(Corredor20);
        tourDeFrancia.corredores.add(Corredor21);
        tourDeFrancia.corredores.add(Corredor22);
        tourDeFrancia.corredores.add(Corredor23);
        tourDeFrancia.corredores.add(Corredor24);
        tourDeFrancia.corredores.add(Corredor25);
        tourDeFrancia.corredores.add(Corredor26);
        tourDeFrancia.corredores.add(Corredor27);
        tourDeFrancia.corredores.add(Corredor28);
        tourDeFrancia.corredores.add(Corredor29);
        tourDeFrancia.corredores.add(Corredor30);
        tourDeFrancia.corredores.add(Corredor31);
        tourDeFrancia.corredores.add(Corredor32);
        tourDeFrancia.corredores.add(Corredor33);
        tourDeFrancia.corredores.add(Corredor34);
        tourDeFrancia.corredores.add(Corredor35);


        for (int i = 1; i <= 21; i++){
            System.out.println("El ganador en la etapa: " + i + " es: ");
            System.out.println(tourDeFrancia.corredores.get(i + 1).getNombreDeCorredor());
        }

        System.out.println("El top 10 de los competidores es: ");
        for (int i = 1; i <= 10; i++){
            System.out.println(tourDeFrancia.corredores.get(i + 2).getNombreDeCorredor());
        }

    }
}
