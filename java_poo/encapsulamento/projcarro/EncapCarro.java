package encapsulamento.projcarro;

public class EncapCarro {
    private final String marca;
    private final int ano;

    EncapCarro (String marca, int ano) {
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
