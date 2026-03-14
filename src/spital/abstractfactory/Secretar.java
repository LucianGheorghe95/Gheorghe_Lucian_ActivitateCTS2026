package spital.abstractfactory;

public class Secretar implements PersonalSpital {
    @Override
    public void afisareDescriere() {
        System.out.println("A fost creat un secretar.");
    }
}