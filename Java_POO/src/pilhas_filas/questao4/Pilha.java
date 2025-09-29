package questao4;

public class Pilha {
    private int[] elementos;
    private int topo, capacidade;

    public Pilha (int tamanho) {
        this.capacidade = tamanho;
        this.elementos = new int[capacidade];
        this.topo = -1;

        System.out.println("Uma pilha com %d elementos foi criada.".formatted(capacidade));
    }

    private boolean isFull() { 
        return topo == capacidade - 1;
    }

    private boolean isEmpty () { 
        return topo == -1; 
    }

    public void push(int valor) {
        if (isFull()) {
            System.out.println("A pilha está cheia.");
        } else {
            elementos[++topo] = valor;
            System.out.println("O elemento %d foi adicionado à pilha.".formatted(valor));
        }
    }
    
    public void pop () {
        if(isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            int elementoRemovido = elementos[topo--];
            System.out.println("O elemento %d foi removido da pilha.".formatted(elementoRemovido));
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Elemento no topo: " + elementos[topo]);
        }
    }

}