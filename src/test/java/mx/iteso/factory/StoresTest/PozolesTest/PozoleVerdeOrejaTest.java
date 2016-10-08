package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeOrejaTest {

    @Test
    public void PozoleVerdeOrejaTest(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals("Pozole Verde con Oreja", pozole.getName());
    }

    @Test
    public void PozoleVerdeOrejaBrothTest(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeOrejaToppingUnoTest(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeOrejaToppingDosTest(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeOrejaToppingTresTest(){
        Pozole pozole = new PozoleVerdeOreja();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
