package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import mx.iteso.factory.pozoles.PozoleBlancoCostilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoCostillaTest {
    @Test
    public void PozoleBlancoCostillaTest(){
        Pozole pozole = new PozoleBlancoCostilla();
        assertEquals("Pozole Blanco con Costilla", pozole.getName());
    }

    @Test
    public void PozoleBlancoCostillaBrothTest(){
        Pozole pozole = new PozoleBlancoCostilla();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoCostillaToppingUnoTest(){
        Pozole pozole = new PozoleBlancoCostilla();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoCostillaToppingDosTest(){
        Pozole pozole = new PozoleBlancoCostilla();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoCostillaToppingTresTest(){
        Pozole pozole = new PozoleBlancoCostilla();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
