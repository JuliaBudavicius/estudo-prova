import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    // Atributo
    private List<IBonus> bonus;

    public ControleBonus() {
        bonus = new ArrayList<>();
    }

    // Metodos
    public void adicionaProfessor(IBonus b) {
        System.out.println("\n(!) Professor adicionado com sucesso!");
        bonus.add(b);
    }

    public void exibeConteudo() {
        for(IBonus b : bonus) {
            System.out.println(b);
        }
    }

    public Double calculaBonus() {
        Double total = 0.0;
        for(IBonus b : bonus) {
            total += b.getValorBonus();
        }

        return total;
    }
}
