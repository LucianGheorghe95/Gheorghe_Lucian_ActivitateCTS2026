package spital.abstractfactory;

public class FactoryPersonalMedical implements AbstractFactory {

    public PersonalSpital createPersonal(TipPersonalMedical tipPersonalMedical) {
        switch (tipPersonalMedical) {
            case BRANCARDIER:
                return new Brancardier();
            case ASISTENT:
                return new Asistent();
            case MEDIC:
                return new Medic();
            default:
                return null;
        }
    }
}