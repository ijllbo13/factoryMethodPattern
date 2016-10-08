package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeCachete;
import mx.iteso.factory.pozoles.PozoleVerdeOreja;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeCacheteTest {
    @Test
    public void PozoleVerdeCacheteTest(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals("Pozole Verde con Cachete", pozole.getName());
    }

    @Test
    public void PozoleVerdeCacheteBrothTest(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeCacheteToppingUnoTest(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeCacheteToppingDosTest(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeCacheteToppingTresTest(){
        Pozole pozole = new PozoleVerdeCachete();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
