package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by Carlos Flores on 10/6/2016.
 */
public class AllPozolesStore extends PozoleStore {



    @Override
    public Pozole createPozole(String meat){
        return null;
    }

    public Pozole createPozole(String meat, String type){

        if(type.equals("Menudo"))
            return new Menudo();
        if(type.equals("Pozolillo"))
            return new Pozolillo();
        if(type.equals("Blanco"))
           return new PozoleBlancoStore().createPozole(meat);
        if(type.equals("Rojo"))
            return new PozoleRojoStore().createPozole(meat);
        if(type.equals("Verde"))
            return new PozoleVerdeStore().createPozole(meat);

        else return null;
    }

}
