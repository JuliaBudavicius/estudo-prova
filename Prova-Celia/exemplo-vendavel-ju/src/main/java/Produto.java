public abstract class Produto implements Vendavel {

    //Atributos
    private int codigo;
    private double precoCusco;

    //Construtor
    public Produto(int codigo, double precoCusco) {
        this.codigo = codigo;
        this.precoCusco = precoCusco;
    }

    //Método
    public abstract double getValorVenda();




    //toString
    @Override
    public String toString() {
        return String.format(
                "Código: %d" +
                "\nPreço de Custo: %.2f", codigo, precoCusco
        );
    }

    //Getter and Setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecoCusco() {
        return precoCusco;
    }

    public void setPrecoCusco(double precoCusco) {
        this.precoCusco = precoCusco;
    }
}
