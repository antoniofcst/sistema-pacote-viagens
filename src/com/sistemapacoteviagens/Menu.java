package src.com.sistemapacoteviagens;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public String opcao;
    public Cliente cliente;
    public Agencia agencia;

    public void MenuPrincipal(){
        //ClienteController cc = new ClienteController();
        AgenciaController ag = new AgenciaController();
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
                    ag.savecltag(c);
                    break;
                /*case "2":
                    System.out.println("Nome:");
                    String nomeag = scan.next();
                    System.out.println("CNPJ:" );
                    String cnpjag = scan.next();
                    System.out.println("Local:");
                    String localag = scan.next();
                    ArrayList<Cliente> cliente = new ArrayList<>();
                    Financeiro FinanceirodaAgenciaNova = new Financeiro();
                    Pacote PacotedaAgencianova = new Pacote();
                    Agencia a = new Agencia(nomeag, cnpjag, localag, cliente ,FinanceirodaAgenciaNova, PacotedaAgencianova);
                    ag.salvar(a);
                    break;
                case "3":
                    Submenu_modo_cliente();
                    break;*/
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
    public void Submenu_modo_cliente(){
        AgenciaController ag = new AgenciaController();
        PacoteController pack = new PacoteController();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("+====================================================================+");
            System.out.println("                  !!!Navegação em modo cliente!!!                     ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Listar agencias de viagens");
            System.out.println("(2) Escolha seu pacote de viagens");
            System.out.println("(3) Excluir pacote");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    ag.printag();
                    break;
                /*case "2":
                    ag.printpack();
                    pack.clientsavepack();
                    break;
                case "3":
                    pack.clientprintpack();
                    pack.clientexcpack();
                    break;
                case "v":
                    MenuPrincipal();
                    break;*/
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }

    public void Submenu_modo_empresa(){
        AgenciaController ag = new AgenciaController();
        PacoteController pack = new PacoteController();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("+====================================================================+");
            System.out.println("                !!!Navegação em modo empresa!!!                       ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Criar pacotes");
            System.out.println("(2) Excluir pacotes");
            System.out.println("(v) voltar");
            System.out.println("(0) sair");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    System.out.println("Nome do Pacote:");
                    String nomePack = scan.next();
                    ArrayList<Cidade> listaDeCidades = new ArrayList<>();
                    System.out.println("Preço do Pacote:");
                    Double precoPack = scan.nextDouble();
                    //Cidade cidade = new Cidade();
                    Pacote pac = new Pacote(nomePack, listaDeCidades, precoPack);
                    ag.savepackag(pac);
                    break;
                case "2":
                    ag.printpack();
                    int id = scan.nextInt();
                    ag.excpackag(id);
                    break;
                case "v":
                    MenuPrincipal();
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "v") {
                        System.out.println("Opção inválida!");
                    }
            }
        }while (opcao != "0");
    }
}


