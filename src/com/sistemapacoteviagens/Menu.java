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
            switch (opcao){
                case "1":
                    Submenu_cadastrar_cliente();
                    break;
                case "2":
                    Submenmu_cadastrar_empresa();
                    break;
                case "3":
                    Menu2();
                    break;
                default:
                System.out.println("Opção inválida!");
                }
        }while (opcao != "0");

    }
    public void Submenu_cadastrar_cliente(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu cliente!");
            System.out.println("Nome:"); System.out.println("Sobrenome:");
            System.out.println("CPF:");
            System.out.println("Sexo:");
            System.out.println("Endereço:");
            System.out.println("Telefone:");
            System.out.println("E-mail:");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "v":
                    Menu1();
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        }while (opcao != "0");
    }
    public void Submenmu_cadastrar_empresa(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu empresa!");
            System.out.println("Nome:");
            System.out.println("CPJ:");
            System.out.println("Local:");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "v":
                    Menu1();
                    break;
                default:
                System.out.println("Opção inválida!");
            }
        }while (opcao != "0");
    }
    public void Menu2(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Escolha o seu modo de navegação!");
            System.out.println("(1) Acessar como cliente");
            System.out.println("(2) Acessar como uma empresa");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "1":
                    Submenmu_modo_cliente();
                    break;
                case "2":
                    Submenmu_cadastrar_empresa();
                    break;
                case "v":
                    Menu1();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != "0");
    }
    public void Submenmu_modo_cliente(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Navegação em modo cliente!");
            System.out.println("(1) Escolha sua agencia de viagens");
            System.out.println("");
            System.out.println("Local:");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "1":
                    Menu1();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != "0");
    }
}


