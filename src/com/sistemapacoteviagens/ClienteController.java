package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class ClienteController {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }
    public void excluir(String cpf){
        for (int i = 0; i < clientes.size(); i++){
            if (clientes.get(i).getCpf() == cpf){
                clientes.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "ClienteController{" +
                "clientes=" + clientes +
                '}' + '\n';
    }
}
