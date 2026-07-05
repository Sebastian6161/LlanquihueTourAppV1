package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        for (ServicioTuristico servicio :
                gestor.obtenerServicios()) {

            servicio.mostrarInformacion();

            System.out.println("--------------------------------");
        }
    }
}