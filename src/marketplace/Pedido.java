package marketplace;

import java.util.Scanner;

public class Pedido {
	String nome;
	Scanner leitor;
	String servicoBuscado;
	Pagamento formaPagamento;

	public void  exibirResumoCompra(Scanner leitor, Servico servico) {
		String formaPagamentoBuscada;

		System.out.println("Digite o seu nome: ");
		nome = leitor.nextLine();

		Servico.listarTodosServicos();
		System.out.println("Digite o nome do serviço de sua escolha: ");
		servicoBuscado = leitor.nextLine();
		
		Servico servicoEncontrado = Servico.buscarPorNome(servicoBuscado);
		
		while (servicoEncontrado == null) {
			// Mostra os dados dele
			System.out.println("Erro: Nenhum serviço cadastrado com o nome '" + servicoBuscado + "'.");
			System.out.println("Digite o nome de um serviço existente: ");
			servicoBuscado = leitor.nextLine();
		}   
		
		System.out.println("Digite a forma de pagamento de sua escolha: ");
		System.out.println("Escolha: 1-Pix, 2-Boleto, 3-Cartão de Crédito");
	    int escolha = leitor.nextInt();
	    
	    if (escolha == 1) {
	        this.formaPagamento = new PagamentoPix();
	        formaPagamentoBuscada = "PIX";
	        } else if (escolha == 2) {
	        this.formaPagamento = new PagamentoBoleto();
	        formaPagamentoBuscada = "Boleto";

	    } else {
	    	this.formaPagamento = new PagamentoCartaoCredito();
	        formaPagamentoBuscada = "Cartão de Crédito";

	    }

		System.out.println("=================================");
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("=================================");
		System.out.println("Cliente: " + nome +  "\n");
		
		System.out.println(	"Serviço: " + servicoBuscado +  "\n");
		System.out.println("Valor Original: R$" + servicoEncontrado.getValorServico() +  "\n");
		
		System.out.println("Forma de Pagamento: " + formaPagamentoBuscada);
		
		System.out.println("Taxa Aplicada: " + formaPagamento.getValorTaxa() + "\n"); 
		
		System.out.println("Valor Final: " +  formaPagamento.calcularValorFinal(servicoEncontrado.getValorServico()));
		System.out.println("Pedido realizado com sucesso! ");
		System.out.println("=================================");				
		
	}
}

