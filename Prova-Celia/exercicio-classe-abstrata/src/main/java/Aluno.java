abstract class Aluno {
    // Atributos
    Integer ra;
    String nome;

    // Constructor
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return String.format("RA: %d" +
                "\nNome: %s", ra, nome);
    }

    // Metodo
    public abstract Double calculaMedia();

    // Getters & Setters
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
