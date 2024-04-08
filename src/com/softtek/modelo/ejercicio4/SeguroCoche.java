package com.softtek.modelo.ejercicio4;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche() {
    }

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(){
        return taller.raparar(new Coche("1234ABC", "Seat"));
    }
}
