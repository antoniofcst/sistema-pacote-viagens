package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Cliente marcio = new Cliente("ja", "co", "0479034334","maculino", "ali", "2", "half@gmail.com");
        //System.out.println(marcio);
        //Pacote pacote = new Pacote();
        //Agencia agenciaCeara = new Agencia("");
        //System.out.println(marcio);
        ClienteController cc = new ClienteController();
        //cc.salvar(marcio);
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
                    Financeiro financeiroDaAgenciaNova = new Financeiro();
                    // menu de pácote

                    Agencia a = new Agencia(nomeag, cnpjag, localag, c,  financeiroDaAgenciaNova, ); // metodo para alocar cliente na agencia
                    ag.salvar(a);
                    break;
                case "3":
                    System.out.println(cc);
                    break;
                case "4":

                    break;
                default:
                    if (opcao == "0") {
                        break;
                    }
                    System.out.println("Opcao invalida");
            }
        }while (opcao != "0");

    }
}


