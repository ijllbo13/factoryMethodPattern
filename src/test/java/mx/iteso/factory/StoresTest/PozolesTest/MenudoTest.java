package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.Pozolillo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class MenudoTest {
    @Test
    public void MenudoTest(){
        Pozole pozole = new Menudo();
        assertEquals("Menudo", pozole.getName());
    }

    @Test
    public void MenudoBrothTest(){
        Pozole pozole = new Menudo();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void MenudoToppingUnoTest(){
        Pozole pozole = new Menudo();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void MenudoToppingDosTest(){
        Pozole pozole = new Menudo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void MenudoToppingTresTest(){
        Pozole pozole = new Menudo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
