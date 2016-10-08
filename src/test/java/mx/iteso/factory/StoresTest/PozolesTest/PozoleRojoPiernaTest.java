package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoOreja;
import mx.iteso.factory.pozoles.PozoleRojoPierna;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoPiernaTest {
    @Test
    public void PozoleRojoPiernaTest(){
        Pozole pozole = new PozoleRojoPierna();
        assertEquals("Pozole Rojo con Pierna", pozole.getName());
    }

    @Test
    public void PozoleRojoPiernaBrothTest(){
        Pozole pozole = new PozoleRojoPierna();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoPiernaToppingUnoTest(){
        Pozole pozole = new PozoleRojoPierna();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoPiernaToppingDosTest(){
        Pozole pozole = new PozoleRojoPierna();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoPiernaToppingTresTest(){
        Pozole pozole = new PozoleRojoPierna();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
