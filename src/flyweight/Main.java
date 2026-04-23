package flyweight;

public class Main {
    public static void main(String[] args) {

        FabricaPacienti fabricaPacienti = new FabricaPacienti();

        PacientAbstract pacient1 = fabricaPacienti.getPacient("Popescu Ion", "0711111111", "Bucuresti");
        pacient1.afiseazaInformatii(new Internare(101, 1, 5));

        PacientAbstract pacient2 = fabricaPacienti.getPacient("Ionescu Maria", "0722222222", "Constanta");
        pacient2.afiseazaInformatii(new Internare(102, 2, 3));

        PacientAbstract pacient3 = fabricaPacienti.getPacient("Popescu Ion", "0711111111", "Bucuresti");
        pacient3.afiseazaInformatii(new Internare(201, 4, 7));
    }
}