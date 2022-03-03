import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    //Atributo
    private List<Vendavel> vendavel = new ArrayList<>();

    //Construtor
    public Carrinho() {
    }

    //Métodos
    //Adicionar uma variável
    public void adicionaVendavel( Vendavel v){
       vendavel.add(v);
    }

    //Calcular o total da venda
    public double calculaTotalVenda(){
        Double valorTotal = 0.0;
        for (Vendavel v : vendavel){
            valorTotal += v.getValorVenda();
        }
        return valorTotal;
    }

    //Exibe carrinho
    public void exibeCarrinho(){
        for (Vendavel v : vendavel){
            System.out.println(v);
        }
        }
}
