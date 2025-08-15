import javax.swing.*;

public class AppBanco {
    public static void main(String[] args) {
        // Executar a aplicação na Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
}
