package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class CidadeController {
    private ArrayList<Cidade> cidades = new ArrayList<>();
    private ArrayList<String> atracoes = new ArrayList<>();
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
    public void salvaratc(String atracao){ atracoes.add(atracao); }

    @Override
    public String toString() {
        return "CidadeController{" +
                "cidade=" + cidades +
                "atrções=" + atracoes +
                '}' + '\n';
    }
}
