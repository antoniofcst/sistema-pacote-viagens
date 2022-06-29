package src.com.sistemapacoteviagens;

import src.com.sistemapacoteviagens.Pessoa;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private String telefone;
    private String email;
    private String endereco;
    private ArrayList<Pacote> pacoteDoCliente = new ArrayList<>();

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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

    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, String telefone, String email) {
        super(nome, sobrenome, cpf, sexo);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nome:" + getNome() +'\n'+
                "sobrenome:" + getSobrenome() +'\n'+
                "CPF:" + getCpf() +'\n'+
                "Sexo:" + getSexo() +'\n'+
                "endereco:" + getEndereco() +'\n'+
                "telefone:" + telefone + '\n' +
                "email:'" + email + '\n' +
                "endereco:'" + endereco + '\n' +
                "pacoteDoCliente:" + pacoteDoCliente + '\n' +
                '}';
    }
}
