package src.com.sistemapacoteviagens;

public interface AgenciaInterface {
    abstract public void ComprarPacote();
    abstract public void alterarPacote();
    abstract public void excluirPacote();
    abstract public void consultarPacote();

    void ComprarPacote(Pacote pacote, Cliente cliente, String FormaDePagamento);

    void alterarPacote(Pacote pacote, Cliente cliente);

    void excluirPacote(Cliente cliente);

    void alterarPacote(Pacote pacoteComprado, Pacote pacoteParaAlterar, Cliente cliente);

    void excluirPacote(Pacote pacote, Cliente cliente);

    void consultarPacote(Cliente cliente);
}
