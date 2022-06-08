package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Pacote {
    private ArrayList<Cidade> listaDeCidades = new ArrayList<>();
    private double precoDoPacote;

    public Pacote(ArrayList<Cidade> listaDeCidades, double precoDoPacote) {
        this.listaDeCidades = listaDeCidades;
        this.precoDoPacote = precoDoPacote;
    }
}
