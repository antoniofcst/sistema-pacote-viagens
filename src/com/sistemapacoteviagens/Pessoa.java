package src.com.sistemapacoteviagens;

import java.time.LocalDate;
import java.time.Period;

abstract class Pessoa {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String sexo;
    private String DataDeNascimento;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() { return this.sobrenome; }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public Pessoa(String nome, String sobrenome, String cpf, String sexo) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCpf(cpf);
        setSexo(sexo);
    };

    private void birthdaySet(int ano, int mes, int dia) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(ano, mes, dia);
        Period period = Period.between(birthday, today);
        this.DataDeNascimento = period.getDays() + "/" + period.getMonths() + "/" + period.getYears();
    }


}
