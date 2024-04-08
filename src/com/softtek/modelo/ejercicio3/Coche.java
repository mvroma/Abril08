package com.softtek.modelo.ejercicio3;

public class Coche implements IVehiculo {
    private int deposito;

    public Coche() {
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }


    @Override
    public String moverse() {
        if (deposito == 0) {
            return "El coche no arranca";
        } else {

            return "El coche arranca";
        }
    }
}
