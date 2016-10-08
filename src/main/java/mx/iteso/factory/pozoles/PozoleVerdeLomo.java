package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Carlos Flores on 06/10/2016.
 */
public class PozoleVerdeLomo extends Pozole {
    public PozoleVerdeLomo() {
        name = "Pozole Verde con Lomo";
        broth = "Caldo Verde";
        toppings.add("Cebolla");
        toppings.add("Lechuga");
        toppings.add("Rabanos");
    }
}
