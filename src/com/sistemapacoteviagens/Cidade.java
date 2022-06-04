package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class Cidade {
    private String nomeDaCidade;
    private String estadoDaCidade;
    private String paisDaCidade;
    private ArrayList<String> atracoes = new ArrayList<>();
    public Cidade(String nomeDaCidade, String estadoDaCidade, String paisDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
        this.estadoDaCidade = estadoDaCidade;
        this.paisDaCidade = paisDaCidade;
    }
}
