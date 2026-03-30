package decorator;

public class RezultatPrintat implements RezultatAnalize {
    private String numePacient;
    private String rezultat;

    public RezultatPrintat(String numePacient, String rezultat) {
        this.numePacient = numePacient;
        this.rezultat = rezultat;
    }

    @Override
    public void afiseazaRezultat() {
        System.out.println("Rezultatul pacientului " + numePacient + " este disponibil doar in format printat: " + rezultat);
    }
}