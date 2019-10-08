package ar.edu.unahur.ob2.patos.modelo;

public class PatoCabezaNegra extends Pato {

    public PatoCabezaNegra() {
        super(new VueloConAlas(), new Nado(), new Parpo());
    }

    @Override
    public void dibujar() {
        System.out.println("Soy un pato Cabeza Negra");
    }


}
