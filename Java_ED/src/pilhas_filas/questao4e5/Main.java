package pilhas_filas.questao4e5;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n== PILHA ==");
        Pilha pilha_inteiros = new Pilha(5);

        pilha_inteiros.push(10);
        pilha_inteiros.push(24);
        pilha_inteiros.push(35);

        pilha_inteiros.peek();

        pilha_inteiros.pop();
        pilha_inteiros.pop();
        pilha_inteiros.pop();

        pilha_inteiros.peek();
        System.out.println("==============");

        System.out.println("\n== FILA ==");
        Fila fila_inteiros = new Fila(5);

        fila_inteiros.enqueue(18);
        fila_inteiros.enqueue(20);
        fila_inteiros.enqueue(22);

        fila_inteiros.peek();

        fila_inteiros.dequeue();
        fila_inteiros.dequeue();
        fila_inteiros.dequeue();

        fila_inteiros.peek();
        System.out.println("============");
    }
}
