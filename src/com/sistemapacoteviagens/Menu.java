package src.com.sistemapacoteviagens;

//import java.util.Scanner; talvez nao seja necessario, deixar ai por enquanto

public class Menu {
    public String opcao;
    public Cliente cliente;
    public Agencia agencia;

    public void Menu1(){
        //Scanner scan = new Scanner(System.in);
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
        //Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu cliente!");
            System.out.println("Nome:" + this.cliente.setNome()); System.out.println("Sobrenome:" + this.cliente.setSobrenome());
            System.out.println("CPF:" + this.cliente.setCpf());
            System.out.println("Sexo:" + this.cliente.setSexo());
            System.out.println("Endereço:" + this.cliente.setEndereco());
            System.out.println("Telefone:" + this.cliente.getTelefone());
            System.out.println("E-mail:" + this.cliente.setEmail());
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
        //Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Menu empresa!");
            System.out.println("Nome:" + this.agencia.setNomeAgencia());
            System.out.println("CPJ:" + this.agencia.setCnpjAgencia());
            System.out.println("Local:" + this.agencia.setLocalDaAgencia());
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
    }
    public void Submenmu_modo_cliente(){
        //Scanner scan = new Scanner(System.in);
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
        //Scanner scan = new Scanner(System.in);
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


