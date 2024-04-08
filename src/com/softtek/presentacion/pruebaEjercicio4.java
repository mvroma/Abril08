package com.softtek.presentacion;
import com.softtek.modelo.ejercicio4.TallerPintura;
import com.softtek.modelo.ejercicio4.TallerMecanica;
import com.softtek.modelo.ejercicio4.Coche;
import com.softtek.modelo.ejercicio4.SeguroCoche;
import com.softtek.modelo.ejercicio4.ITaller;

public class pruebaEjercicio4 {
    public static void main(String[] args) {

                ITaller tallerMecanica = new TallerMecanica();
                SeguroCoche seguroCocheMecanica = new SeguroCoche(tallerMecanica, "Mapfre");


                String reparacionMecanica = seguroCocheMecanica.reparar();
                System.out.println("Aviso desde el TallerMecanica:");
                System.out.println(reparacionMecanica);


                ITaller tallerPintura = new TallerPintura();
                SeguroCoche seguroCochePintura = new SeguroCoche(tallerPintura, "Mapfre");


                String reparacionPintura = seguroCochePintura.reparar();
                System.out.println("\nAviso desde el TallerPintura:");
                System.out.println(reparacionPintura);
            }
        }
