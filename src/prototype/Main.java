package prototype;



public class Main {
    public static void main(String[] args) {

        RetetaAbstracta retetaOriginala = new RetetaMedicament("Paracetamol", 10.5f, 5.0f, 2.5f);

        RetetaAbstracta retetaCopie1 = retetaOriginala.cloneaza();
        RetetaAbstracta retetaCopie2 = retetaOriginala.cloneaza();

        System.out.println(retetaOriginala);
        System.out.println(retetaCopie1);
        System.out.println(retetaCopie2);
    }
}