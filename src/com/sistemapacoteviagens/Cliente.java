package src.com.sistemapacoteviagens;

import src.com.sistemapacoteviagens.Pessoa;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private int telefone;
    private String email;

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Agencia getConfigurarServicos() {
        return configurarServicos;
    }

    public void setConfigurarServicos(Agencia configurarServicos) {
        this.configurarServicos = configurarServicos;
    }

    private String endereco;
    private Agencia configurarServicos;
    private ArrayList<Pacote> pacoteDoCliente = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        super(nome, sobrenome, cpf, sexo);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereco(endereco);
    }


}
