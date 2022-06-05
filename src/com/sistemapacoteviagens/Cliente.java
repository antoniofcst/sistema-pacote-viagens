package src.com.sistemapacoteviagens;

import src.com.sistemapacoteviagens.Pessoa;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private int telefone;
    private String email;
    private String endereco;
    private Agencia configurarServicos;
    private ArrayList<PacotesDeViagens> pacoteDoCliente = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        super(setNome(nome), sobrenome, cpf, sexo);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereco(endereco);
    }

    public int getTelefone() {
        return this.telefone;
    }
    public void setTelefone(int tel) {
        this.telefone = tel;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endc) {
        this.endereco = endc;
    }
}
