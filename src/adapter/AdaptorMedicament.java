package adapter;

public class AdaptorMedicament extends MedicamentSpital implements MedicamentFarmacie {

    public AdaptorMedicament(String denumire) {
        super(denumire);
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul a fost cumparat din farmacie fara verificarea retetei.");
    }
}