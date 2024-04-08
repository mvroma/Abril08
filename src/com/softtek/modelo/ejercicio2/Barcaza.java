package com.softtek.modelo.ejercicio2;

public class Barcaza extends Vehiculo implements Nautico{
    public  String navegar(){
     return "Navega";
    }

    public  String atracar(){
        return "Atraca";
    }

    public Barcaza() {
    }
}
