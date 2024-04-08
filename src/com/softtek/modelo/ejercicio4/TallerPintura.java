package com.softtek.modelo.ejercicio4;

public class TallerPintura implements ITaller{
    @Override
    public String raparar(Coche coche) {
        String reparacion = "Pintura del coche con matricula: '" + coche.getMatricula();
        return reparacion;
    }
}
