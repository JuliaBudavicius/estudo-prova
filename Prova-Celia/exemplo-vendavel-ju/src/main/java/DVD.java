public class DVD extends Produto{

    //Atributos
    private String nome;
    private String gravadora;

    //Construtor
    public DVD(int codigo, double precoCusco, String nome, String gravadora) {
        super(codigo, precoCusco);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    //Método
    //Preço de custo mais 20%
    //Tem que sobrescrever o método : Ctrl + O
    @Override
    public double getValorVenda() {
        return getPrecoCusco() + (getPrecoCusco() * 0.20);
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "\nCódigo: %d" +
                "\nPreço de Custo: %.2f" +
                "\nNome: %s" +
                "\nGravadora: %s", getCodigo(), getPrecoCusco(), nome, gravadora
        );
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
