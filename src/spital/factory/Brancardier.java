package spital.factory;

public class Brancardier implements PersonalSpital {

    @Override
    public void descriere() {
        System.out.println("A fost creat un obiect de tip Brancardier.");
    }
}