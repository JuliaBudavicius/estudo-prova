public class Professor implements IBonus {
    // Atributos
    private String nome;
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    // Constructor
    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    // toString
    @Override
    public String toString() {
        return String.format("\nNome: %s" +
                "\nQuantidade de aulas por semana: %d" +
                "\nValor da hora aula: R$ %.2f" +
                "\nValor do bônus: R$ %.2f", nome, qtdAulasSemana, valorHoraAula, getValorBonus());
    }

    // Metodo
    @Override
    public Double getValorBonus() {
        return qtdAulasSemana * valorHoraAula * 4.5 * 0.15;
    }
}
