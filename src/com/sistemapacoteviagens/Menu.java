package src.com.sistemapacoteviagens;

import java.util.Scanner;

public class Menu {
    public String opcao;

    public void Menu1(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Bem vindo!");
            System.out.println("Para nevegar no menu basta digitar o numero que corresponde à escolha!");
            System.out.println("(1) Cadastrar um novo cliente");
            System.out.println("(2) Cadastrar uma nova agência");
            System.out.println("(p) próximo");
            System.out.println("(0) sair");
            opcao = scan.nextInt();
            switch (opcao){
                case "1":
                public Cliente(); //Chamar o método ou o construtor do cliente
                    break;
                case "2":
                public Agencia(); //Chamar o método ou o construtor da agência
                    break;
                case "3":
                    Menu2();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 0);

    }
    public void Menu2(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu cliente");
            System.out.println("(1) vizualizar pacotes disponíveis");
            System.out.println("(2) comprar pacotes");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            opcao = scan.nextInt();
        }while (opcao != 0);
    }
}


