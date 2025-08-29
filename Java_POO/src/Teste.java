class Objeto {
    String nome;

    Objeto() {
        System.out.println("Objeto vazio instanciado");
    }

    Objeto(String nome) {
        this.nome = nome;
        System.out.println("Objeto com nome %s instanciado.".formatted(nome));
    }
}

public class Teste {
    public static void main (String[] args) {
        new Objeto();
        new Objeto("André David");
                
    }
}
