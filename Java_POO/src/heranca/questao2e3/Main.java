package heranca.questao2e3;

public class Main {
    public static void main(String[] args) {
        Fornecedor andre = new Fornecedor(
            "André David",
            "Rua Java, 25",
            "(21) 4002-8922",
            1500,
            200
        );

        System.out.println("== Acessando saldo ==");
        andre.obterSaldo();

        System.out.println("== Acessando atributos da classe \"Pessoa\" ==");

        System.out.println(andre.getNome());
        System.out.println(andre.getEndereco());
        System.out.println(andre.getTelefone());
    }
}
