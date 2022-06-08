package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Financeiro financeiroAgencia = new Financeiro();
        financeiroAgencia.choosePayment("PIX");

        System.out.println(financeiroAgencia.formaDePagamento);
    }
}
