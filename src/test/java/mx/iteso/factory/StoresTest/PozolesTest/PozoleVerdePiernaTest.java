package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeLomo;
import mx.iteso.factory.pozoles.PozoleVerdePierna;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdePiernaTest {
    @Test
    public void PozoleVerdePiernaTest(){
        Pozole pozole = new PozoleVerdePierna();
        assertEquals("Pozole Verde con Pierna", pozole.getName());
    }

    @Test
    public void PozoleVerdePiernaBrothTest(){
        Pozole pozole = new PozoleVerdePierna();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdePiernaToppingUnoTest(){
        Pozole pozole = new PozoleVerdePierna();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdePiernaToppingDosTest(){
        Pozole pozole = new PozoleVerdePierna();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdePiernaToppingTresTest(){
        Pozole pozole = new PozoleVerdePierna();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
