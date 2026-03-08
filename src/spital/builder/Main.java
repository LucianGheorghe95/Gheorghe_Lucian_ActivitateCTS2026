package spital.builder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientBuilder("Popescu Ion")
                .setPatRabatabil(true)
                .setMicDejunInclus(true)
                .build();

        Pacient pacient2 = new PacientBuilder("Ionescu Maria")
                .setPapuciCamera(true)
                .setHalatInterior(true)
                .build();

        Pacient pacient3 = new PacientBuilder("Georgescuu Andrei")
                .build();

        System.out.println(pacient1);
        System.out.println(pacient2);
        System.out.println(pacient3);
    }
}