public class Livro extends Produto{

    //Atributos
    private String nome;
    private String autor;
    private String isbn;

    //Construtor
    public Livro(int codigo, double precoCusco, String nome, String autor, String isbn) {
        super(codigo, precoCusco);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Método
    //Preço de custo mais 10%
    //Tem que sobrescrever o método : Ctrl + O
    @Override
    public double getValorVenda() {
        return getPrecoCusco() + (getPrecoCusco() * 0.10);
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "Código: %d" +
                "\nPreço de Custo: %.2f" +
                "\nNome: %s" +
                "\nAutor: %s" +
                "\nISBS: %s"
                , getCodigo(), getPrecoCusco(), nome, autor, isbn
        );
    }

    //Getter ans Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
