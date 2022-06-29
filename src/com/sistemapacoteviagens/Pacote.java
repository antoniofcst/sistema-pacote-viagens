package src.com.sistemapacoteviagens;

public class Pacote {
    private Cidade cidade;
    private String precoDoPacote;
    private String nomeDoPacote;
    private static int count = 1;
    private int ID;


    public String getPrecoDoPacote() {
        return precoDoPacote;
    }
    public void setPrecoDoPacote(String precoDoPacote) {
        this.precoDoPacote = precoDoPacote;
    }

    public String getNomeDoPacote() { return nomeDoPacote; }
    public void setNomeDoPacote(String nomeDoPacote) { this.nomeDoPacote = nomeDoPacote; }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }

    public Pacote(String nomeDoPacote, Cidade cidade, String precoDoPacote) {
        setNomeDoPacote(nomeDoPacote);
        setCidade(cidade);
        setPrecoDoPacote(precoDoPacote);
        ID = count++;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "nomeDoPacote:" + nomeDoPacote + '\n' +
                "cidade:" + cidade + '\n' +
                "precoDoPacote:" + precoDoPacote + '\n' +
                "ID:" + ID + '\n' +
                '}';
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
