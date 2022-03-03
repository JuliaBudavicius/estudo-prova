public class SUV extends Carro{

    //Contrutor
    public SUV(String nome, String placa, Boolean usado, String marca, Double valor, String tipo) {
        super(nome, placa, usado, marca, valor, tipo);
    }

    //Método Bonus
    public Double getValorIPVA() {
        Double suvIPVA = 0.0;
        suvIPVA = getValor() * 0.14;
        return suvIPVA;
    }

    //toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nValor do IPVA %.2f",super.toString(), getValorIPVA());
    }
}
