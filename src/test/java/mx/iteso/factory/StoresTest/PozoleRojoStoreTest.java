package mx.iteso.factory.StoresTest;

import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoStoreTest {

    @Test
    public  void TestPozoleRojoStore(){
        PozoleStore pozoleria = new PozoleRojoStore();
        assertEquals("Pozole Rojo con Costilla", pozoleria.orderPozole("Costilla").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new PozoleRojoStore();
        assertNull(pozoleria.orderPozole("Costilla", "Verde"));
    }
}
