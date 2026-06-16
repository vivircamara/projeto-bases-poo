package marketplace;

public class PagamentoBoleto implements Pagamento {

    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + 5.0;
    }

    @Override
    public String getTipoPagamento() {
        return "Boleto Bancário";
    }
}