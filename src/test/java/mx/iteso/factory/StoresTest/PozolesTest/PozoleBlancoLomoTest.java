package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleBlancoEspinazo;
import mx.iteso.factory.pozoles.PozoleBlancoLomo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoLomoTest {
    @Test
    public void PozoleBlancoLomoTest(){
        Pozole pozole = new PozoleBlancoLomo();
        assertEquals("Pozole Blanco con Lomo", pozole.getName());
    }

    @Test
    public void PozoleBlancoLomoBrothTest(){
        Pozole pozole = new PozoleBlancoLomo();
        assertEquals("Caldo Blanco", pozole.broth);
    }

    @Test
    public void PozoleBlancoLomoToppingUnoTest(){
        Pozole pozole = new PozoleBlancoLomo();
        assertEquals("Cebolla", pozole.toppings.get(0));
    }

    @Test
    public void PozoleBlancoLomoToppingDosTest(){
        Pozole pozole = new PozoleBlancoLomo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleBlancoLomoToppingTresTest(){
        Pozole pozole = new PozoleBlancoLomo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
