package Encapsulamento.ProjCarro;

public class Carro {
    private final String marca;
    private final int ano;

    Carro (String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public int getAno() {
        return ano;
    }
}
