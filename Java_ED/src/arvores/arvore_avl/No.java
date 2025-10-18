package arvores.arvore_avl;

public class No {
    int chave;
    int altura;
    No esquerdo, direito;

    No(int chave) {
        this.chave = chave;
        this.altura = 1;
    }
}

