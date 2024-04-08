package com.softtek.presentacion;
import com.softtek.modelo.ejercicio6.Cliente;
import com.softtek.persistencia.ejercicio6.ClienteDAO;
import com.softtek.persistencia.ejercicio6.AccesoDesarrollo;

public class pruebaEjercicio6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan", "123456F");

        AccesoDesarrollo accesoDesarrollo = new AccesoDesarrollo();
        accesoDesarrollo.insertar(cliente);
        ClienteDAO clienteDAO = new ClienteDAO(accesoDesarrollo);
        System.out.println(clienteDAO.insertar(cliente));
        System.out.println(clienteDAO.toString());

    }
}
