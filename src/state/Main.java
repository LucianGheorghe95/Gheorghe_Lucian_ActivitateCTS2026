package state;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Popescu Ion");

        pacient.interneaza();
        pacient.treceSubObservatie();
        pacient.externeaza();
    }
}