package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeCachete;
import mx.iteso.factory.pozoles.PozoleVerdeCostilla;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeCostillaTest {
    @Test
    public void PozoleVerdeCostillaTest(){
        Pozole pozole = new PozoleVerdeCostilla();
        assertEquals("Pozole Verde con Costilla", pozole.getName());
    }

    @Test
    public void PozoleVerdeCostillaBrothTest(){
        Pozole pozole = new PozoleVerdeCostilla();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeCostillaToppingUnoTest(){
        Pozole pozole = new PozoleVerdeCostilla();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeCostillaToppingDosTest(){
        Pozole pozole = new PozoleVerdeCostilla();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeCostillaToppingTresTest(){
        Pozole pozole = new PozoleVerdeCostilla();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
