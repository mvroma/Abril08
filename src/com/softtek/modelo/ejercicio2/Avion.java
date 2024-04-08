package com.softtek.modelo.ejercicio2;

public class Avion extends Vehiculo implements ObjetoVolador{

    @Override
    public String despegar() {
        return "Despega";
    }

    @Override
    public String aterrizar() {
        return "Aterriza";
    }

    @Override
    public String volar() {
        return "Vuela";
    }
}
