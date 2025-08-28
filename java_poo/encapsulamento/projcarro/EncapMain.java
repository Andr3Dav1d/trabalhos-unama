package encapsulamento.projcarro;

public class EncapMain {
    public static void main(String[] args) {
        EncapCarro fiatUno = new EncapCarro("Fiat Uno", 2010);
        System.out.println("Modelo do Carro: %s; Ano: %d".formatted(fiatUno.getMarca(), fiatUno.getAno()));
    }
}