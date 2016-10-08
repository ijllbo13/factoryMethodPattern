package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdePierna;
import mx.iteso.factory.pozoles.PozoleVerdePollo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdePolloTest {
    @Test
    public void PozoleVerdePolloTest(){
        Pozole pozole = new PozoleVerdePollo();
        assertEquals("Pozole Verde con Pollo", pozole.getName());
    }

    @Test
    public void PozoleVerdePolloBrothTest(){
        Pozole pozole = new PozoleVerdePollo();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdePolloToppingUnoTest(){
        Pozole pozole = new PozoleVerdePollo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdePolloToppingDosTest(){
        Pozole pozole = new PozoleVerdePollo();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdePolloToppingTresTest(){
        Pozole pozole = new PozoleVerdePollo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
