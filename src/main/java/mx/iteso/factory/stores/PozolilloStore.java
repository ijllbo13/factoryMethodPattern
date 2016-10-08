package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.Pozolillo;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozolilloStore  extends PozoleStore {

    @Override
    public Pozole createPozole(String meat, String type){return null;}

    @Override
    protected Pozole createPozole(String meat) {
        Pozole pozole = new Pozolillo();
        return pozole;
    }
}