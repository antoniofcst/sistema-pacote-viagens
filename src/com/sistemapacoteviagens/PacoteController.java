package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class PacoteController {
    private ArrayList<Pacote> pacotes = new ArrayList<>();
    private ArrayList<Cidade> cidades = new ArrayList<>();
    public void clientsavepack(Pacote pacote){
        pacotes.add(pacote);
    }
    public void clientexcpack(String nomeDoPacote){
        for (int i = 0; i < pacotes.size(); i++){
            if (pacotes.get(i).getNomeDoPacote() == nomeDoPacote){
                pacotes.remove(i);
            }
        }
    }
    public void clientprintpack(){
        System.out.println(pacotes);
    }
    public void savecitlist(Cidade cidade){
        cidades.add(cidade);
    }
    public void excitlist(String nome){
        for (int i = 0; i < cidades.size(); i++){
            if (cidades.get(i).getNomeDaCidade() == nome){
                cidades.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        return "PacoteController{" +
                "pacotes=" + pacotes +
                "cidades=" + cidades +
                '}';
    }
}
