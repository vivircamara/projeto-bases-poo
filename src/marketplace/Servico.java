package marketplace;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Servico {
	//atributos
	private String nome;
	private String descricao;
	private Float valor;
	Scanner leitor;
	
	private static List<Servico> todosOsServicos = new ArrayList<>();
	
	public Servico(String nome, String descricao, float valor) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		
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
	
	public Float getValor() {
		return valor;
	}
	
	public void setValor(Float valor) {
		this.valor = valor;
	}

	public void exibirInformacoes() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Descrição do serviço: " + valor);
		System.out.println("\n");
	}
	
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
		this.valor = valorDigitado;
		
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
	
	//Revisar esse método dps
	public static Servico buscarPorNome(String nomeBuscado) {
	    for (Servico s : todosOsServicos) {
	        if (s.getNome().equalsIgnoreCase(nomeBuscado)) {
	            return s; 
	        }
	    }
	    return null; 
	}

}
