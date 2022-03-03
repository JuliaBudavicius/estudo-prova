public class Coordenador extends Professor {
    // Atributos
    private Integer qtdHorasCoord;
    private Double valorHoraCoord;

    // Constructor
    public Coordenador(String nome, Integer qtdAulasSemana, Double valorHoraAula, Integer qtdHorasCoord, Double valorHoraCoord) {
        super(nome, qtdAulasSemana, valorHoraAula);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\n%s" +
                "\nQuantidade de horas de coordenação: %d" +
                "\nValor da hora de coordenação: R$ %.2f", super.toString(), qtdHorasCoord, valorHoraCoord);
    }

    // Metodo
    @Override
    public Double getValorBonus() {
        return super.getValorBonus() + (qtdHorasCoord * valorHoraCoord) * 4.5 * 0.2;
    }
}
