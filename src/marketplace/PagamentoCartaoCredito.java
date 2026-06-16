package marketplace;

public class PagamentoCartaoCredito implements Pagamento {

    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + (valorServico * 0.03);
    }

    @Override
    public String getTipoPagamento() {
        return "Cartão de Crédito";
    }
}