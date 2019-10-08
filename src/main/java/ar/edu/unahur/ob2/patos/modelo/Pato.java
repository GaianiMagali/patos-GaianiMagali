package ar.edu.unahur.ob2.patos.modelo;

public abstract class Pato {

    private Volable comportamientoDeVuelo;
    private Nadable comportamientoDeNadar;
    private Parpable comportamientoDeParpar;

    public Pato(Volable comportamientoDeVuelo, Nadable comportamientoDeNadar, Parpable comportamientoDeParpar) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
        this.comportamientoDeNadar = comportamientoDeNadar;
        this.comportamientoDeParpar = comportamientoDeParpar;
    }

    public void volar() {
        comportamientoDeVuelo.volar();
    }

    public void nadar(){comportamientoDeNadar.nadar();}

    public void parpar(){comportamientoDeParpar.parpar();}


    public void setComportamientoDeVuelo(Volable comportamientoDeVuelo) {
        this.comportamientoDeVuelo = comportamientoDeVuelo;
    }

    public void setComportamientoDeParpar(Parpable comportamientoDeParpar) {
        this.comportamientoDeParpar = comportamientoDeParpar;
    }

    public abstract void dibujar();
}
