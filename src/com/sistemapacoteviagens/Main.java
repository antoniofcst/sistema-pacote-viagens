package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        PacotesDeViagens pacote1 = new PacotesDeViagens(200);
        PacotesDeViagens pacote2 = new PacotesDeViagens(400);
        PacotesDeViagens pacote3 = new PacotesDeViagens(500);
        Cliente cliente1 = new Cliente("Henrique", "Fogaca", "239232", "Masculino", "SP", 3333, "h@");
        cliente1.pacoteDoCliente.add(pacote1);

        cliente1.pacoteDoCliente.forEach(pacote -> System.out.println(pacote));

    }
}
