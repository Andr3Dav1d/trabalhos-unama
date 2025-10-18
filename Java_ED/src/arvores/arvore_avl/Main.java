package arvores.arvore_avl;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        int[] valores = {10, 20, 30, 40, 50, 25};

        for (int valor : valores)
            arvore.inserir(valor);

        System.out.print("Percurso em pré-ordem da Árvore AVL: ");
        arvore.preOrdem(arvore.raiz);
    }
}
