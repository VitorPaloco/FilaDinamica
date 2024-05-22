
import java.util.Scanner;

public class FilaDinamica {

    Scanner scanner = new Scanner(System.in);
    private No inicio;
    private No fim;


    public FilaDinamica() {
        inicio = null;
        fim = null;
    }

    public void limpaTela() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

    public boolean filaVazia() {
        return inicio == null;
    }

    public void adicionarElemento(Integer elemento) {
        System.out.println("Adicionando elemento no final da fila...");
        No novoNo = new No(elemento);
        if(!filaVazia()) {
            fim.setProximo(novoNo);
        } else {
            inicio = novoNo;
        }
        fim = novoNo;
    }

    public void removerElemento() {
        if(!filaVazia()) {
            System.out.println("Removendo o elemento no início da fila...");
            inicio = inicio.getProximo();
        } else {
            System.out.println("Fila vazia");
        }
    }

    public void removerTudo() {
        System.out.println("Removendo elementos na lista.");
        while (!filaVazia()) {
            inicio = inicio.getProximo();
        }
    }

    public void exibirElementos() {
        if(filaVazia()) {
            System.out.println("Não existem elementos na Fila.");
        } else {
            No aux = inicio;
            while(aux.getProximo() != null) {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
            System.out.println(aux.getElemento());
        }

    }

    public void buscarValor() {
        if (!filaVazia()) {
            System.out.println("Digite a posição que deseja buscar: ");
            int posicao = scanner.nextInt();

            if (posicao < 0 || posicao >= exibirTamanho()) {
                System.out.println("Posição inválida.");
            } else {
                No aux = inicio;
                int contador = 0;

                while (contador < posicao) {
                    aux = aux.getProximo();
                    contador++;
                }
                System.out.println("Elemento na posição " + posicao + ": " + aux.getElemento());
            }
        } else {
            System.out.println("Fila vazia.");
        }
    }

    public int maiorDaFila() {
        if (!filaVazia()) {
            int maior = inicio.getElemento();
            No aux = inicio.getProximo();

            while (aux != null) {
                if (aux.getElemento() > maior) {
                    maior = aux.getElemento();
                }
                aux = aux.getProximo();
            }

            return maior;

        } else {
            System.out.println("Fila vazia.");
            return 0;
        }
    }

    public int menorDaFila() {
        if (!filaVazia()) {
            int menor = inicio.getElemento();
            No aux = inicio.getProximo();

            while (aux != null) {
                if (aux.getElemento() < menor) {
                    menor = aux.getElemento();
                }
                aux = aux.getProximo();
            }

            return menor;

        } else {
            System.out.println("Fila vazia.");
            return 0;
        }
    }

    public int mediaFila() {
        if (!filaVazia()) {
            int soma = 0;
            int contador = 0;
            No aux = inicio;

            while (aux != null) {
                soma += aux.getElemento();
                contador++;
                aux = aux.getProximo();
            }

            return soma / contador;

        } else {
            System.out.println("Fila vazia.");
            return 0;
        }
    }

    public int exibirTamanho() {
        int contador = 0;
        if (!filaVazia()) {
            No aux = inicio;
            while (aux != null) {
                contador++;
                aux = aux.getProximo();
            }
        }
        return contador;
    }
}