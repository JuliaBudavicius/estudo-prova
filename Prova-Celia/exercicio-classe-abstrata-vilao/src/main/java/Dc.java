public class Dc extends Vilao{
    // Atributos
    private Integer qtdCaixasMaternas;

    // Constructor
    public Dc(String nome, Integer forca, String heroiInimigo, String planetaOrigem, Integer qtdCaixasMaternas) {
        super(nome, forca, heroiInimigo, planetaOrigem);
        this.qtdCaixasMaternas = qtdCaixasMaternas;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nQuantidade de Caixas Maternas: %d" +
                "\nForça Adicionada: %.2f", super.toString(), qtdCaixasMaternas, adicionarForca());
    }

    // Metodo
    @Override
    public Double adicionarForca() {
        return qtdCaixasMaternas * 500.0;
    }
}
