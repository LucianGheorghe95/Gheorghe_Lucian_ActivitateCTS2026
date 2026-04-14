package proxy;

public class ProxyInternare implements Internare {
    private InternarePacient internarePacient;

    public ProxyInternare() {
        this.internarePacient = new InternarePacient();
    }

    @Override
    public void interneaza(Pacient pacient) {
        if (pacient.isAreAsigurare()) {
            internarePacient.interneaza(pacient);
        } else {
            System.out.println("Pacientul " + pacient.getNume() + " nu poate fi internat deoarece nu are asigurare de sanatate.");
        }
    }
}