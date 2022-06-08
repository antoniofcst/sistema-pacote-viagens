package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Cidade {
    private String nomeDaCidade;
    private String estadoDaCidade;
    private String paisDaCidade;

    private ArrayList<String> atracoes = new ArrayList<>();

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getEstadoDaCidade() {
        return estadoDaCidade;
    }

    public void setEstadoDaCidade(String estadoDaCidade) {
        this.estadoDaCidade = estadoDaCidade;
    }

    public String getPaisDaCidade() {
        return paisDaCidade;
    }

    public void setPaisDaCidade(String paisDaCidade) {
        this.paisDaCidade = paisDaCidade;
    }
    public ArrayList<String> getAtracoes() {
        return atracoes;
    }

    private void setAtracoes(ArrayList<String> atracoes) {
        this.atracoes.addAll(atracoes);
    }
    public Cidade(String nomeDaCidade, String estadoDaCidade, String paisDaCidade, ArrayList<String> atracoes) {
        setNomeDaCidade(nomeDaCidade);
        setEstadoDaCidade(estadoDaCidade);
        setPaisDaCidade(paisDaCidade);
        setAtracoes(atracoes);
    }

}
