package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Pacote {
    private ArrayList<Cidade> listaDeCidades = new ArrayList<>();
    private double precoDoPacote;
    private String nomeDoPacote;
    public ArrayList<Cidade> getListaDeCidades() { return listaDeCidades; }
    public void setListaDeCidades(ArrayList<Cidade> listaDeCidades) {
        this.listaDeCidades = listaDeCidades;
    }
    public double getPrecoDoPacote() {
        return precoDoPacote;
    }
    public void setPrecoDoPacote(double precoDoPacote) {
        this.precoDoPacote = precoDoPacote;
    }

    public String getNomeDoPacote() { return nomeDoPacote; }
    public void setNomeDoPacote(String nomeDoPacote) { this.nomeDoPacote = nomeDoPacote; }

    public Pacote(String nomeDoPacote, ArrayList<Cidade> listaDeCidades, double precoDoPacote) {
        setListaDeCidades(listaDeCidades); // provavelmente isso ta errado
        setPrecoDoPacote(precoDoPacote);
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "listaDeCidades=" + listaDeCidades + '\n' +
                ", nomeDoPacote=" + nomeDoPacote + '\n' +
                ", precoDoPacote=" + precoDoPacote + '\n' +
                '}';
    }
}
