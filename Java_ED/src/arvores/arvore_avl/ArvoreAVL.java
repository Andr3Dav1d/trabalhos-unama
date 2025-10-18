package arvores.arvore_avl;

public class ArvoreAVL {
    No raiz;

    int altura(No n) {
        return (n == null) ? 0 : n.altura;
    }

    int getBalanceamento(No n) {
        return (n == null) ? 0 : altura(n.esquerdo) - altura(n.direito);
    }

    No rotacaoDireita(No y) {
        No x = y.esquerdo;
        No t2 = x.direito;

        x.direito = y;
        y.esquerdo = t2;

        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;
        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;

        return x;
    }

    No rotacaoEsquerda(No x) {
        No y = x.direito;
        No t2 = y.esquerdo;

        y.esquerdo = x;
        x.direito = t2;

        x.altura = Math.max(altura(x.esquerdo), altura(x.direito)) + 1;
        y.altura = Math.max(altura(y.esquerdo), altura(y.direito)) + 1;

        return y;
    }

    No inserir(No no, int chave) {
        if (no == null)
            return new No(chave);

        if (chave < no.chave)
            no.esquerdo = inserir(no.esquerdo, chave);
        else if (chave > no.chave)
            no.direito = inserir(no.direito, chave);
        else
            return no; 

        no.altura = 1 + Math.max(altura(no.esquerdo), altura(no.direito));

        int balanceamento = getBalanceamento(no);

        if (balanceamento > 1 && chave < no.esquerdo.chave)
            return rotacaoDireita(no);

        if (balanceamento < -1 && chave > no.direito.chave)
            return rotacaoEsquerda(no);

        if (balanceamento > 1 && chave > no.esquerdo.chave) {
            no.esquerdo = rotacaoEsquerda(no.esquerdo);
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && chave < no.direito.chave) {
            no.direito = rotacaoDireita(no.direito);
            return rotacaoEsquerda(no);
        }
        
        return no;
    }

    void inserir(int chave) {
        raiz = inserir(raiz, chave);
    }

    void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.chave + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }
    }
}

