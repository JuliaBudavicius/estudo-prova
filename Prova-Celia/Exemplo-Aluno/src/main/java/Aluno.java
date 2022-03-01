public abstract class Aluno {

    //Atributos
    private Integer ra;
    private String nome;

    //Construtor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //Método para calcular a média
    public abstract Double calcMedia();

    //toString
    @Override
    public String toString() {
        return String.format(
                "\nRa: " + ra +
                "\nNome:" + nome
        );
    }

    //Getter and Setter
    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
