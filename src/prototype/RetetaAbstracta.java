package prototype;

public abstract class RetetaAbstracta {
    protected String denumireMedicament;
    protected float cantitateSolutie1;
    protected float cantitateSolutie2;
    protected float cantitateSolutie3;

    public RetetaAbstracta(String denumireMedicament, float cantitateSolutie1,
                           float cantitateSolutie2, float cantitateSolutie3) {
        this.denumireMedicament = denumireMedicament;
        this.cantitateSolutie1 = cantitateSolutie1;
        this.cantitateSolutie2 = cantitateSolutie2;
        this.cantitateSolutie3 = cantitateSolutie3;
    }

    public abstract RetetaAbstracta cloneaza();
}