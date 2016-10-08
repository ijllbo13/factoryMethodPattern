package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoLomo;
import mx.iteso.factory.pozoles.PozoleRojoOreja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoOrejaTest {
    @Test
    public void PozoleRojoOrejaTest(){
        Pozole pozole = new PozoleRojoOreja();
        assertEquals("Pozole Rojo con Oreja", pozole.getName());
    }

    @Test
    public void PozoleRojoOrejaBrothTest(){
        Pozole pozole = new PozoleRojoOreja();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoOrejaToppingUnoTest(){
        Pozole pozole = new PozoleRojoOreja();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoOrejaToppingDosTest(){
        Pozole pozole = new PozoleRojoOreja();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoOrejaToppingTresTest(){
        Pozole pozole = new PozoleRojoOreja();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
