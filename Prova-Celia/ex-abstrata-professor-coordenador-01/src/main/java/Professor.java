public class Professor extends Funcionario {
    // Atributos
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    // Constructor
    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        super(nome);
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    // toString
    @Override
    public String toString() {
        return String.format("== Professor ==" +
                "\n%s" +
                "\nQuantidade de Aulas por Semana: %d" +
                "\nValor da Hora Aula: R$ %.2f" +
                "\nValor Bônus: R$ %.2f", super.toString(), qtdAulasSemana, valorHoraAula, getValorBonus());
    }

    // Metodo
    @Override
    public Double getValorBonus() {
        return qtdAulasSemana * valorHoraAula * 4.5 * 0.15;
    }
}
