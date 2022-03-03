public class AlunoFundamental extends Aluno {
    // Atributos
    Double nota1;
    Double nota2;
    Double nota3;
    Double nota4;

    // Constructor
    public AlunoFundamental(Integer ra, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    // toString
    @Override
    public String toString() {
        return String.format("%s" +
                "\nNota 1: %.1f" +
                "\nNota 2: %.1f" +
                "\nNota 3: %.1f" +
                "\nNota 4: %.1f" +
                "\nMédia: %.1f", super.toString(), nota1, nota2, nota3, nota4, calculaMedia());
    }

    // Metodo
    public Double calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}
