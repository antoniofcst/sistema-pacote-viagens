package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class PacoteController {
    private ArrayList<Pacote> pacotes = new ArrayList<>();
    public void salvar(Pacote pacote){
        pacotes.add(pacote);
    }
    public void excluir(Double preco){
        for (int i = 0; i < pacotes.size(); i++){
            if (pacotes.get(i).getPrecoDoPacote() == preco){
                pacotes.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        return "PacoteController{" +
                "pacotes=" + pacotes +
                '}';
    }
}
