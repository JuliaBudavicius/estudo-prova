public class Alimento extends Produto {
    // Atributos
    private Integer quantVitamina;

    // Constructor
    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s" +
                "\nQuantidade de Vitamina: %d" +
                "\nTributo: R$ %.2f", super.toString(), quantVitamina, getValorTributo());
    }

    // Metodo
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }
}
