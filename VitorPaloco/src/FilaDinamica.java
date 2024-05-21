public class FilaDinamica {

    private No inicio;
    private No fim;

    public FilaDinamica() {
        inicio = null;
        fim = null;
    }

    public boolean filaVazia() {
        if (inicio == null && fim == null) {
            return true;
        } else {
            return false;
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

    public void adicionarElemento(Integer elemento) {
        System.out.println("Adicionando elementos na lista.");
        No novoNo = new No(elemento);
        if(!filaVazia()) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else {
            inicio = novoNo;
        }
    }

    public void removerTudo() {
        System.out.println("Removendo elementos na lista.");
        while (!filaVazia()) {
            inicio = inicio.getProximo();
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

            int media = soma / contador;
            return media;

        } else {
            System.out.println("Fila vazia.");
            return 0;
        }
    }











    /*
    public void insert(int valor) {
        No elemento = new No();
        elemento.dado = valor;

        //Verificar se é o primeiro elemento
        if (inicio == null) {
            inicio = elemento;
            fim = elemento;
            elemento.proximo = null;
        } else {
            //Verificar se é o segundo elemento
            if (inicio == fim && inicio != null) {
                fim = elemento;
                inicio.proximo = fim;
                fim.proximo = null;
            } else {
                fim.proximo = elemento;
                elemento.proximo = null;
                fim = elemento;
            }
        }
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila vazia");
        }
        No auxiliar = inicio;
        if (inicio == fim && inicio != null) { //Se só tem 1 elemento
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
        }
        System.out.println("Removido: "+auxiliar.toString());
        System.out.println("Novo valor inicial:"+inicio.dado);
        return auxiliar.dado;
    }

    public void list() throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        No auxiliar = inicio;
        System.out.println("========================================");
        while (auxiliar != null) {
            System.out.print(auxiliar.toString() + " ==> ");
            auxiliar = auxiliar.proximo;
        }
        System.out.print("NULL");
        System.out.println("");
        System.out.println("========================================");
    }

    public int size() {
        int cont = 0;
        if (!isEmpty()) {
            No auxiliar = inicio;
            while (auxiliar != null) {
                cont++;
                auxiliar = auxiliar.proximo;
            }
        }
        return cont;
    }

    public int get(int posicao) throws Exception {
        if (isEmpty()) {
            throw new Exception("Fila Vazia");
        }
        if (posicao < 0) {
            throw new Exception("Posição inválida");
        }
        int tamanho = size();
        if (posicao > tamanho - 1) {
            throw new Exception("Posição inexistente");
        }
        int cont = 0;
        No auxiliar = inicio;
        while (cont < posicao) {
            auxiliar = auxiliar.proximo;
            cont++;
        }
        return auxiliar.dado;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        int tamanho = size();
        try {
            for (int i = 0 ; i < tamanho ; i++) {
                buffer.append("[");
                buffer.append(get(i));
                buffer.append("]");
                buffer.append("[]->");
                if (i == tamanho - 1) {
                    buffer.append("NULL");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }


     */

}