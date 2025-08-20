package ProjetoCarro;

import javax.sound.sampled.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

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

    void tocarWav() {
    try {
        InputStream recurso = Carro.class.getResourceAsStream("ligandoCarro.wav");

        if (recurso == null) {
            recurso = new FileInputStream("ligandoCarro.wav");
        }

        try (BufferedInputStream bis = new BufferedInputStream(recurso);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(bis)) {

            AudioFormat baseFormat = audioStream.getFormat();
            AudioFormat decodedFormat = new AudioFormat(
                    AudioFormat.Encoding.PCM_SIGNED,
                    baseFormat.getSampleRate(),
                    16,
                    baseFormat.getChannels(),
                    baseFormat.getChannels() * 2,
                    baseFormat.getSampleRate(),
                    false
            );

            try (AudioInputStream decodedStream = AudioSystem.getAudioInputStream(decodedFormat, audioStream);
                 SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, decodedFormat))) {

                line.open(decodedFormat);
                line.start();

                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = decodedStream.read(buffer)) != -1) {
                    line.write(buffer, 0, bytesRead);
                }

                line.drain();
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    void ligarCarro(boolean som) {
        System.out.printf("Ligando %s %s %d...\n", this.marca, this.modelo, this.ano);
        if (som) tocarWav();
        System.out.println("Carro Ligado!");
    }

}