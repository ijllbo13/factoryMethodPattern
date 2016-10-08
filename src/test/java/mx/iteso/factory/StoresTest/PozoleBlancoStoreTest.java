package mx.iteso.factory.StoresTest;

import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.MenudoStore;
import mx.iteso.factory.stores.PozoleBlancoStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoStoreTest {
    @Test
    public  void TestPozoleBlancoStore(){
        PozoleStore pozoleria = new PozoleBlancoStore();
        assertEquals("Pozole Blanco con Costilla", pozoleria.orderPozole("Costilla").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new PozoleBlancoStore();
        assertNull(pozoleria.orderPozole("Costilla", "Verde"));
    }

}
