// Classe Principal
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sistema de Gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Remover Livro");
            System.out.println("3. Listar Livros");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o número de páginas do livro: ");
                    int numeroDePaginas = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha

                    Livro livro = new Livro(titulo, autor, numeroDePaginas);
                    biblioteca.adicionarLivro(livro);
                    break;
                case 2:
                    System.out.print("Digite o título do livro a ser removido: ");
                    String tituloRemover = scanner.nextLine();
                    biblioteca.removerLivro(tituloRemover);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
