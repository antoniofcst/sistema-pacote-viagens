package src.com.sistemapacoteviagens;

public class PacoteDoCliente {
    private String clientenomepack;
    private String nomeDoCliente;
    private String precoDoPack;

    private int id;
    private static int count = 1;
    public PacoteDoCliente(String clientenomepack, String nomeDoCliente, String precoDoPack){
        setClientenomepack(clientenomepack);
        setNomeDoCliente(nomeDoCliente);
        setPrecoDoPack(precoDoPack);
        id = count++;
    }

    public String getClientenomepack() { return clientenomepack; }
    public void setClientenomepack(String clientenomepack) { this.clientenomepack = clientenomepack; }
    public String getNomeDoCliente() { return nomeDoCliente; }
    public void setNomeDoCliente(String nomeDoCliente) { this.nomeDoCliente = nomeDoCliente; }
    public String getPrecoDoPack() { return precoDoPack; }
    public void setPrecoDoPack(String precoDoPack) { this.precoDoPack = precoDoPack; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String toString() {
        return "PacoteController{" +
                "pacotes:" + clientenomepack + '\n' +
                "clientename:" + nomeDoCliente + '\n' +
                "preço:" + precoDoPack + '\n' +
                "ID:" + id + '\n' +
                '}';
    }
}
