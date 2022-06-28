package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class CidadeController {
    private ArrayList<Cidade> cidades = new ArrayList<>();
    private ArrayList<String> atracoes = new ArrayList<>();
    private String Atracao;

    public String getAtracao() { return this.Atracao; }
    public void setAtracao(String Atracao) { this.Atracao = Atracao; }
    public void salvar(Cidade cidade){
        cidades.add(cidade);
    }
    public void excluir(String nome){
        for (int i = 0; i < cidades.size(); i++){
            if (cidades.get(i).getNomeDaCidade() == nome){
                cidades.remove(i);
            }
        }
    }
    public void salvaratc(String atracao){
        atracoes.add(atracao);
    }
    public void excluiratc(String atracao){
        for (int i = 0; i < cidades.size(); i++){
            if (atracoes.get(i).getAtracoes() == atracao){
                atracoes.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        return "CidadeController{" +
                "cidade=" + cidades +
                "atrções=" + atracoes +
                '}' + '\n';
    }
}
