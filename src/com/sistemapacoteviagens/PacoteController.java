package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class PacoteController {

    private String clientenomepack;
    private String nomeDoCliente;
    private String precoDoPack;
    private int id;
    private static int count = 1;

    public String getClientenomepack() { return clientenomepack; }
    public void setClientenomepack(String clientenomepack) { this.clientenomepack = clientenomepack; }
    public String getNomeDoCliente() { return nomeDoCliente; }
    public void setNomeDoCliente(String nomeDoCliente) { this.nomeDoCliente = nomeDoCliente; }
    public String getPrecoDoPack() { return precoDoPack; }
    public void setPrecoDoPack(String precoDoPack) { this.precoDoPack = precoDoPack; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    private ArrayList<PacoteDoCliente> pacoteDoClientes = new ArrayList<>();

    public void comprarpacote(PacoteDoCliente pacoteDoCliente){ pacoteDoClientes.add(pacoteDoCliente); }
    public void clientexcpack(String clientenomepack){
        for (int i = 0; i < pacoteDoClientes.size(); i++){
            if (pacoteDoClientes.get(i).getClientenomepack() == clientenomepack ){
                pacoteDoClientes.remove(i);
            }
        }
    }
    public void clientprintpack(){ System.out.println(pacoteDoClientes); }
    @Override
    public String toString() {
        return "PacoteController{" +
                "pacotes:" + pacoteDoClientes + '\n' +
                "clientename:" + nomeDoCliente + '\n' +
                "preço:" + precoDoPack + '\n' +
                '}';
    }
}
