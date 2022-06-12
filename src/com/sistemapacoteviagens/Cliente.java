package src.com.sistemapacoteviagens;

import src.com.sistemapacoteviagens.Pessoa;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private int telefone;
    private String email;
    private String endereco;
    private ArrayList<Pacote> pacoteDoCliente = new ArrayList<>();

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        super(nome, sobrenome, cpf, sexo);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }


}
