package src.com.sistemapacoteviagens;

import java.util.ArrayList;
import java.util.Scanner;

public class Cidade {
    private String nomeDaCidade;
    private String estadoDaCidade;
    private String paisDaCidade;
    private ArrayList<String> atracoes = new ArrayList<>();

    public String getNomeDaCidade() {
        return nomeDaCidade;
    }

    public void setNomeDaCidade(String nomeDaCidade) {
        this.nomeDaCidade = nomeDaCidade;
    }

    public String getEstadoDaCidade() {
        return estadoDaCidade;
    }

    public void setEstadoDaCidade(String estadoDaCidade) {
        this.estadoDaCidade = estadoDaCidade;
    }

    public String getPaisDaCidade() {
        return paisDaCidade;
    }

    public void setPaisDaCidade(String paisDaCidade) {
        this.paisDaCidade = paisDaCidade;
    }
    public ArrayList<String> getAtracoes() {
        return atracoes;
    }

    private void setAtracoes(ArrayList<String> atracoes) {
        this.atracoes.addAll(atracoes);
    }
    public Cidade(String nomeDaCidade, String estadoDaCidade, String paisDaCidade) {
        setNomeDaCidade(nomeDaCidade);
        setEstadoDaCidade(estadoDaCidade);
        setPaisDaCidade(paisDaCidade);

    }

    public void cadastrarAtracoes() {
        int opcao;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("+====================================================================+");
            System.out.println("                        Cadastrar as atrações                         ");
            System.out.println("+====================================================================+");
            System.out.println("(1) Cadastrar 1° atração: ");
            System.out.println("(2) Cadastrar 2° atração:");
            System.out.println("(3) Cadastrar 3° atração:");
            System.out.println("(4) Cadastrar 4° atração:");
            System.out.println("(5) Encerrar cadastramento.");
            try {
                opcao = Integer.parseInt(scan.nextLine().trim());
            } catch (NumberFormatException ex) {
                opcao = 0;
            }
            switch (opcao) {
                case 0:
                    continue;
                case 1:
                    System.out.println("Atração 1:");
                    String nomeAtracao1 = scan.next();
                    atracoes.add(nomeAtracao1);
                    break;
                case 2:
                    System.out.println("Atração 2:");
                    String nomeAtracao2 = scan.next();
                    atracoes.add(nomeAtracao2);
                    break;
                case 3:
                    System.out.println("Atração 3:");
                    String nomeAtracao3 = scan.next();
                    atracoes.add(nomeAtracao3);
                    break;
                case 4:
                    System.out.println("Atração 4:");
                    String nomeAtracao4 = scan.next();
                    atracoes.add(nomeAtracao4);
                    break;
                default:
                        break;
                    }
            }while (opcao != 5);
        }


    @Override
    public String toString() {
        return "Cidade{" +
                "nomeDaCidade:'" + nomeDaCidade + '\n' +
                ", estadoDaCidade:'" + estadoDaCidade + '\n' +
                ", paisDaCidade:'" + paisDaCidade + '\n' +
                ", atracoes:" + atracoes + '\n' +
                '}';
    }
}
