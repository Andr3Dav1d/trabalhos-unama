package heranca.questao4;

public class Main {
    public static void main(String[] args) {
        Veiculo arrayVeiculo[] = {
            new Carro("Hyundai","HB20", 4),
            new Carro("Toyota","Hilux SW4",4),
            new Moto("Honda", "CB500", 500),
            new Moto("Yamaha","MT07",689)
        };

        for (Veiculo veiculo : arrayVeiculo) {
            veiculo.exibirInfo();
        }
        
    }
}
