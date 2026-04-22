package flyweight;

public class Pacient implements PacientAbstract {
    private String nume;
    private String numarTelefon;
    private String adresa;

    public Pacient(String nume, String numarTelefon, String adresa) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresa = adresa;
    }

    @Override
    public void afiseazaInformatii(Internare internare) {
        System.out.println("Pacient: " + nume +
                ", telefon: " + numarTelefon +
                ", adresa: " + adresa +
                ", salon: " + internare.getNumarSalon() +
                ", pat: " + internare.getNumarPat() +
                ", zile spitalizare: " + internare.getNumarZileSpitalizare());
    }
}