package classes_objetos.projeto_carro;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;

public class Carro {
    String marca, modelo;
    int ano;

    public Carro (String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void mostrarInformacoes () {
        System.out.println("----------CARRO----------");
        System.out.printf("Nome de referência: %s %s %d\n", this.marca, this.modelo, this.ano);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("-------------------------");
    }

    public void tocarWav() throws UnsupportedAudioFileException {
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

            try (SourceDataLine line = (SourceDataLine) AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, decodedFormat))) {
                line.open(decodedFormat);
                line.start();

                byte[] buffer = new byte[8192];
                int bytesRead;
                while ((bytesRead = audioStream.read(buffer)) != -1) {
                    line.write(buffer, 0, bytesRead);
                }

                line.drain();
            }
        }
    } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
    }
}


    public void ligarCarro(boolean som) throws UnsupportedAudioFileException {
        System.out.printf("Ligando %s %s %d...\n", this.marca, this.modelo, this.ano);
        if (som) tocarWav();
        System.out.println("Carro Ligado!");
    }

}