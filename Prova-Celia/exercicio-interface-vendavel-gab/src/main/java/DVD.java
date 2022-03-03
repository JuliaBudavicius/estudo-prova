public class DVD extends Produto{
    // Atributos
    private String gravadora;

    // Constructor
    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto, nome);
        this.gravadora = gravadora;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nGravadora: %s" +
                "Valor de venda: R$ %.2f", super.toString(), gravadora, getValorVendavel());
    }

    // Metodo
    public Double getValorVendavel() {
       return getPrecoCusto() * 1.20;
    }
}
