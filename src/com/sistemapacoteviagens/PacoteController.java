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

    private ArrayList<String> nomesDoPacotes = new ArrayList<>();

    public void comprarpacote(String nomeDoPacote, String nomeDoCliente, String precoDoPack){ nomesDoPacotes.add(nomeDoPacote); id = count++; }
    public void clientexcpack(int id){
        for (int i = 0; i < nomesDoPacotes.size(); i++){
            if (nomesDoPacotes.get(i).getId() == id){
                nomesDoPacotes.remove(i);
            }
        }
    }
    public void clientprintpack(){ System.out.println(nomesDoPacotes); }
    @Override
    public String toString() {
        return "PacoteController{" +
                "pacotes:" + nomesDoPacotes + '\n' +
                "clientename:" + nomeDoCliente + '\n' +
                "preço:" + precoDoPack + '\n' +
                "id:" + id + '\n' +
                '}';
    }
}
