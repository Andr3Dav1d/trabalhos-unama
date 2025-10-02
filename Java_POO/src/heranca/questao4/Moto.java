package heranca.questao4;

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
        this.subAttribute = "Cilindradas: %d".formatted(cilindradas);
        this.tipo = "Moto";
    }

}