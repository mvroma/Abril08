package com.softtek.modelo.ejercicio5;

public class Jefe implements Empleado{
    private IInforme informe;

    public Jefe(){

    }
    public Jefe(IInforme informe){
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Obteniendo tareas del jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
