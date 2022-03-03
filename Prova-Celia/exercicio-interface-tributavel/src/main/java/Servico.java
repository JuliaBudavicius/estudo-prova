public class Servico implements Tributavel {
    // Atributos
    private String descricao;
    private Double preco;

    // Constructor
    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Descrição: %s" +
                "\nPreço: R$ %.2f", descricao, preco);
    }

    // Metodo
    public Double getValorTributo() {
       return preco * 0.12;
    }
}
