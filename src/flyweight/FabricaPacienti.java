package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacienti {
    private Map<String, PacientAbstract> colectiePacienti;

    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nume, String numarTelefon, String adresa) {
        if (!colectiePacienti.containsKey(nume)) {
            colectiePacienti.put(nume, new Pacient(nume, numarTelefon, adresa));
        }
        return colectiePacienti.get(nume);
    }
}