package marketplace;

public class PagamentoDebito implements Pagamento {
	double taxa =  0.01; 
	
    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + (valorServico * taxa);
    }

    @Override
    public String getTipoPagamento() {
        return "Débito";
    }
    
    @Override
    public double getValorTaxa() {
        return  taxa;
    }
}