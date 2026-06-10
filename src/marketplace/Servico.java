package marketplace;

import java.util.Scanner;

public class Servico {
	//atributos
	
	String nome;
	String descricao;
	Float valor;
	Scanner leitor;
	
	public Servico(String nome, String descricao, float valor) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;		
	}
	
	public void exibirInformações() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Descrição do serviço: " + valor);
	}
	
	public void cadastrarNovoServico(Scanner leitor) {
		this.leitor = leitor;
		
		System.out.println("Digite o nome do nome serviço");
		String nomeDigitado = leitor.next();
		
		System.out.println("Digite a descrição do serviço");
		String descricaoDigitada = leitor.next();
		
		System.out.println("Digite o valor do serviço");
		float valorDigitado = leitor.nextFloat();
		
		this.nome = nomeDigitado;
		this.descricao = descricaoDigitada;
		this.valor = valorDigitado;
		
		exibirInformações();
	}

}
