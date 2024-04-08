import java.util.Scanner;

public class AppListaCompras {
    public static void main(String[] args) {
        // Criando a lista de compras
        ListaCompras lista = new ListaCompras();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        // Menu de interação com o usuário
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar item à lista de compras");
            System.out.println("2 - Remover item da lista de compras");
            System.out.println("3 - Exibir lista de compras");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do item a ser adicionado:");
                    String nomeItem = scanner.nextLine();
                    lista.adicionarItem(new ItemCompra(nomeItem));
                    break;
                case 2:
                    System.out.println("Digite o nome do item a ser removido:");
                    String nomeItemRemover = scanner.nextLine();
                    lista.removerItem(nomeItemRemover);
                    break;
                case 3:
                    lista.exibirLista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
}