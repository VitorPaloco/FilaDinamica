import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            filaDinamica.limpaTela();
            System.out.println("|---------------------------------------------------------|");
            System.out.println("|--------------------- FILA DINÂMICA ---------------------|");
            System.out.println("|---------------------------------------------------------|");
            System.out.println();
            System.out.println("Digite 1 para adicionar elementos na fila.");
            System.out.println("Digite 2 para remover o primeiro elemento da fila.");
            System.out.println("Digite 3 para remover todos os elementos da fila.");
            System.out.println("Digite 4 para exibir todos os elementos da fila.");
            System.out.println("Digite 5 para buscar um elemento por sua posição.");
            System.out.println("Digite 6 para buscar o maior elemento da fila.");
            System.out.println("Digite 7 para buscar o menor elemento da fila.");
            System.out.println("Digite 8 para exibir a média dos elementos da fila.");
            System.out.println("Digite 9 para exibir o tamanho da fila.");
            System.out.println("Digite 0 para sair do programa.");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Digite o elemento a ser adicionado: ");
                    int elemento = scanner.nextInt();
                    filaDinamica.adicionarElemento(elemento);
                    break;
                case 2:
                    filaDinamica.removerElemento();
                    break;
                case 3:
                    filaDinamica.removerTudo();
                    break;
                case 4:
                    filaDinamica.exibirElementos();
                    break;
                case 5:
                    filaDinamica.buscarValor();
                    break;
                case 6:
                    int maior = filaDinamica.maiorDaFila();
                    if (maior != 0) {
                        System.out.println("Maior elemento da fila: " + maior);
                    }
                    break;
                case 7:
                    int menor = filaDinamica.menorDaFila();
                    if (menor != 0) {
                        System.out.println("Menor elemento da fila: " + menor);
                    }
                    break;
                case 8:
                    int media = filaDinamica.mediaFila();
                    if (media != 0) {
                        System.out.println("Média dos elementos da fila: " + media);
                    }
                    break;
                case 9:
                    int tamanho = filaDinamica.exibirTamanho();
                    System.out.println("Tamanho da fila: " + tamanho);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Pressione Enter para voltar ao menu...");
            scanner.nextLine();
            scanner.nextLine();
        }
    }
}
