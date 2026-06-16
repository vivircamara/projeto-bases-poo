package marketplace;

public interface Pagamento {

    double calcularValorFinal(double valorServico);

    String getTipoPagamento();
    
    double getValorTaxa();
}