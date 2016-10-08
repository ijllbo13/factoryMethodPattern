package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoPollo;
import mx.iteso.factory.pozoles.PozoleRojoTrompa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoTrompaTest {
    @Test
    public void PozoleRojoTrompaTest(){
        Pozole pozole = new PozoleRojoTrompa();
        assertEquals("Pozole Rojo con Trompa", pozole.getName());
    }

    @Test
    public void PozoleRojoTrompaBrothTest(){
        Pozole pozole = new PozoleRojoTrompa();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoTrompaToppingUnoTest(){
        Pozole pozole = new PozoleRojoTrompa();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoTrompaToppingDosTest(){
        Pozole pozole = new PozoleRojoTrompa();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoTrompaToppingTresTest(){
        Pozole pozole = new PozoleRojoTrompa();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
