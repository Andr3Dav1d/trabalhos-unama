package encapsulamento.projpessoa1;

public class Main {
    public static void printPessoa (Pessoa obj) {
        System.out.println("-------[Informações da Pessoa]--------");
        System.out.println("Nome: " + obj.nome);
        System.out.println("Idade: " + obj.idade);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("André", 18);
        Pessoa obj2 = new Pessoa("Pedro", 21);
        
        printPessoa(obj1);
        printPessoa(obj2);
    }
}
