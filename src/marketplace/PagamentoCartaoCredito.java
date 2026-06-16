package marketplace;

public class PagamentoCartaoCredito implements Pagamento {
	double taxa =  0.03; 
	
    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + (valorServico * taxa);
    }

    @Override
    public String getTipoPagamento() {
        return "Cartão de Crédito";
    }
    
    @Override
    public double getValorTaxa() {
        return  taxa;
    }
}