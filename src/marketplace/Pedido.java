package marketplace;

import java.util.Scanner;

public class Pedido extends Servico  {
	String nome;
	Scanner leitor;
	String servicoBuscado;
	

	
	public Pedido(Scanner leitor) {
		/*System.out.println("Digite o seu nome: " + nome);
		this.nome = leitor.nextLine();
		
		System.out.println("Digite o nome do serviço de sua escolha: ");
		servicoBuscado = leitor.nextLine();
		
		/*System.out.println("Digite o nome do serviço que deseja buscar:");
		String busca = scanner.nextLine();	
		
		Servico servicoEncontrado = Servico.buscarPorNome(servicoBuscado);
		
		if (servicoEncontrado != null) {
		    System.out.println("--- Serviço Encontrado! ---");
		    servicoEncontrado.exibirInformacoes(); // Mostra os dados dele
		} else {
		    System.out.println("Erro: Nenhum serviço cadastrado com o nome '" + servicoBuscado + "'.");
		}
		
		System.out.println("Digite a forma de pagamento de sua escolha: ");*/

	}
	
	
	
	public  void  exibirResumoCompra(Scanner leitor) {	
		
		System.out.println("Digite o seu nome: ");
		nome = leitor.nextLine();
		
		System.out.println("Digite o nome do serviço de sua escolha: ");
		servicoBuscado = leitor.nextLine();
		
		Servico servicoEncontrado = Servico.buscarPorNome(servicoBuscado);
		
		while (servicoEncontrado == null) {
		   // System.out.println("--- Serviço Encontrado! ---");
		    //servicoEncontrado.exibirInformacoes(); // Mostra os dados dele
			System.out.println("Erro: Nenhum serviço cadastrado com o nome '" + servicoBuscado + "'.");
			System.out.println("Digite o nome de um serviço existente: ");
			servicoBuscado = leitor.nextLine();
		}   
		
		System.out.println("Digite a forma de pagamento de sua escolha: ");
		
		
		System.out.println("=================================");
		System.out.println("RESUMO DO PEDIDO");
		System.out.println("=================================");
		System.out.println("Cliente: " + nome +  "\n");
		
		System.out.println(	"Serviço: " + servicoBuscado +  "\n");
		System.out.println("Valor Original: " + getValor() +  "\n");
		
		System.out.println("Forma de Pagamento: ");
		//System.out.println("Taxa Aplicada: " +  "\n"); //depois fazer a classe "enxergar" a taxa e imprimir aqui
		
		System.out.println("Valor Final: ");
		System.out.println("Pedido realizado com sucesso! ");
		System.out.println("=================================");				
		
	}

}

