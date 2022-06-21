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
                case "p":
                    Menu2();
                    break;
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "2" && opcao != "p") {
                        System.out.println("Opção inválida!");
                    }
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
                    if (opcao != "0" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
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
                    if (opcao != "0" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
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
                    Submenmu_modo_empresa();
                    break;
                case "v":
                    Menu1();
                    break;
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "2" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }
    public void Submenmu_modo_cliente(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Navegação em modo cliente!");
            System.out.println("(1) Escolha sua agencia de viagens");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "1":
                    Submenu_nav_modcliente();
                    break;
                case "v":
                    Menu2();
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }
    public void Submenu_nav_modcliente(){
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("As agencias disponiveis são essas:");

            System.out.println("Digite aqui o nome da agencia escolhida:");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "1":

                    break;
                case "2":

                    break;
                case "v":
                    Submenmu_modo_cliente();
                    break;
                default:
                    if (opcao != "0" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }
    public void Submenmu_modo_empresa(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Navegação em empresa!");
            System.out.println("(1) Criar pacotes");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            switch (opcao){
                case "1":

                    break;
                case "v":
                    Menu2();
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }
}


