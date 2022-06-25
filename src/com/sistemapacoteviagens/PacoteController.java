package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class PacoteController {
    private ArrayList<Pacote> pacotes = new ArrayList<>();
    public void salvar(Pacote pacote){
        pacotes.add(pacote);
    }
    public void excluir(Pacote pacote){
        for (int i = 0; i < pacotes.size(); i++){
            if (pacotes.get(i) == pacote){
                pacotes.remove(i);
            }
        }
    }
}
