import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JDialog {
    private JTextField campoNumero;
    private JTextField campoTitular;
    private JPasswordField campoSenha;
    private JPasswordField campoConfirmaSenha;
    private JButton botaoCriar;
    private JButton botaoCancelar;
    
    public TelaCadastro(TelaLogin parent) {
        super(parent, "Nova Conta", true);
        configurarJanela();
        criarComponentes();
        configurarLayout();
        configurarEventos();
    }
    
    private void configurarJanela() {
        setSize(450, 350);
        setLocationRelativeTo(getParent());
        setResizable(false);
    }
    
    private void criarComponentes() {
        campoNumero = new JTextField(15);
        campoTitular = new JTextField(15);
        campoSenha = new JPasswordField(15);
        campoConfirmaSenha = new JPasswordField(15);
        botaoCriar = new JButton("Criar Conta");
        botaoCancelar = new JButton("Cancelar");
        
        // Configurar aparência dos botões
        botaoCriar.setBackground(new Color(40, 167, 69));
        botaoCriar.setForeground(Color.WHITE);
        botaoCriar.setFocusPainted(false);
        
        botaoCancelar.setBackground(new Color(220, 53, 69));
        botaoCancelar.setForeground(Color.WHITE);
        botaoCancelar.setFocusPainted(false);
    }
    
    private void configurarLayout() {
        setLayout(new BorderLayout());
        
        // Painel principal
        JPanel painelPrincipal = new JPanel(new GridBagLayout());
        painelPrincipal.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Título
        JLabel titulo = new JLabel("CRIAR NOVA CONTA");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setForeground(new Color(40, 167, 69));
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
        
        // Nome do titular
        JLabel labelTitular = new JLabel("Nome do Titular:");
        labelTitular.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        painelPrincipal.add(labelTitular, gbc);
        
        gbc.gridx = 1; gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        painelPrincipal.add(campoTitular, gbc);
        
        // Senha
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        painelPrincipal.add(labelSenha, gbc);
        
        gbc.gridx = 1; gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        painelPrincipal.add(campoSenha, gbc);
        
        // Confirmar senha
        JLabel labelConfirma = new JLabel("Confirmar Senha:");
        labelConfirma.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        painelPrincipal.add(labelConfirma, gbc);
        
        gbc.gridx = 1; gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        painelPrincipal.add(campoConfirmaSenha, gbc);
        
        // Botões
        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.setBackground(Color.WHITE);
        painelBotoes.add(botaoCriar);
        painelBotoes.add(botaoCancelar);
        
        gbc.gridx = 0; gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 0, 0);
        painelPrincipal.add(painelBotoes, gbc);
        
        add(painelPrincipal, BorderLayout.CENTER);
    }
    
    private void configurarEventos() {
        botaoCriar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                criarConta();
            }
        });
        
        botaoCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
    
    private void criarConta() {
        String numero = campoNumero.getText().trim();
        String titular = campoTitular.getText().trim();
        String senha = new String(campoSenha.getPassword());
        String confirmaSenha = new String(campoConfirmaSenha.getPassword());
        
        // Validações
        if (numero.isEmpty() || titular.isEmpty() || senha.isEmpty() || confirmaSenha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!senha.equals(confirmaSenha)) {
            JOptionPane.showMessageDialog(this, "As senhas não coincidem!", "Erro", JOptionPane.ERROR_MESSAGE);
            campoSenha.setText("");
            campoConfirmaSenha.setText("");
            return;
        }
        
        if (senha.length() < 4) {
            JOptionPane.showMessageDialog(this, "A senha deve ter pelo menos 4 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (BancoDados.existeConta(numero)) {
            JOptionPane.showMessageDialog(this, "Já existe uma conta com este número!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Criar a conta
        if (BancoDados.criarConta(numero, titular, senha)) {
            JOptionPane.showMessageDialog(this, "Conta criada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao criar conta. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
