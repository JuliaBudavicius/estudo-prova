import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    // Atributos
    List<Funcionario> funcionarios;

    // Constructor
    public ControleBonus() {
        funcionarios = new ArrayList<>();
    }

    // Metodos
    public void adicionaFuncionario(Funcionario f) {
        funcionarios.add(f);
        System.out.println("\n(!) Funcionario adicionado!");
    }

    public void exibeConteudo() {
        for(Funcionario f : funcionarios) {
            System.out.println("\n" + f);
        }
    }

    public Double calculaTotalBonus() {
        Double total = 0.0;
        for(Funcionario f : funcionarios) {
            total += f.getValorBonus();
        }
        return total;
    }
}
