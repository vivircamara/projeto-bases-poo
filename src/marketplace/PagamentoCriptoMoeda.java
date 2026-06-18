package marketplace;

public class PagamentoCriptoMoeda implements Pagamento {
	double taxa =  0.015; 
	
    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico + (valorServico * taxa);
    }

    @Override
    public String getTipoPagamento() {
        return "Cripto Moeda";
    }
    
    @Override
    public double getValorTaxa() {
        return  taxa;
    }
}