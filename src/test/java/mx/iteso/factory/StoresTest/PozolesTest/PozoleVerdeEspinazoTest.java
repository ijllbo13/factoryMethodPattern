package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleVerdeCostilla;
import mx.iteso.factory.pozoles.PozoleVerdeEspinazo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeEspinazoTest {
    @Test
    public void PozoleVerdeEspinazoTest(){
        Pozole pozole = new PozoleVerdeEspinazo();
        assertEquals("Pozole Verde con Espinazo", pozole.getName());
    }

    @Test
    public void PozoleVerdeEspinazoBrothTest(){
        Pozole pozole = new PozoleVerdeEspinazo();
        assertEquals("Caldo Verde", pozole.broth);
    }

    @Test
    public void PozoleVerdeEspinazoToppingUnoTest(){
        Pozole pozole = new PozoleVerdeEspinazo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleVerdeEspinazoToppingDosTest(){
        Pozole pozole = new PozoleVerdeEspinazo();
        assertEquals("Lechuga", pozole.toppings.get(1));
    }

    @Test
    public void PozoleVerdeEspinazoToppingTresTest(){
        Pozole pozole = new PozoleVerdeEspinazo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
