package composite;

public interface StructuraSpital {
    void afiseazaStructura();
    void adaugaNod(StructuraSpital nod);
    void stergeNod(StructuraSpital nod);
    StructuraSpital getNodCopil(int index);
}