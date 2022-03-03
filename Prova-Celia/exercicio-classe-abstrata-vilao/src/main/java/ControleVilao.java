import java.util.ArrayList;
import java.util.List;

public class ControleVilao {
    // Atributo
    private List<Vilao> viloes;

    // Constructor
    public ControleVilao() {
        viloes = new ArrayList<>();
    }

    // Metodo
    public void adicionaVilao(Vilao v) {
        viloes.add(v);
        String msm = String.format("\n(!) %s adicionado(a) com sucesso >:)", v.getNome());
        System.out.println(msm);
    }

    public void exibeConteudo() {
        for(Vilao v : viloes) {
            System.out.println(v);
        }
    }

    public Double calculaTotalForca() {
        Double total = 0.0;
        for(Vilao v : viloes) {
            total += v.adicionarForca();
        }
        return total;
    }

}
