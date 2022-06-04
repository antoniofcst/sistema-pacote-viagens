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
        super(nome, sobrenome, cpf, sexo);
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
}
