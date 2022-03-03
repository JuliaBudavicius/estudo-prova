import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    // Atributo
    List<Vendavel> vendaveis;

    // Constructor
    public Carrinho() {
        vendaveis = new ArrayList<>();
    }

    // Metodos
    public void adicionaVendavel(Vendavel v) {
        vendaveis.add(v);
        System.out.println("\n(!) Produto adicionado com sucesso!");
    }

    public Double calculaTotalVenda() {
        Double total = 0.0;
        for (Vendavel v : vendaveis) {
            total += v.getValorVendavel();
        }
        return total;
    }

    public void exibeItensCarrinho() {
        for (Vendavel v : vendaveis) {
            System.out.println(v);
        }
    }
}
