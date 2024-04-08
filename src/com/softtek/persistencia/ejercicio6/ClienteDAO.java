package com.softtek.persistencia.ejercicio6;
import com.softtek.modelo.ejercicio6.Cliente;

public class ClienteDAO {
    private IDAO conexion;

    public void ClienteDAO (){

    }

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente){
        return conexion.insertar(cliente);
    }

    @Override
    public String toString(){
        return "ClienteDAO{" +
                "conexion=" + conexion +
                '}';
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
