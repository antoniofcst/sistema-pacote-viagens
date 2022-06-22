package src.com.sistemapacoteviagens;

import java.util.ArrayList;

 public class AgenciaController {
    private ArrayList<Agencia> agencias = new ArrayList<>();
    public void salvar(Agencia agencia){
        agencias.add(agencia);
    }

    public void excluir(String cnpj){
        for (int i = 0; i < agencias.size(); i++){
            if (agencias.get(i).getCnpjAgencia() == cnpj){
                agencias.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "AgenciaController{" +
                "agencias=" + agencias +
                '}';
    }
}
