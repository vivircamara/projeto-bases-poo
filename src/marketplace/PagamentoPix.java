package marketplace;

//import java.util.Scanner;

public class PagamentoPix implements Pagamento {
    @Override
    public double calcularValorFinal(double valorServico) {
        return valorServico;
    }

    @Override
    public String getTipoPagamento() {
        return "PIX";
    }
    
    @Override
    public double  getValorTaxa() {
        return 0;
    }
    
    
	
}