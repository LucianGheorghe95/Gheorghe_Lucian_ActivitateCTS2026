package decorator;

public abstract class DecoratorRezultat implements RezultatAnalize {
    protected RezultatAnalize rezultatAnalize;

    public DecoratorRezultat(RezultatAnalize rezultatAnalize) {
        this.rezultatAnalize = rezultatAnalize;
    }

    @Override
    public void afiseazaRezultat() {
        rezultatAnalize.afiseazaRezultat();
    }
}