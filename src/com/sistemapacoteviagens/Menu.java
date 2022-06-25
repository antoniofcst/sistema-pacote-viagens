package src.com.sistemapacoteviagens;

import java.util.Scanner;

public class Menu {
    public String opcao;
    public Cliente cliente;
    public Agencia agencia;

    public void Menu1(){
        ClienteController cc = new ClienteController();
        AgenciaController ag = new AgenciaController();
        String opcao;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("+====================================================================+");
            System.out.println("                       !!!Bem vindo!!!                                ");
            System.out.println("Para navegar no menu basta digitar o número que corresponde à escolha!");
            System.out.println("+====================================================================+");
            System.out.println("(1) Cadastrar um novo cliente");
            System.out.println("(2) Cadastrar uma nova agência");
            System.out.println("(3) Acessar como cliente");
            System.out.println("(4) Acessar como uma empresa");
            System.out.println("(0) sair");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    System.out.println("Nome:");
                    String nome = scan.next();
                    System.out.println("Sobrenome:");
                    String sobrenome = scan.next();
                    System.out.println("CPF:");
                    String cpf = scan.next();
                    System.out.println("Sexo:");
                    String sexo =  scan.next();
                    System.out.println("Endereço");
                    String endereco = scan.next();
                    System.out.println("telefone:");
                    String telefone = scan.next();
                    System.out.println("email:" );
                    String email = scan.next();
                    Cliente c = new Cliente(nome, sobrenome, cpf, sexo, endereco, telefone, email);
                    cc.salvar(c);
                    break;
                case "2":
                    System.out.println("Nome:");
                    String nomeag = scan.next();
                    System.out.println("CNPJ:" );
                    String cnpjag = scan.next();
                    System.out.println("Local:");
                    String localag = scan.next();
                    Financeiro FinanceirodaAgenciaNova = new Financeiro();
                    Pacote PacotedaAgencianova = new Pacote();
                    // menu de pácote
                    Agencia a = new Agencia(nomeag, cnpjag, localag, c, FinanceirodaAgenciaNova, PacotedaAgencianova); // metodo para alocar cliente na agencia
                    ag.salvar(a);
                    break;
                case "3":
                    Submenu_modo_cliente();
                    break;
                case "4":
                    Submenu_modo_empresa();
                    break;
                default:
                    if (opcao == "0") {
                        break;
                    }
                    System.out.println("Opcao invalida");
            }
        }while (opcao != "0");
    }
    /*public void Menu2(){
        //Scanner scan = new Scanner(System.in);
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
    }*/
    public void Submenu_modo_cliente(){
        String opcao;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("+====================================================================+");
            System.out.println("                  !!!Navegação em modo cliente!!!                     ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Listar agencias de viagens");
            System.out.println("(2) Escolha seu pacote de viagens");
            System.out.println("(0) sair");
            opcao = scan.next();
            switch (opcao){
                case "1":

                    break;
                case "2":

                default:
                    if (opcao != "0" && opcao != "1" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }

    public void Submenu_modo_empresa(){
        //Scanner scan = new Scanner(System.in);
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


