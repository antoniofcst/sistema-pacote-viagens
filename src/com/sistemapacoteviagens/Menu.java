package src.com.sistemapacoteviagens;

import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    public String opcao;
    AgenciaController ag = new AgenciaController();
    PacoteController pack = new PacoteController();
    public void MenuPrincipal(){
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
                case "2":
                    System.out.println("Nome:");
                    String nomeag = scan.next();
                    System.out.println("CNPJ:" );
                    String cnpjag = scan.next();
                    System.out.println("Local:");
                    String localag = scan.next();
                    Financeiro FinanceirodaAgenciaNova = new Financeiro();
                    Agencia a = new Agencia(nomeag, cnpjag, localag, FinanceirodaAgenciaNova);
                    ag.salvar(a);
                    break;
                case "3":
                    Submenu_modo_cliente();
                    break;
                case "4":
                    Submenu_modo_empresa();
                    break;
                default:
                    if (opcao == "0" && opcao != "1" && opcao != "2" && opcao != "3" && opcao != "4" && opcao != "v") {
                        break;
                    }
                    System.out.println("Opcao válida");
            }
        }while (opcao != "0");
    }
    public void Submenu_modo_cliente(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("+====================================================================+");
            System.out.println("                  !!!Navegação em modo cliente!!!                     ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Listar agencias de viagens");
            System.out.println("(2) Escolha seu pacote de viagens");
            System.out.println("(3) Alterar meu pacote");
            System.out.println("(4) Mostrar meus pacotes");
            System.out.println("(v) voltar");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    ag.printag();
                    break;
                case "2":
                    ag.printpack();
                    System.out.println("Digite aqui nome do pacote:");
                    String nomepack = scan.next();
                    System.out.println("Digite aqui o seu nome:");
                    String nomeDoCliente = scan.next();
                    System.out.println("Digite aqui o preço do pacote a ser comprado:");
                    String clienteprecopack = scan.next();
                    PacoteDoCliente pk = new PacoteDoCliente(nomepack, nomeDoCliente, clienteprecopack);
                    pack.comprarpacote(pk);
                    System.out.println("!!!PACOTE COMPRADO COM SUCESSO!!!");
                    break;
                case "3":
                    System.out.println("Nossos pacotes:");
                    ag.printpack();
                    System.out.println("Seu(s) pacote(s):");
                    pack.clientprintpack();
                    System.out.println("Voce realmente quer alterar seu pacote?");
                    System.out.println("Seu pacote antigo sera deletado!");
                    System.out.println("Caso a respota seja sim, digite sim!");
                    System.out.println("Caso não, digite não!");
                    String digito = scan.next();
                        if (digito.equals("Sim") || digito.equals("sim")) {
                            System.out.println("Altere aqui seu pacote!");
                            System.out.println("Digite aqui o ID do pacote a ser excluido:");
                            int id = scan.nextInt();
                            pack.clientexcpack(id);
                            System.out.println("Digite aqui nome do novo pacote:");
                            String nompack = scan.next();
                            System.out.println("Digite aqui o seu nome:");
                            String nomeDCliente = scan.next();
                            System.out.println("Digite aqui o preço do pacote a ser comprado:");
                            String clientprecopack = scan.next();
                            PacoteDoCliente pkc = new PacoteDoCliente(nompack, nomeDCliente, clientprecopack);
                            pack.comprarpacote(pkc);
                            System.out.println("!!!PACOTE ALTERADO COM SUCESSO!!!");
                        }
                        else {
                            System.out.println("Saindo.............");
                        }
                    break;
                case "4":
                    pack.clientprintpack();
                    break;
                case "v":
                    MenuPrincipal();
                    break;
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "2" && opcao != "3" && opcao != "v") {
                            break;
                    }
                    System.out.println("Opção válida!");
            }
        }while (opcao != "0");
    }

    public void Submenu_modo_empresa(){
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("+====================================================================+");
            System.out.println("                !!!Navegação em modo empresa!!!                       ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Criar pacotes");
            System.out.println("(2) Listar meus pacotes");
            System.out.println("(3) Excluir pacotes");
            System.out.println("(4) Listar meus clientes");
            System.out.println("(5) Excluir clientes");
            System.out.println("(v) voltar");
            opcao = scan.next();
            switch (opcao){
                case "1":
                    System.out.println("Nome do Pacote:");
                    String nomePack = scan.next();
                    System.out.println("Nome da cidade:");
                    String nomeDaCidade = scan.next();
                    System.out.println("Estado da cidade do pacote:");
                    String estadoDoPack = scan.next();
                    System.out.println("País da cidade do pacote:");
                    String paisDopack = scan.next();
                    Cidade cidade = new Cidade(nomeDaCidade, estadoDoPack, paisDopack);
                    cidade.cadastrarAtracoes();
                    System.out.println("Preço do Pacote:");
                    Double precoPack = scan.nextDouble();
                    Pacote pac = new Pacote(nomePack, cidade, precoPack);
                    ag.savepackag(pac);
                    break;
                case "2":
                    ag.printpack();
                    break;
                case "3":
                    ag.printpack();
                    int id = scan.nextInt();
                    ag.excpackag(id);
                    break;
                case "4":
                    ag.printcltag();
                    break;
                case "5":
                    ag.printcltag();
                    String cpf = scan.next();
                    ag.excltag(cpf);
                    break;
                case "v":
                    MenuPrincipal();
                default:
                    if (opcao != "0" && opcao != "1" && opcao != "2" && opcao != "3" && opcao != "4" && opcao != "5" && opcao != "v") {
                        break;
                    }
                    System.out.println("Opção inválida!");
            }
        }while (opcao != "0");
    }
}


