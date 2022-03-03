public class Perfume extends Produto {
    // Atributos
    private String fragrancia;

    // Constructor
    public Perfume(Integer codigo, String descricao, Double preco, String fragancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragancia;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s" +
                "\nFragrância: %s" +
                "\nTributo: R$ %.2f", super.toString(), fragrancia, getValorTributo());
    }

    // Metodo
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }
}
