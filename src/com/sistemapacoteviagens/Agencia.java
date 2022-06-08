package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nomeAgencia;
    private String cnpjAgencia;
    private String localDaAgencia;
    private ArrayList<Pacote> pacoteOfertado = new ArrayList<>();
    private Financeiro financeiro;
    private Pacote pacotesDeViagem;
    private Cliente cliente;

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getCnpjAgencia() {
        return cnpjAgencia;
    }

    public void setCnpjAgencia(String cnpjAgencia) {
        this.cnpjAgencia = cnpjAgencia;
    }

    public String getLocalDaAgencia() {
        return localDaAgencia;
    }

    public void setLocalDaAgencia(String localDaAgencia) {
        this.localDaAgencia = localDaAgencia;
    }

    public ArrayList<Pacote> getPacoteOfertado() {
        return pacoteOfertado;
    }

    public void setPacoteOfertado(ArrayList<Pacote> pacoteOfertado) {
        this.pacoteOfertado = pacoteOfertado;
    }

    public Agencia(String nomeAgencia, String cnpjAgencia, String localDaAgencia, ArrayList<Pacote> pacoteOfertado) {
        setNomeAgencia(nomeAgencia);
        setCnpjAgencia(cnpjAgencia);
        setLocalDaAgencia(localDaAgencia);
        setPacoteOfertado(pacoteOfertado);
    }
    // posso criar um cliente na hora que o cliente escolher um pacote? tipo vou só atribuir a variavel cliente com um cliente quando algum cliente comprar
    // ao inves de atribuir logo no construtor
    @Override
    public void escolhaDeServico() {

    }

    @Override
    public void adicionarPacote() {

    }

    @Override
    public void alterarPacote() {

    }

    @Override
    public void excluirPacote() {

    }

    @Override
    public void consultarPacote() {

    }
}
