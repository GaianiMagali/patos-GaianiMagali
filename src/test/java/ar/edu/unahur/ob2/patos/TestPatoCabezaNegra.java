package ar.edu.unahur.ob2.patos;

import ar.edu.unahur.ob2.patos.modelo.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertTrue;

public class TestPatoCabezaNegra {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();

    PatoCabezaNegra patoCabezaNegra;
    PatoCapuchino patoCapuchino;
    PatoHule patoHule;
    PatoMadera patoMadera;

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));

        patoCabezaNegra = new PatoCabezaNegra();
        patoCapuchino = new PatoCapuchino();
        patoHule = new PatoHule();
        patoMadera = new PatoMadera();
    }

    @Test
    public void testPatoCabezaNegraVolar() {
        patoCabezaNegra.volar();

        String consola = this.consoleContent.toString();

        assertTrue(consola.indexOf("Vuelo con mis alas")!=-1);

        patoCabezaNegra.setComportamientoDeVuelo(new NoVuelo());
        assertTrue(consola.indexOf("No vuelo")==-1);
    }

    @Test
    public void testPatoCabezaNegraNadar() {
        patoCabezaNegra.nadar();

        String consola = this.consoleContent.toString();
        assertTrue(consola.indexOf("Nado como un pato")!=-1);
    }

    @Test
    public void testPatoCabezaNegraParpar() {
        patoCabezaNegra.parpar();

        String consola = this.consoleContent.toString();
        assertTrue(consola.indexOf("Puedo parpar")!=-1);

        patoCabezaNegra.setComportamientoDeParpar(new NoParpo());
        assertTrue(consola.indexOf("No puedo parpar")==-1);
    }
}