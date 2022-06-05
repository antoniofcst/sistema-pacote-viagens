package src.com.sistemapacoteviagens;

import com.sun.xml.internal.fastinfoset.algorithm.DoubleEncodingAlgorithm;

public class Financeiro {
    private String FormaDePagamento;

    public Financeiro (String fmp){
        this.FormaDePagamento = fmp;
    }
    public String getFormaDePagamento() { return this.FormaDePagamento; }
    public void setFormaDePagamento(String fp) { this.FormaDePagamento = fp; }
     public void forma_de_pagamento(int opcao) {
            switch (opcao) {
            case 1: setFormaDePagamento("PIX"); break;
            case 2: setFormaDePagamento("Cartão-Débito"); break;
            case 3: setFormaDePagamento("Cartão-Crédito"); break;
            case 4: setFormaDePagamento("Em espécie"); break;
            default: System.out.println("Opção desconhecida, por favor selecionar uma opção válida!!!");
        }
    }
    public void imprima_forma_de_pagamento(){
        System.out.println("Escolha uma opção:");
        System.out.println("Para pix digite: 1 ");
        System.out.println("Para cartão-débito digite: 2");
        System.out.println("Para cartão-crédito digite: 3");
        System.out.println("Para dinheiro em espécie digite: 4");
    }
}
