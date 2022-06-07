package src.com.sistemapacoteviagens;

public class Pacote_01 extends PacotesDeViagens{
    private double preco;

    public Pacote_01 (double preco) {
        this.setPreco(preco);
    }

    public double getPreco() { return this.preco; }
    public void setPreco(double p) { this.preco = p; }
}
