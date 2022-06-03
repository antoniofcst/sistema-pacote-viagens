package src;

public class Cliente extends Pessoa {
    private Agencia configurarServicos;
    public Cliente(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        super(nome, sobrenome, cpf, sexo, endereco, telefone, email);
    }
}
