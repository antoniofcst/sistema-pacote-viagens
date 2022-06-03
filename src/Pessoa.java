package src;

import java.time.LocalDate;
import java.time.Period;

class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String DataDeNascimento;
    private int telefone;
    private String email;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

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

    public Pessoa(String nome, String sobrenome, String cpf, String sexo, String endereco, int telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    };


    private void birthdaySet(int ano, int mes, int dia) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(ano, mes, dia);
        Period period = Period.between(birthday, today);
        this.DataDeNascimento = period.getDays() + "/" + period.getMonths() + "/" + period.getYears();
    }


}
