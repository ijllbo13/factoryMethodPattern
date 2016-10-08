package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class PozoleRojoStore extends PozoleStore {

    @Override
    public Pozole createPozole(String meat, String type){return null;}

    @Override
    protected Pozole createPozole(String meat) {
        if (meat.equals("pollo"))
            return new PozoleRojoPollo();
        else if (meat.equals("cachete") )
            return new PozoleRojoCachete();
        else if (meat.equals("oreja"))
            return new PozoleRojoOreja();
        else if (meat.equals("pierna") )
            return new PozoleRojoPierna();
        else if (meat.equals("trompa"))
            return new PozoleRojoTrompa();
        else if (meat.equals("Costilla"))
            return new PozoleRojoCostilla();
        else if (meat.equals("Espinazo"))
            return new PozoleRojoEspinazo();
        else if (meat.equals("Lomo"))
            return new PozoleRojoLomo();
        else return null;
    }
}
