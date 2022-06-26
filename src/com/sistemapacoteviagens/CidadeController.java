package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class CidadeController {
    private ArrayList<Cidade> cidades = new ArrayList<>();
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
    @Override
    public String toString() {
        return "CidadeController{" +
                "cidade=" + cidades +
                '}' + '\n';
    }
}
