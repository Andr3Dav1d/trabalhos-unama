package questao1;
import java.util.LinkedList;

public class Pilha<T> {
    private LinkedList<T> pilha = new LinkedList<T>();
    
    public void empilhar (T elemento) {
        this.pilha.addLast(elemento);
    }

    public void desempilhar () {
        if (pilha.size() == 0) {
            throw new Error("Essa pilha não possui nenhum elemento.");
        } else {
            this.pilha.removeLast();
        }
    }

    public void verElementos () {
        System.out.print("Elementos na pilha: ");
        for (int i = 0; i < pilha.size(); i++) {
            String element = i == pilha.size() - 1 ? "%s".formatted(pilha.get(i)) : "%s -> ".formatted(pilha.get(i)); 
            System.out.print(element);
        }
        
        System.out.println();
    }
}