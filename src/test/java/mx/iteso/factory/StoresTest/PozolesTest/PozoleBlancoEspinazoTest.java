package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoCostilla;
import mx.iteso.factory.pozoles.PozoleBlancoEspinazo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoEspinazoTest {
    @Test
    public void PozoleBlancoEspinazoTest(){
        Pozole pozole = new PozoleBlancoEspinazo();
        assertEquals("Pozole Blanco con Espinazo", pozole.getName());
    }

    @Test
    public void PozoleBlancoEspinazoBrothTest(){
        Pozole pozole = new PozoleBlancoEspinazo();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoEspinazoToppingUnoTest(){
        Pozole pozole = new PozoleBlancoEspinazo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoEspinazoToppingDosTest(){
        Pozole pozole = new PozoleBlancoEspinazo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoEspinazoToppingTresTest(){
        Pozole pozole = new PozoleBlancoEspinazo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
