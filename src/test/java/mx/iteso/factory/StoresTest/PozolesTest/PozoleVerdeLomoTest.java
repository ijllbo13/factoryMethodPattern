package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeEspinazo;
import mx.iteso.factory.pozoles.PozoleVerdeLomo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeLomoTest {
    @Test
    public void PozoleVerdeLomoTest(){
        Pozole pozole = new PozoleVerdeLomo();
        assertEquals("Pozole Verde con Lomo", pozole.getName());
    }

    @Test
    public void PozoleVerdeLomoBrothTest(){
        Pozole pozole = new PozoleVerdeLomo();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeLomoToppingUnoTest(){
        Pozole pozole = new PozoleVerdeLomo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeLomoToppingDosTest(){
        Pozole pozole = new PozoleVerdeLomo();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeLomoToppingTresTest(){
        Pozole pozole = new PozoleVerdeLomo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
