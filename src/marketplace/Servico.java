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
	
	public  void cadastrarNovoServico(Scanner leitor) {
		this.leitor = leitor;
		
		System.out.println("Digite o nome do serviço");
		String nomeDigitado = leitor.next();
		
		System.out.println("Digite a descrição do serviço");
		String descricaoDigitada = leitor.next();
		
		System.out.println("Digite o valor do serviço");
		float valorDigitado = leitor.nextFloat();
		
		this.nome = nomeDigitado;
		this.descricao = descricaoDigitada;
		this.valor = valorDigitado;
		
		todosOsServicos.add(this);
		
		System.out.println("Serviço adicionado com sucesso!\n");
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
	
	public static Servico buscarPorNome(String nomeBuscado) {
	    // Usando o for-each para varrer a lista de serviços
	    for (Servico s : todosOsServicos) {
	        
	        // Compara o nome do serviço atual com o nome que estamos buscando
	        if (s.getNome().equalsIgnoreCase(nomeBuscado)) {
	            return s; // Se encontrou, devolve o serviço completo e para o método na hora!
	        }
	    }
	    
	    // Se o "for" terminar e não encontrar nada, devolve null (vazio)
	    return null; 
	}

}
