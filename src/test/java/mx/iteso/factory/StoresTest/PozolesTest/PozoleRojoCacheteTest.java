package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoCachete;
import mx.iteso.factory.pozoles.PozoleVerdeTrompa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoCacheteTest {
    @Test
    public void PozoleRojoCacheteTest(){
        Pozole pozole = new PozoleRojoCachete();
        assertEquals("Pozole Rojo con Cachete", pozole.getName());
    }

    @Test
    public void PozoleRojoCacheteBrothTest(){
        Pozole pozole = new PozoleRojoCachete();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleVerdeTrompaToppingUnoTest(){
        Pozole pozole = new PozoleRojoCachete();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoCacheteToppingDosTest(){
        Pozole pozole = new PozoleRojoCachete();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoCacheteToppingTresTest(){
        Pozole pozole = new PozoleRojoCachete();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
