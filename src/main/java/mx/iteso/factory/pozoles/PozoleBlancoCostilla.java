package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoCostilla extends Pozole {
    public PozoleBlancoCostilla() {
        name = "Pozole Blanco con Costilla";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
