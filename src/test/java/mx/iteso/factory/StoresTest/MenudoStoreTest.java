package mx.iteso.factory.StoresTest;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.stores.MenudoStore;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class MenudoStoreTest {

    @Test
    public  void TestMenudoStore(){
        PozoleStore menuderia = new MenudoStore();
        assertEquals("Menudo", menuderia.orderPozole("Pollo").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new MenudoStore();
        assertNull(pozoleria.orderPozole("Costilla", "Verde"));
    }
}
