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

    public ArrayList<Pacote> getPacoteDoCliente() {
        return this.pacoteDoCliente;
    }

    public void setPacoteDoCliente(ArrayList<Pacote> pacoteDoCliente) {
        this.pacoteDoCliente = pacoteDoCliente;
    }

    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        super(nome, sobrenome, cpf, sexo);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome:" + getNome() +'\''+
                ", sobrenome:" + getSobrenome() +'\''+
                ", CPF:" + getCpf() +'\''+
                ", Sexo:" + getSexo() +'\''+
                ", endereco:" + getEndereco() +'\''+
                ", telefone:" + telefone +
                ", email:'" + email + '\'' +
                ", endereco:'" + endereco + '\'' +
                ", pacoteDoCliente:" + pacoteDoCliente +
                '}';
    }
}
