package observer;

import java.util.ArrayList;
import java.util.List;

public class Spital {
    private String nume;
    private List<Observator> listaPacientiAbonati;

    public Spital(String nume) {
        this.nume = nume;
        this.listaPacientiAbonati = new ArrayList<>();
    }

    public void aboneazaPacient(Observator pacient) {
        listaPacientiAbonati.add(pacient);
    }

    public void dezaboneazaPacient(Observator pacient) {
        listaPacientiAbonati.remove(pacient);
    }

    public void notificaPacienti(String mesaj) {
        System.out.println("Spitalul " + nume + " trimite notificare:");
        for (Observator pacient : listaPacientiAbonati) {
            pacient.primesteNotificare(mesaj);
        }
    }

    public void apareUrgentaVirus(String numeVirus) {
        notificaPacienti("A aparut o urgenta legata de virusul " + numeVirus + ".");
    }
}