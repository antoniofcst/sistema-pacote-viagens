package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nomeAgencia;
    private String cnpjAgencia;
    private String localDaAgencia;
    private Financeiro financeiro = new Financeiro();
    private Pacote pacote;
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


    public Financeiro getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(Financeiro financeiro) {
        this.financeiro = financeiro;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia(String nomeAgencia, String cnpjAgencia, String localDaAgencia, Cliente cliente, Financeiro financeiro, Pacote pacote) {
        setNomeAgencia(nomeAgencia);
        setCnpjAgencia(cnpjAgencia);
        setLocalDaAgencia(localDaAgencia);
        setFinanceiro(financeiro);
        setPacote(pacote);
        setCliente(cliente);
    }

    @Override
    public void ComprarPacote(Pacote pacote, Cliente cliente) {

    }

    @Override
    public void alterarPacote(Pacote pacote, Cliente cliente) {

    }

    @Override
    public void excluirPacote(Cliente cliente) {

    }

    @Override
    public void consultarPacote(Cliente cliente) {

    }
}
