package marketplace;

public class Servico {
	//atributos
	
	String nome;
	String descricao;
	Float valor;
	
	public Servico(String nome, String descricao, float valor) {
		
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;		
	}
	
	public void cadastrarNovoServico() {
		
	}
	
	public void listarServicos() {
		System.out.println("Nome do serviço: " + nome);
		System.out.println("Descrição do serviço: " + descricao);
		System.out.println("Descrição do serviço: " + valor);
	}

}
