package encapsulamento.projpessoa2;

public class Main {
    public static void main(String[] args) {
        Endereco fiap = new Endereco("Avenida Paulista", 1106);
        Endereco alura = new Endereco("Rua Vergueiro", 3195);

        Pessoa andreDavid = new Pessoa("André David", 24, fiap);
        Pessoa pauloSilveira = new Pessoa("Paulo Silveira", 30, alura);

        andreDavid.mostrarDados();
        pauloSilveira.mostrarDados();
    }
}
