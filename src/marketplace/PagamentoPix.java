package marketplace;

public class PagamentoPix implements Pagamento {

    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico;
    }

    @Override
    public String getTipoPagamento() {
        return "PIX";
    }
}