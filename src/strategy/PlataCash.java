package strategy;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul plateste cash suma de " + suma + " lei.");
    }
}