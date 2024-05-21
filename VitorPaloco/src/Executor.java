public class Executor {
    public static void main(String[] args) {
        FilaDinamica filaDinamica = new FilaDinamica();

        filaDinamica.adicionarElemento(15);
        filaDinamica.adicionarElemento(7);
        filaDinamica.adicionarElemento(1);
        filaDinamica.adicionarElemento(6);
        filaDinamica.exibirElementos();
        System.out.println("Menor da Fila: " + filaDinamica.menorDaFila());
        System.out.println("Maior da Fila: " + filaDinamica.maiorDaFila());



        /*

        filaDinamica.adicionarElemento(1);
        filaDinamica.exibirElementos();
        filaDinamica.exibirTamanho();
        filaDinamica.removerTudo();
        filaDinamica.mediaFila();
        filaDinamica.menorDaFila();
        filaDinamica.maiorDaFila();

        */
    }
}
