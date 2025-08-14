import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField campoNumero;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;
    private JButton botaoNovaC;
    
    public TelaLogin() {
        configurarJanela();
        criarComponentes();
        configurarLayout();
        configurarEventos();
    }
    
    private void configurarJanela() {
        setTitle("Banco Digital - Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void criarComponentes() {
        campoNumero = new JTextField(15);
        campoSenha = new JPasswordField(15);
        botaoEntrar = new JButton("Entrar");
        botaoNovaC = new JButton("Nova Conta");
        
        // Configurar aparência dos botões
        botaoEntrar.setBackground(new Color(0, 123, 255));
        botaoEntrar.setForeground(Color.WHITE);
        botaoEntrar.setFocusPainted(false);
        
        botaoNovaC.setBackground(new Color(108, 117, 125));
        botaoNovaC.setForeground(Color.WHITE);
        botaoNovaC.setFocusPainted(false);
    }
    
    private void configurarLayout() {
        setLayout(new BorderLayout());
        
        // Painel principal
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        painelPrincipal.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Título
        JLabel titulo = new JLabel("BANCO DIGITAL");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(new Color(0, 123, 255));
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 30, 0);
        painelPrincipal.add(titulo, gbc);
        
        // Número da conta
        JLabel labelNumero = new JLabel("Número da Conta:");
        labelNumero.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 0, 5, 10);
        gbc.anchor = GridBagConstraints.EAST;
        painelPrincipal.add(labelNumero, gbc);
        
        gbc.gridx = 1; gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painelPrincipal.add(campoNumero, gbc);
        
        // Senha
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        painelPrincipal.add(labelSenha, gbc);
        
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        painelPrincipal.add(campoSenha, gbc);
        
        // Botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.setBackground(Color.WHITE);
        painelBotoes.add(botaoEntrar);
        painelBotoes.add(botaoNovaC);
        
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 0, 0);
        painelPrincipal.add(painelBotoes, gbc);
        
        add(painelPrincipal, BorderLayout.CENTER);
    }
    
    private void configurarEventos() {
        botaoEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });
        
        botaoNovaC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirTelaCadastro();
            }
        });
        
        // Enter para fazer login
        campoSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });
    }
    
    private void realizarLogin() {
        String numero = campoNumero.getText().trim();
        String senha = new String(campoSenha.getPassword());
        
        if (numero.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        ContaBancaria conta = BancoDados.buscarConta(numero);
        
        if (conta != null && conta.verificarSenha(senha)) {
            // Login bem-sucedido
            this.dispose();
            new TelaPrincipal(conta).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Número da conta ou senha incorretos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
            campoSenha.setText("");
        }
    }
    
    private void abrirTelaCadastro() {
        new TelaCadastro(this).setVisible(true);
    }
}
