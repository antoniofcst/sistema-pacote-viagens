package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nomeAgencia;
    private String cnpjAgencia;
    private String localDaAgencia;
    private Financeiro financeiro = new Financeiro();
    private ArrayList<Double> saldoAgencia = new ArrayList<Double>();
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

    public ArrayList<Double> getSaldoAgencia() {
        return saldoAgencia;
    }

    public void setSaldoAgencia(double precoDoPacote) {
        this.saldoAgencia.add(precoDoPacote);
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
    public void ComprarPacote(Pacote pacote, Cliente cliente, String FormaDePagamento) {
        cliente.getPacoteDoCliente().add(pacote);
        getFinanceiro().choosePayment(FormaDePagamento);
        setSaldoAgencia(pacote.getPrecoDoPacote());
        System.out.println(cliente.getNome() + ", seu pacote foi comprado!");
    }

    @Override
    public void alterarPacote(Pacote pacoteComprado, Pacote pacoteParaAlterar, Cliente cliente) {
        cliente.getPacoteDoCliente().remove(pacoteComprado);
        cliente.getPacoteDoCliente().add(pacoteParaAlterar);
        getSaldoAgencia().remove(pacoteComprado.getPrecoDoPacote());
        setSaldoAgencia(pacoteParaAlterar.getPrecoDoPacote());
        System.out.println(cliente.getNome() + ", seu pacote foi alterado!");
    }

    @Override
    public void excluirPacote(Pacote pacote, Cliente cliente) {
        cliente.getPacoteDoCliente().remove(pacote);
        getSaldoAgencia().remove(pacote.getPrecoDoPacote());
        System.out.println(cliente.getNome() + ", seu pacote foi excluído.");
    }

    @Override
    public void consultarPacote(Cliente cliente) {

    }
}
