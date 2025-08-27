package Encapsulamento.ProjCarro;

public class Main {
    public static void main(String[] args) {
        Carro fiatUno = new Carro("Fiat Uno", 2010);
        System.out.println("Modelo do Carro: %s; Ano: %d".formatted(fiatUno.getMarca(), fiatUno.getAno()));
    }
}