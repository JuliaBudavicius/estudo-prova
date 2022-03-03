public class Servico implements Vendavel{
    // Atributos
    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    // Constructor
    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\nDescrição: %s" +
                "\nCódigo: %d" +
                "\nQuantidade de horas: %d" +
                "\nValor hora: R$ %.2f" +
                "\nValor de venda: R$ %.2f", descricao, codigo, quantHoras, valorHora, getValorVendavel());
    }

    // Metodo
    public Double getValorVendavel() {
        return quantHoras * valorHora;
    }

    // Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
