package observer;

public class Main {
    public static void main(String[] args) {

        Spital spital = new Spital("Spital Judetean");

        Observator pacient1 = new Pacient("Popescu Ion");
        Observator pacient2 = new Pacient("Ionescu Maria");
        Observator pacient3 = new Pacient("Georgescu Andrei");

        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        spital.apareUrgentaVirus("gripal");

        System.out.println();

        spital.dezaboneazaPacient(pacient2);

        spital.apareUrgentaVirus("COVID");
    }
}