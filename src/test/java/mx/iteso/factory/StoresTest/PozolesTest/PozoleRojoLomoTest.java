package mx.iteso.factory.StoresTest.PozolesTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.PozoleRojoEspinazo;
import mx.iteso.factory.pozoles.PozoleRojoLomo;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoLomoTest {
    @Test
    public void PozoleRojoLomoTest(){
        Pozole pozole = new PozoleRojoLomo();
        assertEquals("Pozole Rojo con Lomo", pozole.getName());
    }

    @Test
    public void PozoleRojoLomoBrothTest(){
        Pozole pozole = new PozoleRojoLomo();
        assertEquals("Caldo Rojo", pozole.broth);
    }

    @Test
    public void PozoleRojoLomoToppingUnoTest(){
        Pozole pozole = new PozoleRojoLomo();
        assertEquals("Oregano", pozole.toppings.get(0));
    }

    @Test
    public void PozoleRojoLomoToppingDosTest(){
        Pozole pozole = new PozoleRojoLomo();
        assertEquals("Col", pozole.toppings.get(1));
    }

    @Test
    public void PozoleRojoLomoToppingTresTest(){
        Pozole pozole = new PozoleRojoLomo();
        assertEquals("Rabanos", pozole.toppings.get(2));
    }
}
