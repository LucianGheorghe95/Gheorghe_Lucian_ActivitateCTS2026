package state;

public class Pacient {
    private String nume;
    private StarePacient starePacient;

    public Pacient(String nume) {
        this.nume = nume;
        this.starePacient = null;
    }

    public String getNume() {
        return nume;
    }

    public StarePacient getStarePacient() {
        return starePacient;
    }

    public void setStarePacient(StarePacient starePacient) {
        this.starePacient = starePacient;
    }

    public void interneaza() {
        StarePacient stare = new StareInternat();
        stare.schimbaStare(this);
    }

    public void treceSubObservatie() {
        StarePacient stare = new StareSubObservatie();
        stare.schimbaStare(this);
    }

    public void externeaza() {
        StarePacient stare = new StareExternat();
        stare.schimbaStare(this);
    }
}