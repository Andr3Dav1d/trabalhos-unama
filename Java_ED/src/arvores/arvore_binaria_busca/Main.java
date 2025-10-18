package arvores.arvore_binaria_busca;

public class Main {
    public static void main(String[] args) {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
        
        
        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);
        
        System.out.println("Percurso In-Order:");
        arvore.inOrder();
        
        System.out.println("Percurso Pre-Order:");
        arvore.preOrder();
        
        System.out.println("Percurso Post-Order:");
        arvore.postOrder();
        
        
        System.out.println("\nBuscando 40: " + arvore.buscar(40));
        System.out.println("Buscando 90: " + arvore.buscar(90));
        
        
        System.out.println("\nRemovendo 20...");
        arvore.remover(20);
        System.out.println("In-Order após remoção:");
        arvore.inOrder();
        
        System.out.println("Removendo 30...");
        arvore.remover(30);
        System.out.println("In-Order após remoção:");
        arvore.inOrder();
        
        System.out.println("Removendo 50...");
        arvore.remover(50);
        System.out.println("In-Order após remoção:");
        arvore.inOrder();
    }
}