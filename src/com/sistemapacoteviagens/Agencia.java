package src.com.sistemapacoteviagens;

public class Agencia implements AgenciaInterface{
    private String nome_Agencia;
    private String cnpj_Agencia;
    private String local_Agencia;
    private String tipo_de_servico;
    private String servico_da_agencia;
    private Financeiro financeiro;
    private PacotesDeViagens PacotesDeViagens;
    private Cliente cliente;
}
