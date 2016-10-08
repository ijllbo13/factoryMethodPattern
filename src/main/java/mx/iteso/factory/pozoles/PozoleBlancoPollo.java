package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoPollo extends Pozole {
    public PozoleBlancoPollo() {
        name = "Pozole Blanco con Pollo";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
