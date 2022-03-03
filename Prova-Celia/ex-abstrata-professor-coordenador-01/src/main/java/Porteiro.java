public class Porteiro extends Funcionario {
    // Atributos
    private Integer qtdHorasTrab;
    private Double valorHoraTrab;

    // Constructor
    public Porteiro(String nome, Integer qtdHorasTrab, Double valorHoraTrab) {
        super(nome);
        this.qtdHorasTrab = qtdHorasTrab;
        this.valorHoraTrab = valorHoraTrab;
    }

    // toString
    @Override
    public String toString() {
        return String.format("== Porteiro ==" +
                "\n%s" +
                "\nQuantidade de Horas de Trabalho: %d" +
                "\nValor Hora de Trabalho: R$ %.2f", super.toString(), qtdHorasTrab, valorHoraTrab);
    }
}
