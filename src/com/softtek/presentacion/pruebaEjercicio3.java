package com.softtek.presentacion;
import com.softtek.modelo.ejercicio3.IVehiculo;
import com.softtek.modelo.ejercicio3.Coche;
import com.softtek.modelo.ejercicio3.Conductor;

public class pruebaEjercicio3 {
    public static void main(String[] args) {
        Coche c1 = new Coche(9);
        Conductor conductor = new Conductor(c1);
        System.out.println(conductor.conducir());
        System.out.println(c1.moverse());
    }
}
