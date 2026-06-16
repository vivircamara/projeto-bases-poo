package marketplace;
import java.util.Scanner;
public class Marketplace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CLASSE PRINCIPAL
		
		Scanner scanner = new Scanner(System.in);
		
		Servico servico1 = new Servico("Criação de Logo", "Serviço para criação de logo.", 150);
		//servico1.exibirInformacoes();
		
		Servico servico2 = new Servico("Desenvolvimento de Site", "Serviço para desenvolvimento de site" , 2500); //como formatar para 2.500?
		//servico2.exibirInformacoes();
		
		Servico servico3 = new Servico("Consultoria em TI", "Serviço de consultoria em T.I", 400);
		//servico3.exibirInformacoes();
			
		Servico servico4 = new Servico();		
		servico4.cadastrarNovoServico(scanner); 
		
		Servico.listarTodosServicos();
	
		
		
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
		
		
		
		scanner.close();
	}
}