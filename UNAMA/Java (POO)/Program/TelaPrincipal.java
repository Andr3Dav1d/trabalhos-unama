import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TelaPrincipal extends JFrame {
    private ContaBancaria conta;
    private JLabel labelSaldo;
    private JLabel labelTitular;
    private JTextField campoValor;
    private JButton botaoDepositar;
    private JButton botaoSacar;
    private JButton botaoConsultar;
    private JButton botaoSair;
    private DecimalFormat formatoMoeda;
    
    public TelaPrincipal(ContaBancaria conta) {
        this.conta = conta;
        this.formatoMoeda = new DecimalFormat("R$ #,##0.00");
        configurarJanela();
        criarComponentes();
        configurarLayout();
        configurarEventos();
        atualizarSaldo();
    }
    
    private void configurarJanela() {
        setTitle("Banco Digital - Conta: " + conta.getNumeroConta());
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    private void criarComponentes() {
        labelTitular = new JLabel("Titular: " + conta.getTitular());
        labelTitular.setFont(new Font("Arial", Font.BOLD, 16));
        
        labelSaldo = new JLabel();
        labelSaldo.setFont(new Font("Arial", Font.BOLD, 24));
        labelSaldo.setForeground(new Color(40, 167, 69));
        
        campoValor = new JTextField(15);
        campoValor.setFont(new Font("Arial", Font.PLAIN, 14));
        
        botaoDepositar = new JButton("Depositar");
        botaoSacar = new JButton("Sacar");
        botaoConsultar = new JButton("Consultar Saldo");
        botaoSair = new JButton("Sair");
        
        // Configurar aparência dos botões
        botaoDepositar.setBackground(new Color(40, 167, 69));
        botaoDepositar.setForeground(Color.WHITE);
        botaoDepositar.setFocusPainted(false);
        botaoDepositar.setPreferredSize(new Dimension(120, 35));
        
        botaoSacar.setBackground(new Color(255, 193, 7));
        botaoSacar.setForeground(Color.BLACK);
        botaoSacar.setFocusPainted(false);
        botaoSacar.setPreferredSize(new Dimension(120, 35));
        
        botaoConsultar.setBackground(new Color(0, 123, 255));
        botaoConsultar.setForeground(Color.WHITE);
        botaoConsultar.setFocusPainted(false);
        botaoConsultar.setPreferredSize(new Dimension(120, 35));
        
        botaoSair.setBackground(new Color(220, 53, 69));
        botaoSair.setForeground(Color.WHITE);
        botaoSair.setFocusPainted(false);
        botaoSair.setPreferredSize(new Dimension(120, 35));
    }
    
    private void configurarLayout() {
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);
        
        // Painel superior - informações da conta
        JPanel painelSuperior = new JPanel(new BorderLayout());
        painelSuperior.setBackground(new Color(248, 249, 250));
        painelSuperior.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel painelInfo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painelInfo.setBackground(new Color(248, 249, 250));
        painelInfo.add(labelTitular);
        
        JPanel painelSaldo = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelSaldo.setBackground(new Color(248, 249, 250));
        
        JLabel labelTextoSaldo = new JLabel("Saldo Atual:");
        labelTextoSaldo.setFont(new Font("Arial", Font.PLAIN, 14));
        painelSaldo.add(labelTextoSaldo);
        painelSaldo.add(labelSaldo);
        
        painelSuperior.add(painelInfo, BorderLayout.NORTH);
        painelSuperior.add(painelSaldo, BorderLayout.CENTER);
        
        // Painel central - operações
        JPanel painelCentral = new JPanel(new GridBagLayout());
        painelCentral.setBackground(Color.WHITE);
        painelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Título operações
        JLabel tituloOperacoes = new JLabel("OPERAÇÕES BANCÁRIAS");
        tituloOperacoes.setFont(new Font("Arial", Font.BOLD, 18));
        tituloOperacoes.setForeground(new Color(0, 123, 255));
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 20, 0);
        painelCentral.add(tituloOperacoes, gbc);
        
        // Campo valor
        JLabel labelValor = new JLabel("Valor (R$):");
        labelValor.setFont(new Font("Arial", Font.PLAIN, 14));
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.insets = new Insets(5, 0, 5, 10);
        gbc.anchor = GridBagConstraints.EAST;
        painelCentral.add(labelValor, gbc);
        
        gbc.gridx = 1; gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        painelCentral.add(campoValor, gbc);
        
        // Botões de operação
        JPanel painelBotoes = new JPanel(new GridLayout(2, 2, 10, 10));
        painelBotoes.setBackground(Color.WHITE);
        painelBotoes.add(botaoDepositar);
        painelBotoes.add(botaoSacar);
        painelBotoes.add(botaoConsultar);
        painelBotoes.add(botaoSair);
        
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(20, 0, 0, 0);
        gbc.anchor = GridBagConstraints.CENTER;
        painelCentral.add(painelBotoes, gbc);
        
        add(painelSuperior, BorderLayout.NORTH);
        add(painelCentral, BorderLayout.CENTER);
    }
    
    private void configurarEventos() {
        botaoDepositar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarDeposito();
            }
        });
        
        botaoSacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realizarSaque();
            }
        });
        
        botaoConsultar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarSaldo();
                JOptionPane.showMessageDialog(TelaPrincipal.this, 
                    "Saldo atual: " + formatoMoeda.format(conta.consultarSaldo()), 
                    "Consulta de Saldo", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(TelaPrincipal.this, 
                    "Deseja realmente sair?", 
                    "Confirmar Saída", 
                    JOptionPane.YES_NO_OPTION);
                
                if (resposta == JOptionPane.YES_OPTION) {
                    dispose();
                    new TelaLogin().setVisible(true);
                }
            }
        });
    }
    
    private void realizarDeposito() {
        try {
            String valorTexto = campoValor.getText().trim().replace(",", ".");
            double valor = Double.parseDouble(valorTexto);
            
            if (conta.depositar(valor)) {
                atualizarSaldo();
                JOptionPane.showMessageDialog(this, 
                    "Depósito realizado com sucesso!\nValor: " + formatoMoeda.format(valor), 
                    "Depósito", 
                    JOptionPane.INFORMATION_MESSAGE);
                campoValor.setText("");
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Valor inválido para depósito!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Digite um valor numérico válido!", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void realizarSaque() {
        try {
            String valorTexto = campoValor.getText().trim().replace(",", ".");
            double valor = Double.parseDouble(valorTexto);
            
            if (conta.sacar(valor)) {
                atualizarSaldo();
                JOptionPane.showMessageDialog(this, 
                    "Saque realizado com sucesso!\nValor: " + formatoMoeda.format(valor), 
                    "Saque", 
                    JOptionPane.INFORMATION_MESSAGE);
                campoValor.setText("");
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Saldo insuficiente ou valor inválido!", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "Digite um valor numérico válido!", 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void atualizarSaldo() {
        labelSaldo.setText(formatoMoeda.format(conta.consultarSaldo()));
    }
}
