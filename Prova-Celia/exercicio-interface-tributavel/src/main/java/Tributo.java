import java.util.ArrayList;
import java.util.List;

public class Tributo {
    // Atributo
    private List<Tributavel> tributos;

    // Constructor
    public Tributo() {
        tributos = new ArrayList<>();
    }

    // Metodos
    public void adicionaTributavel(Tributavel t) {
        tributos.add(t);
        System.out.println("\n(!) Tributavel adicionado com sucesso!");
    }

    public Double calculaTributoTotal() {
        Double total = 0.0;
        for (Tributavel t : tributos) {
            total += t.getValorTributo();
        }
        return total;
    }
}
