# Banco Digital - Simulador de App Bancário

Um simulador de aplicativo bancário desenvolvido em Java com interface gráfica minimalista usando Swing.

## Características

- **Interface Gráfica Minimalista**: Design limpo e intuitivo
- **Sistema de Login**: Autenticação com número da conta e senha
- **Cadastro de Novas Contas**: Criação de contas bancárias
- **Operações Bancárias**:
  - Depósito
  - Saque
  - Consulta de saldo
- **Validações de Segurança**: Verificação de senha e saldo

## Arquivos do Projeto

- `AppBanco.java` - Classe principal que inicia a aplicação
- `ContaBancaria.java` - Modelo da conta bancária com operações básicas
- `BancoDados.java` - Simulador de banco de dados em memória
- `TelaLogin.java` - Interface de login do usuário
- `TelaCadastro.java` - Interface para criar novas contas
- `TelaPrincipal.java` - Interface principal com operações bancárias

## Como Executar

1. **Compilar o projeto**:

   ```bash
   javac *.java
   ```

2. **Executar a aplicação**:
   ```bash
   java AppBanco
   ```

## Contas de Teste

O sistema vem com algumas contas pré-cadastradas para teste:

| Número da Conta | Titular        | Senha | Saldo Inicial |
| --------------- | -------------- | ----- | ------------- |
| 12345           | João Silva     | 1234  | R$ 1.500,00   |
| 67890           | Maria Santos   | 5678  | R$ 2.300,50   |
| 11111           | Pedro Oliveira | 0000  | R$ 500,00     |

## Funcionalidades

### Tela de Login

- Autenticação com número da conta e senha
- Opção para criar nova conta
- Validação de credenciais

### Criação de Conta

- Cadastro de número da conta único
- Nome do titular
- Senha com confirmação
- Validações de campos obrigatórios

### Operações Bancárias

- **Depósito**: Adicionar dinheiro à conta
- **Saque**: Retirar dinheiro (verificação de saldo)
- **Consulta**: Visualizar saldo atual
- **Sair**: Retornar à tela de login

## Requisitos

- Java 8 ou superior
- Sistema operacional com suporte a interface gráfica (Windows, Linux, macOS)

## Tecnologias Utilizadas

- **Java**: Linguagem de programação
- **Swing**: Framework para interface gráfica
- **AWT**: Bibliotecas adicionais para interface

## Estrutura do Código

O projeto segue uma estrutura orientada a objetos com separação clara de responsabilidades:

- **Modelo**: `ContaBancaria` - Lógica de negócio
- **Persistência**: `BancoDados` - Gerenciamento de dados
- **Visão**: Classes `Tela*` - Interface com o usuário
- **Controle**: Integrado nas classes de interface

## Melhorias Futuras

- Persistência em arquivo ou banco de dados real
- Histórico de transações
- Transferências entre contas
- Diferentes tipos de conta (poupança, corrente)
- Criptografia de senhas
- Interface web ou mobile
