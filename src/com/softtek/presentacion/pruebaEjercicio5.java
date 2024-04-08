package com.softtek.presentacion;
import com.softtek.modelo.ejercicio5.IInforme;
import  com.softtek.modelo.ejercicio5.Empleado;
import  com.softtek.modelo.ejercicio5.Director;
import com.softtek.modelo.ejercicio5.Jefe;
import com.softtek.modelo.ejercicio5.Secretario;
import com.softtek.modelo.ejercicio5.InformeTrimestre1;
import com.softtek.modelo.ejercicio5.InformeTrimestre2;

public class pruebaEjercicio5 {
    public static void main(String[] args) {
        InformeTrimestre1 inf1 = new InformeTrimestre1();
        InformeTrimestre2 inf2 = new InformeTrimestre2();

        Director director = new Director(inf1);
        System.out.println(director.getTareas());
        System.out.println(director.getInforme());

        Jefe jefe = new Jefe(inf2);
        System.out.println(jefe.getTareas());
        System.out.println(jefe.getInforme());

        Secretario secretario = new Secretario("informe", "Softtek", "softtek.com");
        System.out.println(secretario.getTareas());
        System.out.println(secretario.getInforme());


    }
}
