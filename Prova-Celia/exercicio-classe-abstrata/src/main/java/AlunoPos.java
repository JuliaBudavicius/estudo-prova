public class AlunoPos extends Aluno{
    // Atributos
    Double nota1;
    Double nota2;
    Double notaMonografia;

    // Constructor
    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s" +
                "\nNota 1: %.1f" +
                "\nNota 2: %.1f" +
                "\nNota Monografia: %.1f" +
                "\nMédia: %.1f", super.toString(), nota1, nota2, notaMonografia, calculaMedia());
    }

    // Metodo
    public Double calculaMedia() {
        return (nota1 + nota2 + notaMonografia) / 3;
    }
}
