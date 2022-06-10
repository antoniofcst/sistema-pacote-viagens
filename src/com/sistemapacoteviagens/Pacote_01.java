package src.com.sistemapacoteviagens;

public class Pacote_01 extends PacotesDeViagens{
    private double preco;
    private String nome;

    public Pacote_01 (String nome, double preco) {
        this.setNome(nome);
        this.setPreco(preco);
    }

    public double getPreco() { return this.preco; }
    public void setPreco(double p) { this.preco = p; }
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }
}
