package mx.iteso.factory.StoresTest;

import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.stores.AllPozolesStore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class AllPozolesStoreTest {
    @Test
    public  void TestaAllPozoleBlancoStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertEquals("Pozole Blanco con Costilla", pozoleria.orderPozole("Costilla","Blanco").getName());
    }

    @Test
    public  void TestaAllPozoleRojoStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertEquals("Pozole Rojo con Costilla", pozoleria.orderPozole("Costilla","Rojo").getName());
    }

    @Test
    public  void TestMenudoStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertEquals("Menudo", pozoleria.orderPozole("Costilla", "Menudo").getName());
    }

    @Test
    public  void TestaAllPozoleVerdeStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertEquals("Pozole Verde con Costilla", pozoleria.orderPozole("Costilla","Verde").getName());
    }

    @Test
    public  void TestPozolilloStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertEquals("Pozolillo", pozoleria.orderPozole("Costilla", "Pozolillo").getName());
    }

    @Test
    public  void TestNullStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertNull(pozoleria.orderPozole("Costilla"));
    }

    @Test
    public  void TestNullAllStore(){
        PozoleStore pozoleria = new AllPozolesStore();
        assertNull(pozoleria.orderPozole("Costilla", "Lomo"));
    }

}
