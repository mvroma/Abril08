package com.softtek.modelo.ejercicio5;

public class Director implements Empleado{
    private IInforme informe;

    public Director() {
    }

    public Director(IInforme informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {

        return "Obteniendo tareas del director";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
