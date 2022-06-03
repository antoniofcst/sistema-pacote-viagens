package src;

import java.time.LocalDate;
import java.time.Period;

abstract class Pessoa {
    private String nome;
    private String cpf;
    private String sexo;
    private String endereco;
    private String DataDeNascimento;


private String setBirthday(int ano, int mes, int dia) {
    LocalDate today = LocalDate.now();
    LocalDate birthday = LocalDate.of(ano, mes, dia);
    Period period = Period.between(birthday, today);
    this.DataDeNascimento = period.getDays() + "/" + period.getMonths() + "/" + period.getYears();
}




}
