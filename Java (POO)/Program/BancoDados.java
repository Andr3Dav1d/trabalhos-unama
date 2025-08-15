import java.util.HashMap;
import java.util.Map;

public class BancoDados {
    private static Map<String, ContaBancaria> contas = new HashMap<>();
    
    static {
        // Contas de exemplo para teste
        contas.put("12345", new ContaBancaria("12345", "João Silva", "1234", 1500.00));
        contas.put("67890", new ContaBancaria("67890", "Maria Santos", "5678", 2300.50));
        contas.put("11111", new ContaBancaria("11111", "Pedro Oliveira", "0000", 500.00));
    }
    
    public static ContaBancaria buscarConta(String numeroConta) {
        return contas.get(numeroConta);
    }
    
    public static boolean criarConta(String numeroConta, String titular, String senha) {
        if (!contas.containsKey(numeroConta)) {
            contas.put(numeroConta, new ContaBancaria(numeroConta, titular, senha));
            return true;
        }
        return false;
    }
    
    public static boolean existeConta(String numeroConta) {
        return contas.containsKey(numeroConta);
    }
}
