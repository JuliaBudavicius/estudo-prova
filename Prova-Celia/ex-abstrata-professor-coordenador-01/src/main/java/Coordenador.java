public class Coordenador extends Funcionario {
    // Atributos
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;

    // Constructor
    public Coordenador(String nome, Integer qtdHorasCoord, Double valorHoraCoord) {
        super(nome);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    // toString
    @Override
    public String toString() {
        return String.format("== Coordenador ==" +
                "\n%s" +
                "\nQuantidade de Horas de Coordenação por Semana: %d" +
                "\nValor da Hora Coordenação: R$ %.2f" +
                "\nValor Bônus: R$ %.2f", super.toString(), qtdHorasCoord, valorHoraCoord, getValorBonus());
    }

    // Metodo
    @Override
    public Double getValorBonus() {
        return qtdHorasCoord * valorHoraCoord * 4.5 * 0.2;
    }
}
