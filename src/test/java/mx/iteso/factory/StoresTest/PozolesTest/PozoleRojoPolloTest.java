package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoPierna;
import mx.iteso.factory.pozoles.PozoleRojoPollo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoPolloTest {
    @Test
    public void PozoleRojoPolloTest(){
        Pozole pozole = new PozoleRojoPollo();
        assertEquals("Pozole Rojo con Pollo", pozole.getName());
    }

    @Test
    public void PozoleRojoPolloBrothTest(){
        Pozole pozole = new PozoleRojoPollo();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoPolloToppingUnoTest(){
        Pozole pozole = new PozoleRojoPollo();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoPolloToppingDosTest(){
        Pozole pozole = new PozoleRojoPollo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoPolloToppingTresTest(){
        Pozole pozole = new PozoleRojoPollo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
