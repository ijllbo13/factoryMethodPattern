package mx.iteso.factory.StoresTest;

import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.PozoleVerdeStore;
import mx.iteso.factory.stores.PozolilloStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozolilloStoreTest {
    @Test
    public  void TestPozolilloStore(){
        PozoleStore pozoleria = new PozolilloStore();
        assertEquals("Pozolillo", pozoleria.orderPozole("Costilla").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new PozolilloStore();
        assertNull(pozoleria.orderPozole("Costilla", "Verde"));
    }
}
