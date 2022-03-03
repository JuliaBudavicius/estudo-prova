public class Marvel extends Vilao{
    // Atributos
    private Integer qtdJoiasDoInfinito;

    // Constructor
    public Marvel(String nome, Integer forca, String heroiInimigo, String planetaOrigem, Integer qtdJoiasDoInfinito) {
        super(nome, forca, heroiInimigo, planetaOrigem);
        this.qtdJoiasDoInfinito = qtdJoiasDoInfinito;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nQuantidade de Joias do Infinito: %d" +
                "\nForça Adicionada: %.2f", super.toString(), qtdJoiasDoInfinito, adicionarForca());
    }

    // Metodo
    @Override
    public Double adicionarForca() {
        return qtdJoiasDoInfinito * 1000.0;
    }
}
