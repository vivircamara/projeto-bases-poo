package marketplace;
//import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class Marketplace {
	public static void main(String[] args) {
		//CLASSE PRINCIPAL
		
		Scanner scanner = new Scanner(System.in);
		
		Servico servico1 = new Servico("Criação de Logo", "Serviço para criação de logo.", 150);
		
		Servico servico2 = new Servico("Desenvolvimento de Site", "Serviço para desenvolvimento de site" , 2500); //como formatar para 2.500?
		
		Servico servico3 = new Servico("Consultoria em TI", "Serviço de consultoria em T.I", 400);
			
		Servico servico4 = new Servico();

		Menu menu = new Menu();
		menu.exibeOpcoes(servico4);
		
		scanner.close();
	}
}