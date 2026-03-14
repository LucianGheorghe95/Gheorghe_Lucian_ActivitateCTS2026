package spital.abstractfactory;

public class Medic implements PersonalSpital {
    @Override
    public void afisareDescriere() {
        System.out.println("A fost creat un medic.");
    }
}