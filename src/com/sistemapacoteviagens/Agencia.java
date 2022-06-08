package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nomeAgencia;
    private String cnpjAgencia;
    private String localDaAgencia;
    private ArrayList<Pacote> tipoDeServicoOfertado = new ArrayList<>();
    private Financeiro financeiro;
    private Pacote PacoteDeViagem;
    private Cliente cliente;


}
