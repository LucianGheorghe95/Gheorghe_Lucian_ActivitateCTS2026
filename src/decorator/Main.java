package decorator;

public class Main {
    public static void main(String[] args) {

        RezultatAnalize rezultatInitial = new RezultatPrintat("Popescu Ion", "Analize bune");
        rezultatInitial.afiseazaRezultat();

        System.out.println();

        RezultatAnalize rezultatCuOnline = new RezultatOnline(rezultatInitial);
        rezultatCuOnline.afiseazaRezultat();

        System.out.println();

        rezultatInitial.afiseazaRezultat();
    }
}