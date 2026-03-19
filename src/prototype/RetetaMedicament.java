package prototype;

public class RetetaMedicament extends RetetaAbstracta {

    public RetetaMedicament(String denumireMedicament, float cantitateSolutie1,
                            float cantitateSolutie2, float cantitateSolutie3) {
        super(denumireMedicament, cantitateSolutie1, cantitateSolutie2, cantitateSolutie3);
    }

    private RetetaMedicament(RetetaMedicament reteta) {
        super(reteta.denumireMedicament,
                reteta.cantitateSolutie1,
                reteta.cantitateSolutie2,
                reteta.cantitateSolutie3);
    }

    @Override
    public RetetaAbstracta cloneaza() {
        return new RetetaMedicament(this);
    }

    @Override
    public String toString() {
        return "RetetaMedicament{" +
                "denumireMedicament='" + denumireMedicament + '\'' +
                ", cantitateSolutie1=" + cantitateSolutie1 +
                ", cantitateSolutie2=" + cantitateSolutie2 +
                ", cantitateSolutie3=" + cantitateSolutie3 +
                '}';
    }
}