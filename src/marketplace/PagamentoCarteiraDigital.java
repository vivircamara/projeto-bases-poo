package marketplace;

public class PagamentoCarteiraDigital implements Pagamento {
	double taxa =  0.025; 
	
    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + (valorServico * taxa);
    }

    @Override
    public String getTipoPagamento() {
        return "Carteira digital";
    }
    
    @Override
    public double getValorTaxa() {
        return  taxa;
    }
}