package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoCostilla;
import mx.iteso.factory.pozoles.PozoleRojoEspinazo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoEspinazoTest {
    @Test
    public void PozoleRojoEspinazoTest(){
        Pozole pozole = new PozoleRojoEspinazo();
        assertEquals("Pozole Rojo con Espinazo", pozole.getName());
    }

    @Test
    public void PozoleRojoEspinazoBrothTest(){
        Pozole pozole = new PozoleRojoEspinazo();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoEspinazoToppingUnoTest(){
        Pozole pozole = new PozoleRojoEspinazo();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoEspinazoToppingDosTest(){
        Pozole pozole = new PozoleRojoEspinazo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoEspinazoToppingTresTest(){
        Pozole pozole = new PozoleRojoEspinazo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
