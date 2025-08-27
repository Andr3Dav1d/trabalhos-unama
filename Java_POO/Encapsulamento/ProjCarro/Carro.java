package Encapsulamento.ProjCarro;

public class Carro {
    private String marca;
    private int ano;

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
