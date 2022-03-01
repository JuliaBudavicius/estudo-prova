public class AlunoGraduacao extends Aluno {

    //Atributos
    private Double nota1;
    private Double nota2;

    //Contrutor
    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //Método calcMedia
    public Double calcMedia(){
        Double mediaGrad = ((nota1 * 0.4) + (nota2 * 0.6));
        return mediaGrad;
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "\nAluno Graduação: %s" +
                "\nNota 1: " +
                "\nNota 2: " +
                "\nMédia : " , super.toString(), nota1, nota2, calcMedia());
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
}
