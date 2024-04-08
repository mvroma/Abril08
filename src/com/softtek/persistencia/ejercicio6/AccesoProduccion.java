package com.softtek.persistencia.ejercicio6;
import com.softtek.modelo.ejercicio6.Cliente;

public abstract class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente cliente) {
        return "Producción" + cliente.toString();
    }
}
