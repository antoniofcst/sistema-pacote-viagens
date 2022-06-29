package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Pacote {
    private ArrayList<Cidade> listaDeCidades = new ArrayList<>();
    private double precoDoPacote;
    private String nomeDoPacote;
    private static int count = 1;
    private int ID;
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

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public Pacote(String nomeDoPacote, ArrayList<Cidade> listaDeCidades, double precoDoPacote) {setNomeDoPacote(nomeDoPacote);
        setListaDeCidades(listaDeCidades);
        setPrecoDoPacote(precoDoPacote);
        ID = count++;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "listaDeCidades=" + listaDeCidades + '\n' +
                ", nomeDoPacote=" + nomeDoPacote + '\n' +
                ", precoDoPacote=" + precoDoPacote + '\n' +
                ", ID=" + ID + '\n' +
                '}';
    }
}
