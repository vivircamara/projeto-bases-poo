package marketplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Servico {
	//atributos
	private String nome;
	private String descricao;
	private Float valorServico;
	Scanner leitor;
	
	private static List<Servico> todosOsServicos = new ArrayList<>();
	
	public Servico(String nome, String descricao, float valorServico) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valorServico = valorServico;
		
		todosOsServicos.add(this);
	}
	
	public Servico() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Float getValorServico() {
		return valorServico;
	}
	
	public void setValorServico(Float valorServico) {
		this.valorServico = valorServico;
	}

	public void exibirInformacoes() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Valor do serviço: R$ " + valorServico);
		System.out.println("\n");
	}
	
	//Cadastrar novo serviço
	public void cadastrarNovoServico(Scanner leitor) {
		this.leitor = leitor;
		System.out.println("---Cadastrar novo serviço--\n");
		
		System.out.println("Digite o nome do novo serviço");
		String nomeDigitado = leitor.nextLine();
		
		while(nomeDigitado.isEmpty()) {
			System.out.println("Erro: O serviço precisa de um nome.");
			System.out.println("Digite um nome:");
			nomeDigitado = leitor.nextLine();
		}
		
		System.out.println("Digite a descrição do novo serviço");
		String descricaoDigitada = leitor.nextLine();
		
		System.out.println("Digite o valor do novo serviço");
		float valorDigitado = leitor.nextFloat();
		
		while(valorDigitado < 0) {
			System.out.println("Erro: o valor do serviço não pode ser negativo");
			System.out.println("Digite um valor válido.");
			valorDigitado = leitor.nextFloat();
		}
		
		this.nome = nomeDigitado;
		this.descricao = descricaoDigitada;
		this.valorServico = valorDigitado;
		
			todosOsServicos.add(this);
			System.out.println("Novo serviço cadastrado com sucesso!\n");
	}
	
	public static List<Servico> getTodosOsServicos() {
        return todosOsServicos;
    }
	
	public static void listarTodosServicos() {
		System.out.println("--- Lista de serviços criados ---");
		
		for (Servico s : Servico.getTodosOsServicos()) {
			s.exibirInformacoes();
		}
	}
	
	
	//Busca de serviço 
	/*System.out.println("Digite o nome do serviço que deseja buscar:");
	String busca = scanner.nextLine();		
	
	Servico servicoEncontrado = Servico.buscarPorNome(busca);
	
	if (servicoEncontrado != null) {
	    System.out.println("--- Serviço Encontrado! ---");
	    servicoEncontrado.exibirInformacoes(); // Mostra os dados dele
	} else {
	    System.out.println("Erro: Nenhum serviço cadastrado com o nome '" + busca + "'.");
	} */
	
	//Revisar esse método dps
	public static Servico buscarPorNome(String servicoBuscado) {
	    for (Servico s : todosOsServicos) {
	        if (s.getNome().equalsIgnoreCase(servicoBuscado)) {
	            return s; 
	        }
	    }
	    return null; 
	}
	
	public  void  exibirResumoCompra(Scanner leitor) {	
		String nome;
		String servicoBuscado;
		
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
		System.out.println("Valor Original: " + getValorServico() +  "\n");
		
		System.out.println("Forma de Pagamento: ");
		System.out.println("Taxa Aplicada: " + getValorTaxa() + "\n"); 
		
		System.out.println("Valor Final: " +  calcularValorFinal(valorServico));
		System.out.println("Pedido realizado com sucesso! ");
		System.out.println("=================================");				
		
	}

}
