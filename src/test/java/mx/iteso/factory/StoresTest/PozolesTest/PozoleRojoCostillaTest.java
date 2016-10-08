package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoCachete;
import mx.iteso.factory.pozoles.PozoleRojoCostilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoCostillaTest {
    @Test
    public void PozoleRojoCostillaTest(){
        Pozole pozole = new PozoleRojoCostilla();
        assertEquals("Pozole Rojo con Costilla", pozole.getName());
    }

    @Test
    public void PozoleRojoCostillaBrothTest(){
        Pozole pozole = new PozoleRojoCostilla();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoCostillaToppingUnoTest(){
        Pozole pozole = new PozoleRojoCostilla();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoCostillaToppingDosTest(){
        Pozole pozole = new PozoleRojoCostilla();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoCostillaToppingTresTest(){
        Pozole pozole = new PozoleRojoCostilla();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
