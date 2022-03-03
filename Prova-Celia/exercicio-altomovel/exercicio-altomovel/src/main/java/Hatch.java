public class Hatch extends Carro{

    //Contrutor
    public Hatch(String nome, String placa, Boolean usado, String marca, Double valor, String tipo) {
        super(nome, placa, usado, marca, valor, tipo);
    }

    //Método IPVA
    public Double getValorIPVA() {
        Double hatchIPVA = 0.0;
        hatchIPVA = getValor() * 0.16;
        return hatchIPVA;
    }

    //toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nValor do IPVA %.2f",super.toString(), getValorIPVA());
    }
}
