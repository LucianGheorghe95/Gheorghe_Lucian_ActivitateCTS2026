package proxy;

public class Main {
    public static void main(String[] args) {

        Pacient pacient1 = new Pacient("Popescu Ion", true);
        Pacient pacient2 = new Pacient("Ionescu Maria", false);

        Internare proxyInternare = new ProxyInternare();

        proxyInternare.interneaza(pacient1);
        proxyInternare.interneaza(pacient2);
    }
}