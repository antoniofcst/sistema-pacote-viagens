package src.com.sistemapacoteviagens;
import java.util.ArrayList;

public class Agencia implements AgenciaInterface{
    private String nomeAgencia;
    private String cnpjAgencia;
    private String localDaAgencia;
    private ArrayList<PacotesDeViagens> tipoDeServicoOfertado = new ArrayList<>();
    private Financeiro financeiro;
    private PacotesDeViagens PacotesDeViagens;
    private Cliente cliente;

    public Agencia (String nma, String cnpj , String lda){
        this.setNomeAgencia(nma);
        this.setCnpjAgencia(cnpj);
        this.setLocalDaAgencia(lda);
    }

    public String getNomeAgencia() {
        return this.nomeAgencia;
    }
    public void setNomeAgencia(String nma) {
        this.nomeAgencia = nma;
    }
    public String getCnpjAgencia() {
        return this.cnpjAgencia;
    }
    public void setCnpjAgencia(String cnpj) {
        this.cnpjAgencia = cnpj;
    }
    public String getLocalDaAgencia() {
        return this.localDaAgencia;
    }
    public void setLocalDaAgencia(String lda) {
        this.localDaAgencia = lda;
    }
}
