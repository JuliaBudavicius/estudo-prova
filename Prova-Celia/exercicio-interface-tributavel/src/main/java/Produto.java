public abstract class Produto implements Tributavel {
    // Atributo
    private Integer codigo;
    private String descricao;
    private Double preco;

    // Constructor
    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Código: %d" +
                "\nDescrição: %s" +
                "\nPreço: R$ %.2f", codigo, descricao, preco);
    }

    // Getter
    public Double getPreco() {
        return preco;
    }
}
