package questao4;

public class Fila {
    private int[] elementos;
    private int frente, tras, tamanho, capacidade;

    public Fila (int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.tras = 0;
        this.tamanho = 0;
    }

    private boolean isFull () {
        return tamanho == capacidade; 
    }

    private boolean isEmpty () { 
        return tamanho == 0;
    }

    public void enqueue (int valor) {
        if (isFull()) {
            System.out.println("A fila está cheia.");
        } else {
            elementos[tras] = valor;
            tras = (tras + 1) % capacidade;
            tamanho++; 
            System.out.println("O elemento %d foi adicionado à fila.".formatted(valor));
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Não há elementos para remover");
        }
        int valor = elementos[frente];
        frente = (frente + 1) % capacidade;  // Fila circular
        tamanho--;
        System.out.println("O elemento %d foi removido da fila.".formatted(valor));
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Não há elementos para visualizar");
        } else {
            int valor = elementos[frente];
            System.out.println("O primeiro elemento da fila é: " + valor);
        }
    }
}
