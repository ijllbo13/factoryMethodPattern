package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import mx.iteso.factory.pozoles.PozoleVerdeOreja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoCacheteTest {
    @Test
    public void PozoleBlancoCacheteTest(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals("Pozole Blanco con Cachete", pozole.getName());
    }

    @Test
    public void PozoleBlancoCacheteBrothTest(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoCacheteToppingUnoTest(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoCacheteToppingDosTest(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoCacheteToppingTresTest(){
        Pozole pozole = new PozoleBlancoCachete();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }

}
