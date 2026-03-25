package adapter;

public class MedicamentSpital {
    private String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Medicamentul " + denumire + " a fost achizitionat din aplicatia spitalului.");
    }

    public void prezintaReteta() {
        System.out.println("Se verifica existenta retetei pentru medicamentul " + denumire + ".");
    }
}