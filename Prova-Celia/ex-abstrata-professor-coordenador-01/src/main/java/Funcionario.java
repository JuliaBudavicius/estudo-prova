public abstract class Funcionario {
    // Atributo
    private String nome;

    // Constructor
    public Funcionario(String nome) {
        this.nome = nome;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Nome: %s", nome);
    }

    // Metodo
    public Double getValorBonus() {
        return 0.0;
    }
}
