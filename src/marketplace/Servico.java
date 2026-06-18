package marketplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Servico {
	//ATRIBUTOS
	private String nome;
	private String descricao;
	private Float valorServico;
	private Scanner leitor;
	private static List<Servico> todosOsServicos = new ArrayList<>(List.of(
		 new Servico("Criação de Logo", "Serviço para criação de logo.", 150),
	
		 new Servico("Desenvolvimento de Site", "Serviço para desenvolvimento de site" , 2500),//como formatar para 2.500?
		
		 new Servico("Consultoria em TI", "Serviço de consultoria em T.I", 400)
			
	));
	
	//CONSTRUTOR 
	public Servico(String nome, String descricao, float valorServico) {
		this.nome = nome;
		this.descricao = descricao;
		this.valorServico = valorServico;
	
	}	
	
	//CONSTRUTOR VAZIO - CADASTRAR NOVO USUÁRIO
	public Servico(Scanner scannerDoMenu) {
		this.leitor = scannerDoMenu;
	}
	
	//MÉTODOS GETTERS E SETTERS
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
	
	//MÉTODOS	
	//Exibe informações individuais de um serviço
	public void exibirInformacoes() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Valor do serviço: R$ " + valorServico);
		System.out.println("\n");
	}
	
	//Cadastra novo serviço
	//public void cadastrarNovoServico(Scanner leitor) {
	public void cadastrarNovoServico() {
		//this.leitor = leitor;
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
		leitor.nextLine();
		
		while(valorDigitado < 0) {
			System.out.println("Erro: o valor do serviço não pode ser negativo");
			System.out.println("Digite um valor válido.");
			valorDigitado = leitor.nextFloat();
			leitor.nextLine();
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
	
	//Lista todos os serviços
	public static void listarTodosServicos() {
		if (todosOsServicos.isEmpty()) {
			System.out.println("Nenhum serviço cadastrado.");
			return;
		}

		System.out.println("--- Lista de serviços criados ---");

		for (Servico s : todosOsServicos) {
			s.exibirInformacoes();
		}
	}
	//Realiza a busca dos serviços
	public static Servico buscarPorNome(String servicoBuscado) {
	//public static Servico buscarPorNome() {
		/*System.out.println("Digite o serviço a ser buscado: ");
        String opcaoBuscada = leitor.nextLine();*/
	    for (Servico s : todosOsServicos) {
	        if (s.getNome().equalsIgnoreCase(servicoBuscado)) {
	    	//if (s.getNome().equalsIgnoreCase(opcaoBuscada)) {
	            return s; 
	        }
	    }
	    
	    return null; 
	}

}
