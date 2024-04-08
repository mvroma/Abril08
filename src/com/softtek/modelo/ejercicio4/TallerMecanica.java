package com.softtek.modelo.ejercicio4;

public class TallerMecanica implements ITaller{

    @Override
    public String raparar(Coche coche) {
        String reparacion = "Reparación del coche con matrícula: '\'" + coche.getMatricula();
        return reparacion;
    }
}
