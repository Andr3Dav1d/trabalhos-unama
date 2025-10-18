package arvores.arvore_binaria_busca;

public class Node {
    int valor;
    Node esquerda, direita;
    
    public Node(int item) {
        valor = item;
        esquerda = direita = null;
    }
}
