package marketplace;

public class PagamentoBoleto implements Pagamento {
	double taxa = 5.0;

    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + taxa;
    }

    @Override
    public String getTipoPagamento() {
        return "Boleto Bancário";
    }
    
    @Override
    public double getValorTaxa() {
        return taxa;
    }
}