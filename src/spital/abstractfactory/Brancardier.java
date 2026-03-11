package spital.abstractfactory;

public class Brancardier implements PersonalSpital {
    @Override
    public void afisareDescriere() {
        System.out.println("a fost creat un brancardier.");
    }
}