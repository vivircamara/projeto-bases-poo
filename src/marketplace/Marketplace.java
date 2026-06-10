package marketplace;

import java.util.Scanner;

public class Marketplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CLASSE PRINCIPAL
		
		Scanner scanner = new Scanner(System.in);
		
		Servico servico1 = new Servico("lavanderia", "serviço para lavar roupas", 24);
		servico1.exibirInformações();
		
		Servico servico2 = new Servico("Marceneiro", "serviços de marcenaria" , 240);
		servico2.exibirInformações();
		
		Servico servico3 = new Servico("Eletricista", "Serviços de elétrica", 300);
		servico3.exibirInformações();
		servico3.cadastrarNovoServico(scanner);
		
		scanner.close();
	}

}
