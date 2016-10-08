package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoPollo;
import mx.iteso.factory.pozoles.PozoleBlancoTrompa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoTrompaTest {
    @Test
    public void PozoleBlancoTrompaTest(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals("Pozole Blanco con Trompa", pozole.getName());
    }

    @Test
    public void PozoleBlancoTrompaBrothTest(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoTrompaToppingUnoTest(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoTrompaToppingDosTest(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoTrompaToppingTresTest(){
        Pozole pozole = new PozoleBlancoTrompa();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
