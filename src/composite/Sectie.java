package composite;

public class Sectie implements StructuraSpital {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaStructura() {
        System.out.println("Sectie: " + nume);
    }

    @Override
    public void adaugaNod(StructuraSpital nod) {
        throw new UnsupportedOperationException("Sectia nu poate contine alte noduri.");
    }

    @Override
    public void stergeNod(StructuraSpital nod) {
        throw new UnsupportedOperationException("Sectia nu contine alte noduri.");
    }

    @Override
    public StructuraSpital getNodCopil(int index) {
        throw new UnsupportedOperationException("Sectia nu are copii.");
    }
}