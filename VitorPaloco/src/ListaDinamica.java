public class ListaDinamica {
    private No origem;

    public ListaDinamica() {
        this.origem = null;
    }

    public void exibirElementos() {
        if(origem == null) {
            System.out.println("Não existem elementos na lista.");
        } else {
            No aux = origem;
            while(aux.getProximo() != null) {
                System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
            System.out.println(aux.getElemento());
        }

    }

    public void adicionarFim(Integer elemento) {
        System.out.println("Adicionando elementos na lista.");
        No novoNo = new No(elemento);
        if (origem == null) {
            //Estou adicionando o primeiro nó na lista
            origem = novoNo;
        } else {
            //Já possui nó na lista
            //? = novoNo;
            No aux = origem;
            while(aux.getProximo() != null) {
                //System.out.println(aux.getElemento());
                aux = aux.getProximo();
            }
            aux.setProximo(novoNo);
        }
    }

    public void adicionarInicio(Integer elemento) {
        System.out.println("Adicionando elementos na lista.");
        No novoNo = new No(elemento);
        if(origem != null) {
            novoNo.setProximo(origem);
            origem = novoNo;
        } else {
            origem = novoNo;
        }
    }

    public void adicionarPosicao(Integer elemento, int posicao) {
        System.out.println("Adicionando elementos na lista.");
        if(posicao >= 0) {
            int cont = 0;
            No atual = origem;
            No anterior = null;
            No novoNo = new No(elemento);
            do {
                if(posicao == cont) {
                    if (cont == 0) {
                        adicionarInicio(elemento);
                        return;
                    } else {
                        novoNo.setProximo(atual);
                        anterior.setProximo(novoNo);
                        return;
                    }
                }
                cont++;
                anterior = atual;
                atual = atual.getProximo();
            } while (atual != null);
            if(posicao > cont) {
                System.out.println("Posição indisponível.");
                return;
            }
        } else {
            System.out.println("Informe uma posição válida.");
            return;
        }
    }

    public void removerElemento(Integer elemento) {
        System.out.println("Removendo elementos na lista.");
        if(origem != null) {
            No atual = origem;
            No anterior = null;
            do {
                if(atual.getElemento() == elemento) {
                    if(origem.getElemento() == elemento) {
                        removerInicio();
                        atual = origem;
                    } else {
                        anterior.setProximo(atual.getProximo());
                        atual = atual.getProximo();

                    }
                } else {
                    anterior = atual;
                    atual = atual.getProximo();
                }
            } while(atual != null);

        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public void removerInicio() {
        if(origem != null) {
            origem = origem.getProximo();
        } else {
            System.out.println("Não existem elementos na lista.");
        }
    }

    public void removerFim() {
        No atual = origem;
        if (atual != null)  {
            if(atual.getProximo() == null) {
                origem = null;
            }
            No anterior = atual;
            while (atual.getProximo() != null) {
                anterior = atual;
                atual = atual.getProximo();
            }
            anterior.setProximo(null);
        }
    }

    public void removerPosicao(int posicao) {
        if (posicao >= 0) {
            if (origem == null) {
                return;
            } else {
                int cont = 0;
                No atual = origem;
                No anterior = null;
                do {
                    if (posicao == cont) {
                        if (posicao == 0) {
                            removerInicio();
                        } else {
                            anterior.setProximo(atual.getProximo());
                            return;
                        }
                    }
                    cont++;
                    anterior = atual;
                    atual = atual.getProximo();
                } while (atual != null);
            }
        } else {
            System.out.println("Informe uma posição válida.");
            return;
        }
        System.out.println("A posição não existe na lista dinâmica.");
    }
}
