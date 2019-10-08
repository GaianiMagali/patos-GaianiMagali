package ar.edu.unahur.ob2.patos.modelo;

import ar.edu.unahur.ob2.patos.modelo.Volable;

public class VueloConAlas implements Volable {

    @Override
    public void volar() {
        System.out.println("Vuelo con mis alas");
    }
}
