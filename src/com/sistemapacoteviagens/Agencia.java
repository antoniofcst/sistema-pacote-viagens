package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nome_Agencia;
    private String cnpj_Agencia;
    private String local_Agencia;
    private String tipo_de_servico;
    private Financeiro financeiro;
    private PacotesDeViagens PacotesDeViagens;
    private Cliente cliente;

    //ArrayList para adicionar os pacotes
    ArrayList<PacotesDeViagens> Tipo_de_Servico = new ArrayList<>();
        Tipo_de_Servico.add(PacotesDeViagens);
}
