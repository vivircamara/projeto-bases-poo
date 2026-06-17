package marketplace;

import java.util.Scanner;

public class Pedido {
	private String nome;
	private String servicoBuscado;
	private Pagamento formaPagamento;

	public void exibirResumoCompra(Scanner leitor, Servico servico) {
		capturarNomeCliente(leitor);

		Servico servicoEncontrado = selecionarServico(leitor);
		String formaPagamentoBuscada = selecionarFormaPagamento(leitor);
		exibirResumo(servicoEncontrado, formaPagamentoBuscada);
	}

	private void capturarNomeCliente(Scanner leitor) {
		System.out.println("Digite o seu nome: ");
		nome = leitor.nextLine();
	}

	private Servico selecionarServico(Scanner leitor) {
		Servico.listarTodosServicos();

		System.out.println("Digite o nome do serviço de sua escolha: ");
		servicoBuscado = leitor.nextLine();

		Servico servicoEncontrado = Servico.buscarPorNome(servicoBuscado);
		while (servicoEncontrado == null) {
			System.out.println("Erro: Nenhum serviço cadastrado com o nome '" + servicoBuscado + "'.");
			System.out.println("Digite o nome de um serviço existente: ");

			servicoBuscado = leitor.nextLine();
			servicoEncontrado = Servico.buscarPorNome(servicoBuscado);
		}
		return servicoEncontrado;
	}

	private String selecionarFormaPagamento(Scanner leitor) {
		System.out.println("Digite a forma de pagamento de sua escolha: ");
		System.out.println("Escolha: 1-Pix, 2-Boleto, 3-Cartão de Crédito");

		int escolha = leitor.nextInt();
		leitor.nextLine();
		switch (escolha) {
			case 1:
				formaPagamento = new PagamentoPix();
				return "PIX";
			case 2:
				formaPagamento = new PagamentoBoleto();
				return "Boleto";
			default:
				formaPagamento = new PagamentoCartaoCredito();
				return "Cartão de Crédito";
		}
	}

	private void exibirResumo(Servico servicoEncontrado, String formaPagamentoBuscada) {

		System.out.println("=================================");
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("=================================");
		System.out.println("Cliente: " + nome + "\n");
		System.out.println("Serviço: " + servicoBuscado + "\n");
		System.out.println("Valor Original: R$" + servicoEncontrado.getValorServico() + "\n");
		System.out.println("Forma de Pagamento: " + formaPagamentoBuscada);
		System.out.println("Taxa Aplicada: " + formaPagamento.getValorTaxa() + "\n");
		System.out.println("Valor Final: " + formaPagamento.calcularValorFinal(servicoEncontrado.getValorServico()));
		System.out.println("Pedido realizado com sucesso!");
		System.out.println("=================================");
	}
}