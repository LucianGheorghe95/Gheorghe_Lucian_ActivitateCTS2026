package strategy;

public class Main {
    public static void main(String[] args) {

        Pacient pacient = new Pacient("Popescu Ion");

        pacient.setModPlata(new PlataCash());
        pacient.efectueazaPlata(500);

        pacient.setModPlata(new PlataCard());
        pacient.efectueazaPlata(750);
    }
}