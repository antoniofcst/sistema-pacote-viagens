package src.com.sistemapacoteviagens;

import javafx.print.PageOrientation;

import java.util.ArrayList;

 public class AgenciaController {
    public ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Agencia> agencias = new ArrayList<>();
    private ArrayList<Pacote> pacotes = new ArrayList<>();

    public void salvar(Agencia agencia){
        agencias.add(agencia);
        System.out.println("Agencia salva");
    }

    public void excluir(String cnpj){
        for (int i = 0; i < agencias.size(); i++){
            if (agencias.get(i).getCnpjAgencia() == cnpj){
                agencias.remove(i);
            }
        }
    }
    public void printag(){
        System.out.println(agencias);
    }
    public void savecltag(Cliente cliente){
        System.out.println("Cliente salvo");
        clientes.add(cliente);
    }
     public void excltag(String cpf){
         for (int i = 0; i < clientes.size(); i++){
             if (clientes.get(i).getCpf() == cpf){
                 clientes.remove(i);
             }
         }
     }
     public void printcltag(){
         System.out.println(clientes);
     }
     public void savepackag(Pacote pacote){
         pacotes.add(pacote);
         System.out.println("Pacote salvo");
     }
     public void excpackag(int id){
         for (int i = 0; i < pacotes.size(); i++){
             if (pacotes.get(i).getID() == id){
                 pacotes.remove(i);
             }
         }
     }
     public void printpack(){
         System.out.println(pacotes);
     }

    @Override
    public String toString() {
        return "AgenciaController{" +
                "agencias:" + agencias + '\n' +
                "clientes:" + clientes + '\n' +
                "pacotes:" + pacotes + '\n' +
                '}';
    }
}
