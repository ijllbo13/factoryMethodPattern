package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleBlancoOreja extends Pozole {
    public PozoleBlancoOreja() {
        name = "Pozole Blanco con Oreja";
        broth = "Caldo Blanco";
        toppings.add("Cebolla");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}