package composite;

public class Main {
    public static void main(String[] args) {

        StructuraSpital departamentSpital = new Departament("Spital Judetean");

        StructuraSpital departamentChirurgie = new Departament("Chirurgie");
        StructuraSpital departamentCardiologie = new Departament("Cardiologie");

        StructuraSpital sectieATI = new Sectie("ATI");
        StructuraSpital sectieBlocOperator = new Sectie("Bloc Operator");
        StructuraSpital sectieConsultatii = new Sectie("Consultatii Cardiologie");
        StructuraSpital sectieRecuperare = new Sectie("Recuperare Cardiaca");

        departamentChirurgie.adaugaNod(sectieATI);
        departamentChirurgie.adaugaNod(sectieBlocOperator);

        departamentCardiologie.adaugaNod(sectieConsultatii);
        departamentCardiologie.adaugaNod(sectieRecuperare);

        departamentSpital.adaugaNod(departamentChirurgie);
        departamentSpital.adaugaNod(departamentCardiologie);

        departamentSpital.afiseazaStructura();
    }
}