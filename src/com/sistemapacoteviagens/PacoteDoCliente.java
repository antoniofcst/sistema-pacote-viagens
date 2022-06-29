package src.com.sistemapacoteviagens;

public class PacoteDoCliente {
    private String clientenomepack;
    private String nomeDoCliente;
    private String precoDoPack;
    public PacoteDoCliente(String clientenomepack, String nomeDoCliente, String precoDoPack){
        setClientenomepack(clientenomepack);
        setNomeDoCliente(nomeDoCliente);
        setPrecoDoPack(precoDoPack);
    }

    public String getClientenomepack() { return clientenomepack; }
    public void setClientenomepack(String clientenomepack) { this.clientenomepack = clientenomepack; }
    public String getNomeDoCliente() { return nomeDoCliente; }
    public void setNomeDoCliente(String nomeDoCliente) { this.nomeDoCliente = nomeDoCliente; }
    public String getPrecoDoPack() { return precoDoPack; }
    public void setPrecoDoPack(String precoDoPack) { this.precoDoPack = precoDoPack; }

    public String toString() {
        return "PacoteController{" +
                "pacotes:" + clientenomepack + '\n' +
                "clientename:" + nomeDoCliente + '\n' +
                "preço:" + precoDoPack + '\n' +
                '}';
    }
}
