public class AlunoPos extends Aluno{

    //Atributos
    private Double nota1;
    private Double nota2;
    private Double notaMonografica;

    //Construtor
    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografica) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografica = notaMonografica;
    }

    //Método calcMedia
    public Double calcMedia(){
        Double mediaPos = ((nota1 + nota2 + notaMonografica));
        return mediaPos;
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "\nAluno Pós Graduação: %s" +
                        "\nNota 1: %.2f" +
                        "\nNota 2: %.2f" +
                        "\nMédia: %.2f", super.toString(),nota1, nota2, notaMonografica);
    }

    //Getter and Setter
    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNotaMonografica() {
        return notaMonografica;
    }

    public void setNotaMonografica(Double notaMonografica) {
        this.notaMonografica = notaMonografica;
    }
}
