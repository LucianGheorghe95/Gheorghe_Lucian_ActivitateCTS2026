package spital.builder;

public class PacientBuilder implements AbstractBuilder {
    private String nume;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public PacientBuilder(String nume) {
        this.nume = nume;
        this.patRabatabil = false;
        this.micDejunInclus = false;
        this.papuciCamera = false;
        this.halatInterior = false;
    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public PacientBuilder setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
        return this;
    }

    public PacientBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public PacientBuilder setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
        return this;
    }

    @Override
    public Pacient build() {
        return new Pacient(nume, patRabatabil, micDejunInclus, papuciCamera, halatInterior);
    }
}