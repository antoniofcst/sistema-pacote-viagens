package src.com.sistemapacoteviagens;

import java.util.ArrayList;

public class PacoteController {

    private String nomeDoCliente;
    String clientenomepack;
    String precoDoPack;
    private ArrayList<String> nomesDoPacotes = new ArrayList<>();
    public String getClientenomepack() { return clientenomepack; }
    public void setClientenomepack(String clientenomepack) { this.clientenomepack = clientenomepack; }

    public void comprarpacote(String nomeDoPacote, String nomeDoCliente, String precoDoPack){ nomesDoPacotes.add(nomeDoPacote); }
    /*public void clientexcpack(String nomeDoPacote){
        for (int i = 0; i < nomesDoPacotes.size(); i++){
            if (nomesDoPacotes.get(i).getClientenomepack() == nomeDoPacote){
                nomesDoPacotes.remove(i);
            }
        }
    }*/
    public void clientprintpack(){ System.out.println(nomesDoPacotes); }
    @Override
    public String toString() {
        return "PacoteController{" +
                "pacotes:" + nomesDoPacotes + '\n' +
                "clientename:" + nomeDoCliente + '\n' +
                "preço:" + precoDoPack + '\n' +
                '}';
    }
}
