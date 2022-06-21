package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cliente marcio = new Cliente("ja", "co", "0479034334","maculino", "ali", 2, "half@gmail.com");
        //Pacote pacote = new Pacote();
        //Agencia agenciaCeara = new Agencia("");
        //System.out.println(marcio);

        String opcao;
        String nome;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("+====================================================================+");
            System.out.println("                       !!!Bem vindo!!!                                ");
            System.out.println("Para nevegar no menu basta digitar o numero que corresponde à escolha!");
            System.out.println("+====================================================================+");
            System.out.println("(1) Cadastrar um novo cliente");
            System.out.println("(2) Cadastrar uma nova agência");
            System.out.println("(3) Acessar como cliente");
            System.out.println("(4) Acessar como uma empresa");

            System.out.println("(0) sair");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    System.out.println("Nome:"); nome = scan.next(); if (!nome.isEmpty()){ System.out.println("Sobrenome:" ); }
                    System.out.println("CPF:" );
                    System.out.println("Sexo:" );
                    System.out.println("Endereço:");
                    System.out.println("Telefone:" );
                    System.out.println("E-mail:" );
                    break;
                case "2":

                    break;
                case "3":

                    break;
                default:
                    if (opcao == "0") {
                        if (System.getProperty("os.name").contains("Windows")) {
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        }
                        else {
                            Runtime.getRuntime().exec("clear");
                        }
                    }
            }
        }while (opcao != "0");

    }
}


