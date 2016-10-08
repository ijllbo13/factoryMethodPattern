package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoTrompa;
import mx.iteso.factory.pozoles.Pozolillo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozolilloTest {
    @Test
    public void PozolilloTest(){
        Pozole pozole = new Pozolillo();
        assertEquals("Pozolillo", pozole.getName());
    }

    @Test
    public void PozolilloBrothTest(){
        Pozole pozole = new Pozolillo();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozolilloToppingUnoTest(){
        Pozole pozole = new Pozolillo();
        assertEquals("Limon", pozole.toppings.get(0));
    }

    @Test
    public void PozolilloToppingDosTest(){
        Pozole pozole = new Pozolillo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozolilloToppingTresTest(){
        Pozole pozole = new Pozolillo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
