package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoStore  extends PozoleStore {

    @Override
    public Pozole createPozole(String meat, String type){return null;}

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozoleBlancoPollo();
        else if (meat.equals("cachete") )
            return new PozoleBlancoCachete();
        else if (meat.equals("oreja"))
            return new PozoleBlancoOreja();
        else if (meat.equals("pierna") )
            return new PozoleBlancoPierna();
        else if (meat.equals("trompa"))
            return new PozoleBlancoTrompa();
        else if (meat.equals("Costilla"))
            return new PozoleBlancoCostilla();
        else if (meat.equals("Espinazo"))
            return new PozoleBlancoEspinazo();
        else if (meat.equals("Lomo"))
            return new PozoleBlancoLomo();
        else return null;
    }
}