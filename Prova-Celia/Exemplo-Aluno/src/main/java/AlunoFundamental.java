public class AlunoFundamental extends Aluno{

    //Atributos
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;

    //Contrsutor
    public AlunoFundamental(Integer ra, String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    //Método calcMedia
    public Double calcMedia(){
        Double mediaFund = ((nota1 + nota2 + nota3 + nota4) / 4);
        return mediaFund;
    }

    //toString


    @Override
    public String toString() {
        return String.format(
                "\nAluno Fundamental: %s" +
                "\nNota 1: %.2f" +
                "\nNota 2: %.2f" +
                "\nNota 3: %.2f" +
                "\nNota 4: %.2f" +
                "\nMédia: %.2f", super.toString(), nota1, nota2, nota3, nota4, calcMedia());
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

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getNota4() {
        return nota4;
    }

    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }
}
