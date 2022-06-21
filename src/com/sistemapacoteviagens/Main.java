package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Cliente marcio = new Cliente("ja", "co", "0479034334","maculino", "ali", 2, "half@gmail.com");
        //Pacote pacote = new Pacote();
        //Agencia agenciaCeara = new Agencia("");
        //System.out.println(marcio);

        String opcao;
        String nome;
        String sobrenome;
        String cpf;
        String sexo;
        String endereco;
        String telefone;
        String email;

        String nomeagencia;
        String cnpjagencia;
        String localdaagencia;
        //Cliente cliente;
        //Financeiro financeiro;
        //Pacote pacote;


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
                    nome = scan.next(); System.out.println("Nome:"); if (!nome.isEmpty()){ System.out.println("Sobrenome:" ); }
                    sobrenome = scan.next(); if (!sobrenome.isEmpty()){ System.out.println("CPF:"); }
                    cpf = scan.next(); if (!cpf.isEmpty()){ System.out.println("Sexo:"); }
                    sexo =  scan.next(); if (!sexo.isEmpty()){ System.out.println("Endereço"); }
                    endereco = scan.next(); if (!endereco.isEmpty()){ System.out.println("telefone:"); }
                    telefone = scan.next(); if (!telefone.isEmpty()){System.out.println("email:" ); }
                    email = scan.next();
                    Cliente c = new Cliente(nome, sobrenome, cpf, sexo, endereco, telefone, email);
                    break;
                case "2":
                    nomeagencia = scan.next(); System.out.println("Nome:");
                    if (!nomeagencia.isEmpty()){ System.out.println("CNPJ:" ); }
                    cnpjagencia = scan.next(); if (!cnpjagencia.isEmpty()){ System.out.println("Local:"); }
                    localdaagencia = scan.next(); if (!localdaagencia.isEmpty()){ System.out.println("Sexo:"); }
                    break;
                case "3":

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


