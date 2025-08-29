package encapsulamento.projpessoa2;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public void mostrarDados () {
        System.out.println("----------PESSOA-----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: %d anos".formatted(this.idade));
        System.out.println("Endereço: %s, %s".formatted(this.endereco.getRua(), this.endereco.getNumero()));
        System.out.println("---------------------------");
    }
}
