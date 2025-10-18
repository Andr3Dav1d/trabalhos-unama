package pilhas_filas.questao1;
import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> fila = new LinkedList<T>();
    
    public void enfileirar (T elemento) {
        this.fila.addLast(elemento);
    }

    public void desenfileirar () {
        if (fila.size() == 0) {
            throw new Error("Essa fila não possui nenhum elemento.");
        } else {
            this.fila.removeFirst();
        }
    }

    public void verElementos () {
        System.out.print("Elementos na fila: ");
        for (int i = 0; i < fila.size(); i++) {
            String element = i == fila.size() - 1 ? "%s".formatted(fila.get(i)) : "%s <- ".formatted(fila.get(i)); 
            System.out.print(element);
        }
        
        System.out.println();
    }
}