package decorator;

public class RezultatOnline extends DecoratorRezultat {

    public RezultatOnline(RezultatAnalize rezultatAnalize) {
        super(rezultatAnalize);
    }

    @Override
    public void afiseazaRezultat() {
        super.afiseazaRezultat();
        System.out.println("Rezultatul este disponibil si pe platforma online.");
    }
}