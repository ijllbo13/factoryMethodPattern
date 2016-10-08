package mx.iteso.factory;

public abstract class PozoleStore {

    public Pozole orderPozole(String meat){
        Pozole pozole;

        pozole = createPozole(meat);

      if (pozole != null) {
        pozole.prepare();
        pozole.serve();
        return pozole;}

        return null;
    }

    public Pozole orderPozole(String meat, String type){
        Pozole pozole;

        pozole = createPozole(meat, type);

        if (pozole != null) {
            pozole.prepare();
            pozole.serve();

            return pozole;
        }
        return null;
    }

    protected abstract Pozole createPozole(String meat);
    protected abstract Pozole createPozole(String meat, String type);


}