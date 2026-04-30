package strategy;

public class PlataCard implements ModPlata {

    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul plateste cu cardul suma de " + suma + " lei.");
    }
}