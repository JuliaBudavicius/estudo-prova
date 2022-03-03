public class AlunoGraduacao extends Aluno{
    // Atributo
    Double nota1;
    Double nota2;

    // Constructor
    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return String.format("%s" +
                "\nNota 1: %.1f" +
                "\nNota 2: %.1f" +
                "\nMédia: %.1f", super.toString(), nota1, nota2, calculaMedia());
    }

    // Metodo
    public Double calculaMedia() {
        return (nota1 * 0.4) + (nota2 * 0.6);
    }
}
