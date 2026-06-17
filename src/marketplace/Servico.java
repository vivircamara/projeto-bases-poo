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
	
	//Exibe informações individuais de um serviço
	public void exibirInformacoes() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Valor do serviço: R$ " + valorServico);
		System.out.println("\n");
	}
	
	//Cadastra novo serviço
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

	//Revisar esse método dps
	public static Servico buscarPorNome(String servicoBuscado) {
	    for (Servico s : todosOsServicos) {
	        if (s.getNome().equalsIgnoreCase(servicoBuscado)) {
	            return s; 
	        }
	    }
	    
	    return null; 
	}

}
