package adapter;

public class Main {
    public static void main(String[] args) {

        MedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol");
        medicamentSpital.achizitioneazaMedicament();

        System.out.println();

        MedicamentFarmacie medicamentFarmacie = new AdaptorMedicament("Nurofen");
        medicamentFarmacie.cumparaMedicament();
    }
}