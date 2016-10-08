package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoOreja;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoPiernaTest {
    @Test
    public void PozoleBlancoPiernaTest(){
        Pozole pozole = new PozoleBlancoPierna();
        assertEquals("Pozole Blanco con Pierna", pozole.getName());
    }

    @Test
    public void PozoleBlancoPiernaBrothTest(){
        Pozole pozole = new PozoleBlancoPierna();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoPiernaToppingUnoTest(){
        Pozole pozole = new PozoleBlancoPierna();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoPiernaToppingDosTest(){
        Pozole pozole = new PozoleBlancoPierna();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoPiernaToppingTresTest(){
        Pozole pozole = new PozoleBlancoPierna();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
