public class Conversivel extends Carro {

    //Contrutor
    public Conversivel(String nome, String placa, Boolean usado, String marca, Double valor, String tipo) {
        super(nome, placa, usado, marca, valor, tipo);
    }

    //Método do IPVA
    public Double getValorIPVA() {
        Double conversivelIPVA = 0.0;
        conversivelIPVA = getValor() * 0.12;
        return conversivelIPVA;
    }

    //toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nValor do IPVA %.2f",super.toString(), getValorIPVA());
    }
}
