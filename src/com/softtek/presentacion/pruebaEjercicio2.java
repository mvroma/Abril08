package com.softtek.presentacion;
import com.softtek.modelo.ejercicio2.Nautico;
import  com.softtek.modelo.ejercicio2.Avion;
import com.softtek.modelo.ejercicio2.ObjetoVolador;
import com.softtek.modelo.ejercicio2.Vehiculo;
import com.softtek.modelo.ejercicio2.Helicoptero;
import com.softtek.modelo.ejercicio2.HidroAvion;
import com.softtek.modelo.ejercicio2.Barcaza;

import java.sql.SQLOutput;

public class pruebaEjercicio2 {
    public static void main(String[] args) {
        Avion avion = new Avion();
        System.out.println("El avión \n" + avion.despegar() + "\n" + avion.volar() + "\n" + avion.aterrizar());

        Barcaza barcaza = new Barcaza();
        System.out.println("La barcaza \n" + barcaza.atracar() + "\n" + barcaza.navegar());

        Helicoptero helicoptero = new Helicoptero();
        System.out.println("El helicoptero \n" + helicoptero.aterrizar() + "\n" + helicoptero.despegar() );

        HidroAvion hidroAvion = new HidroAvion();
        System.out.println("El hidroavión \n" + hidroAvion.atracar() + "\n" + hidroAvion.navegar());

    }
}
