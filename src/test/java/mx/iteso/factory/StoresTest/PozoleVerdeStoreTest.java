package mx.iteso.factory.StoresTest;

import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleRojoStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeStoreTest {
    @Test
    public  void TestPozoleVerdeStore(){
        PozoleStore pozoleria = new PozoleVerdeStore();
        assertEquals("Pozole Verde con Costilla", pozoleria.orderPozole("Costilla").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new PozoleVerdeStore();
        assertNull(pozoleria.orderPozole("Costilla", "Verde"));
    }
}
