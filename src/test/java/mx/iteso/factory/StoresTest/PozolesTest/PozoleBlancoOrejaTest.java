package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoLomo;
import mx.iteso.factory.pozoles.PozoleBlancoOreja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoOrejaTest {
    @Test
    public void PozoleBlancoOrejaTest(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals("Pozole Blanco con Oreja", pozole.getName());
    }

    @Test
    public void PozoleBlancoOrejaBrothTest(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoOrejaToppingUnoTest(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoOrejaToppingDosTest(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoOrejaToppingTresTest(){
        Pozole pozole = new PozoleBlancoOreja();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
