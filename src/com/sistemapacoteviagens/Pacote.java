package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Pacote {
    private ArrayList<Cidade> listaDeCidades = new ArrayList<>();
    private double precoDoPacote;

    public ArrayList<Cidade> getListaDeCidades() {
        return listaDeCidades;
    }

    public void setListaDeCidades(ArrayList<Cidade> listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }

    public double getPrecoDoPacote() {
        return precoDoPacote;
    }

    public void setPrecoDoPacote(double precoDoPacote) {
        this.precoDoPacote = precoDoPacote;
    }

    public Pacote(ArrayList<Cidade> listaDeCidades, double precoDoPacote) {
        setListaDeCidades(listaDeCidades); // provavelmente isso ta errado
        setPrecoDoPacote(precoDoPacote);
    }
}
