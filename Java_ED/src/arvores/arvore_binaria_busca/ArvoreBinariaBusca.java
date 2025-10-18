package arvores.arvore_binaria_busca;

public class ArvoreBinariaBusca {
    Node raiz;
    
    public ArvoreBinariaBusca() {
        raiz = null;
    }
    
    public void inserir(int valor) {
        raiz = inserirRecursivo(raiz, valor);
    }

    private Node inserirRecursivo(Node raiz, int valor) {
        if (raiz == null) {
            raiz = new Node(valor);
            return raiz;
        }
        
        if (valor < raiz.valor) {
            raiz.esquerda = inserirRecursivo(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = inserirRecursivo(raiz.direita, valor);
        }
        
        return raiz;
    }
    
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }
    
    private boolean buscarRecursivo(Node raiz, int valor) {
        if (raiz == null) {
            return false;
        }
        
        if (raiz.valor == valor) {
            return true;
        }
        
        if (valor < raiz.valor) {
            return buscarRecursivo(raiz.esquerda, valor);
        }
        
        return buscarRecursivo(raiz.direita, valor);
    }
    
    public void remover(int valor) {
        raiz = removerRecursivo(raiz, valor);
    }

    private Node removerRecursivo(Node raiz, int valor) {
        
        if (raiz == null) {
            return raiz;
        }
        
        if (valor < raiz.valor) {
            raiz.esquerda = removerRecursivo(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = removerRecursivo(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }
            
            raiz.valor = valorMinimo(raiz.direita);
            
            raiz.direita = removerRecursivo(raiz.direita, raiz.valor);
        }
        
        return raiz;
    }
    
    private int valorMinimo(Node raiz) {
        int min = raiz.valor;
        while (raiz.esquerda != null) {
            min = raiz.esquerda.valor;
            raiz = raiz.esquerda;
        }
        return min;
    }
    
    public void inOrder() {
        inOrderRecursivo(raiz);
        System.out.println();
    }
    
    private void inOrderRecursivo(Node raiz) {
        if (raiz != null) {
            inOrderRecursivo(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            inOrderRecursivo(raiz.direita);
        }
    }
    
    public void preOrder() {
        preOrderRecursivo(raiz);
        System.out.println();
    }
    
    private void preOrderRecursivo(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrderRecursivo(raiz.esquerda);
            preOrderRecursivo(raiz.direita);
        }
    }
    
    public void postOrder() {
        postOrderRecursivo(raiz);
        System.out.println();
    }
    
    private void postOrderRecursivo(Node raiz) {
        if (raiz != null) {
            postOrderRecursivo(raiz.esquerda);
            postOrderRecursivo(raiz.direita);
            System.out.print(raiz.valor + " ");
        }
    }
}
