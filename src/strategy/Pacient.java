package strategy;

public class Pacient {
    private String nume;
    private ModPlata modPlata;

    public Pacient(String nume) {
        this.nume = nume;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void efectueazaPlata(double suma) {
        if (modPlata != null) {
            System.out.println("Pacient: " + nume);
            modPlata.plateste(suma);
        } else {
            System.out.println("Nu a fost selectat un mod de plata.");
        }
    }
}