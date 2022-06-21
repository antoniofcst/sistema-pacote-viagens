package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class ClienteController {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }


}
