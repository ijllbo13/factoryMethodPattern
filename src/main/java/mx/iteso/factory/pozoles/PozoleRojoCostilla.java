package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleRojoCostilla extends Pozole {
    public PozoleRojoCostilla() {
        name = "Pozole Rojo con Costilla";
        broth = "Caldo Rojo";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}