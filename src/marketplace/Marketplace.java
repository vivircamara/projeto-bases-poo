package marketplace;
//import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;
public class Marketplace {
	public static void main(String[] args) {
		//CLASSE PRINCIPAL
		
		Scanner scanner = new Scanner(System.in);
		
		Servico servico1 = new Servico("Criação de Logo", "Serviço para criação de logo.", 150);
			
		Servico servico2 = new Servico();

		Menu menu = new Menu();
		menu.exibeOpcoes(servico2);
		
		scanner.close();
	}
}