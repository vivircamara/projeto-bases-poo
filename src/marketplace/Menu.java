package marketplace;

import java.util.Scanner;

public class Menu {
	//ATRIBUTOS
    private Scanner scanner;
    private Servico servico;
    private int opcao;
    
    //CONSTRUTOR
    public Menu(){
        scanner = new Scanner(System.in);
        servico = new Servico(scanner);
    }
    
    //MÉTODOS
    //Exibe as opções do menu
    public void exibeOpcoes(){
        while (true){
            escreveInterface();
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    Servico.listarTodosServicos();
                    break;
                case 2:
                    servico.cadastrarNovoServico();
                    break;
                case 3:
                    System.out.println("Digite o serviço a ser buscado: ");
                    String opcaoBuscada = scanner.nextLine();
                    Servico resServico = Servico.buscarPorNome(opcaoBuscada);
                    if (resServico != null) {
                        System.out.println("Serviço encontrado!");
                        resServico.exibirInformacoes();
                    } else {
                        System.out.println("Serviço não encontrado.");
                    }
                    break;
                case 4:
                    Pedido pedido = new Pedido();
                    pedido.exibirResumoCompra(scanner, servico);
                    break;
                case 5:
                	scanner.close();
                    return;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }
    
    //Cria a interface no console
    public void escreveInterface(){
        System.out.println("=================================");
        System.out.println("    MARKETPLACE DE SERVIÇOS");
        System.out.println("=================================");
        System.out.println("1 - Listar serviços");
        System.out.println("2 - Cadastrar serviço");
        System.out.println("3 - Buscar serviço");
        System.out.println("4 - Realizar pedido");
        System.out.println("5 - Sair");
        System.out.println("=================================");
        System.out.print("Escolha uma opção: ");
    }
}