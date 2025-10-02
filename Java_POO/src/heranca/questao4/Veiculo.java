package heranca.questao4;

public abstract class Veiculo {
    private String marca, modelo;
    protected String subAttribute, tipo;

    protected Veiculo (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo () {
        System.out.println("== Informações do veículo ==");
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println(subAttribute);
        System.out.println("============================");
    }
}