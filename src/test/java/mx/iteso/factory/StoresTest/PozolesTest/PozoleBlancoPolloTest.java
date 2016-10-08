package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoPierna;
import mx.iteso.factory.pozoles.PozoleBlancoPollo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoPolloTest {
    @Test
    public void PozoleBlancoPolloTest(){
        Pozole pozole = new PozoleBlancoPollo();
        assertEquals("Pozole Blanco con Pollo", pozole.getName());
    }

    @Test
    public void PozoleBlancoPolloBrothTest(){
        Pozole pozole = new PozoleBlancoPollo();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoPolloToppingUnoTest(){
        Pozole pozole = new PozoleBlancoPollo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoPolloToppingDosTest(){
        Pozole pozole = new PozoleBlancoPollo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoPolloToppingTresTest(){
        Pozole pozole = new PozoleBlancoPollo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
