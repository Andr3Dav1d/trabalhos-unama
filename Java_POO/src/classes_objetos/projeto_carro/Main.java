package classes_objetos.projeto_carro;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException {

        // Criando dois objetos && Alterando os atributos
        Carro carro1 = new Carro("BMW", "X7", 2024);
        Carro carro2 = new Carro("Fiat", "Uno", 2010);

        // Exibir os valores na tela
        carro1.mostrarInformacoes();
        carro2.mostrarInformacoes();

        // Ligar o carro (Apenas o Fiat Uno sairá o som)
        carro1.ligarCarro(false);
        carro2.ligarCarro(true);
    }
}