public abstract class Produto implements Vendavel {
    // Atributos
    private Integer codigo;
    private Double precoCusto;
    private String nome;

    // Constructor
    public Produto(Integer codigo, Double precoCusto, String nome) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Código: %d" +
                "\nPreço de custo: R$ %.2f" +
                "\nNome: %s", codigo, precoCusto, nome);
    }

    // Getters and Setters
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
