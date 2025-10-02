package heranca.questao4;

public class Carro extends Veiculo {
    int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
        this.subAttribute = "Portas: %d".formatted(quantidadePortas);
        this.tipo = "Carro";
    }

}