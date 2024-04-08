package com.softtek.modelo.ejercicio5;

public class Secretario implements Empleado{
    private IInforme informe;
    private String empresa;
    private  String email;

    public Secretario(String informe, String softtek, String email) {
    }

    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getTareas() {
        return "Obteniendo tareas del secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }
}
