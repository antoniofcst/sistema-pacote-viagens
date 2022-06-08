package src.com.sistemapacoteviagens;

public class Financeiro {
    public String formaDePagamento;
    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    private void choosePayment(String metodoDePagamento) {
        switch (metodoDePagamento) {
            case "PIX":
                setFormaDePagamento(metodoDePagamento);
                break;
            case "Cartão":
                setFormaDePagamento(metodoDePagamento);
                break;
            case "Boleto":
                setFormaDePagamento(metodoDePagamento);
                break;
            case "Espécime":
                setFormaDePagamento(metodoDePagamento);
                break;
            default:
                setFormaDePagamento(null);
                System.out.println("Nenhuma forma de pagamento cadastrada.");

        }
    }

}
