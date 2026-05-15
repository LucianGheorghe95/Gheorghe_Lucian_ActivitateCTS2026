package state;

public class StareInternat implements StarePacient {

    @Override
    public void schimbaStare(Pacient pacient) {
        pacient.setStarePacient(this);
        System.out.println("Pacientul " + pacient.getNume() + " este internat.");
    }
}