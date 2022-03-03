public class Livro extends Produto {
    // Atributos
    private String autor;
    private String isbn;

    // Constructor
    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto, nome);
        this.autor = autor;
        this.isbn = isbn;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nAutor: %s" +
                "\nIsbn: %s" +
                "\nValor de venda: R$ %.2f", super.toString(), autor, isbn, getValorVendavel());
    }

    // Metodos
    public Double getValorVendavel() {
        return getPrecoCusto() * 1.10;
    }
}
