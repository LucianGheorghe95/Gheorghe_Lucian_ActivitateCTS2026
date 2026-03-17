package spital.abstractfactory;

public class FactoryPersonalNonMedical implements AbstractFactory {

    public PersonalSpital createPersonal(TipPersonalNonMedical tipPersonalNonMedical) {
        switch (tipPersonalNonMedical) {
            case SECRETAR:
                return new Secretar();
            case REGISTRATOR:
                return new Registrator();
            default:
                return null;
        }
    }
}