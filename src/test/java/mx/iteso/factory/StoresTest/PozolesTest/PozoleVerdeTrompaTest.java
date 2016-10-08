package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdePollo;
import mx.iteso.factory.pozoles.PozoleVerdeTrompa;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeTrompaTest {
    @Test
    public void PozoleVerdeTrompaTest(){
        Pozole pozole = new PozoleVerdeTrompa();
        assertEquals("Pozole Verde con Trompa", pozole.getName());
    }

    @Test
    public void PozoleVerdeTrompaBrothTest(){
        Pozole pozole = new PozoleVerdeTrompa();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeTrompaToppingUnoTest(){
        Pozole pozole = new PozoleVerdeTrompa();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeTrompaToppingDosTest(){
        Pozole pozole = new PozoleVerdeTrompa();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeTrompaToppingTresTest(){
        Pozole pozole = new PozoleVerdeTrompa();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
