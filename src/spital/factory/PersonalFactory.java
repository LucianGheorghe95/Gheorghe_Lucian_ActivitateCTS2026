package spital.factory;

public class PersonalFactory {

    public PersonalSpital createInstance(TipPersonal tipPersonal) {
        switch (tipPersonal) {
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