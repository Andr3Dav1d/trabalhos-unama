package ProjetoCarro;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Carro {
    String marca, modelo;
    int ano;

    Carro (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    void mostrarInformacoes () {
        System.out.println("----------CARRO----------");
        System.out.printf("Nome de referência: %s %s %d\n", this.marca, this.modelo, this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("-------------------------");
    }

    void tocarWav () {
        try {

        File somCarro = java.nio.file.Paths.get("ProjetoCarro", "ligandoCarro.wav").toFile();
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(somCarro);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        clip.start();

        Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException 
                 | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    void ligarCarro(boolean som) {
        System.out.printf("Ligando %s %s %d...\n", this.marca, this.modelo, this.ano);
        if (som) tocarWav();
        System.out.println("Carro Ligado!");
    }

}