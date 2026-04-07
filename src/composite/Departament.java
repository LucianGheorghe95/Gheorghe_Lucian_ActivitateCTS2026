package composite;

import java.util.ArrayList;
import java.util.List;

public class Departament implements StructuraSpital {
    private String nume;
    private List<StructuraSpital> listaNoduri;

    public Departament(String nume) {
        this.nume = nume;
        this.listaNoduri = new ArrayList<>();
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Departament: " + nume);
        for (StructuraSpital nod : listaNoduri) {
            nod.afiseazaStructura();
        }
    }

    @Override
    public void adaugaNod(StructuraSpital nod) {
        listaNoduri.add(nod);
    }

    @Override
    public void stergeNod(StructuraSpital nod) {
        listaNoduri.remove(nod);
    }

    @Override
    public StructuraSpital getNodCopil(int index) {
        return listaNoduri.get(index);
    }
}