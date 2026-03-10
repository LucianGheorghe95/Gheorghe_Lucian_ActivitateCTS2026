package spital.factory;

public class Main {
    public static void main(String[] args) {

        PersonalFactory fabrica = new PersonalFactory();

        PersonalSpital brancardier = fabrica.createInstance(TipPersonal.BRANCARDIER);
        PersonalSpital asistent = fabrica.createInstance(TipPersonal.ASISTENT);
        PersonalSpital medic = fabrica.createInstance(TipPersonal.MEDIC);

        brancardier.descriere();
        asistent.descriere();
        medic.descriere();
    }
}