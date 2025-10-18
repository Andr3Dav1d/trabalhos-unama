package pilhas_filas.questao1;
public class Main {
    public static void main(String[] args) {
        Pilha<Integer> pilhaNumeros = new Pilha<>();
        Fila<Integer> filaNumeros = new Fila<>();

        System.out.println();
        System.out.println("****** PILHA ******");
        System.out.println("== Empilhando elementos 10, 20, 30, 40, 50 e imprimindo ==");
        pilhaNumeros.empilhar(10);
        pilhaNumeros.empilhar(20);
        pilhaNumeros.empilhar(30);
        pilhaNumeros.empilhar(40);
        pilhaNumeros.empilhar(50);
        pilhaNumeros.verElementos();
        System.out.println("== Desempilhando dois números e imprimindo novamente ==");
        pilhaNumeros.desempilhar();
        pilhaNumeros.desempilhar();
        pilhaNumeros.verElementos();
        System.out.println("*******************");

        System.out.println();
        System.out.println("******* FILA *******");
        System.out.println("== Enfileirando elementos 10, 20, 30, 40, 50 e imprimindo ==");
        filaNumeros.enfileirar(10);
        filaNumeros.enfileirar(20);
        filaNumeros.enfileirar(30);
        filaNumeros.enfileirar(40);
        filaNumeros.enfileirar(50);
        filaNumeros.verElementos();
        System.out.println("== Desenfileirando dois elementos e imprimindo novamente ==");
        filaNumeros.desenfileirar();
        filaNumeros.desenfileirar();
        filaNumeros.verElementos();
        System.out.println("********************");

    }
}