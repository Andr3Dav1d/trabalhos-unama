package revisao_av1.projFuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionario pedro = new Funcionario();
        pedro.setNome("Pedro");
        pedro.setMatricula(1);
        pedro.setSalario(2000);
        
        Funcionario andre = new Funcionario("André", 2, 5000);
        Funcionario luiz = new Funcionario("Luiz", 3, 3000);

        pedro.getSalario(true);
        andre.getSalario(true);
        luiz.getSalario(true);
        
        andre.setSalario(7000);
        pedro.setSalario(700);
        
        andre.getSalario(true);
        pedro.getSalario(true);
        
    }
}