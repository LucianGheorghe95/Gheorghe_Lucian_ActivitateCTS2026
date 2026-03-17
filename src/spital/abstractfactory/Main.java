package spital.abstractfactory;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalMedical factoryMedical = new FactoryPersonalMedical();
        FactoryPersonalNonMedical factoryNonMedical = new FactoryPersonalNonMedical();

        PersonalSpital medic = factoryMedical.createPersonal(TipPersonalMedical.MEDIC);
        PersonalSpital asistent = factoryMedical.createPersonal(TipPersonalMedical.ASISTENT);
        PersonalSpital brancardier = factoryMedical.createPersonal(TipPersonalMedical.BRANCARDIER);

        PersonalSpital secretar = factoryNonMedical.createPersonal(TipPersonalNonMedical.SECRETAR);
        PersonalSpital registrator = factoryNonMedical.createPersonal(TipPersonalNonMedical.REGISTRATOR);

        medic.afisareDescriere();
        asistent.afisareDescriere();
        brancardier.afisareDescriere();
        secretar.afisareDescriere();
        registrator.afisareDescriere();
    }
}