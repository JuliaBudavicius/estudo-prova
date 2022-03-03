public abstract class Vilao {
    // Atributos
    private String nome;
    private Integer forca;
    private String heroiInimigo;
    private String planetaOrigem;

    // Constructor
    public Vilao(String nome, Integer forca, String heroiInimigo, String planetaOrigem) {
        this.nome = nome;
        this.forca = forca;
        this.heroiInimigo = heroiInimigo;
        this.planetaOrigem = planetaOrigem;
    }

    // toString
    @Override
    public String toString() {
        return String.format("Nome: %s" +
                "\nForça: %d" +
                "\nHéroi Inimigo: %s" +
                "\nPlaneta de Origem: %s", nome, forca ,heroiInimigo, planetaOrigem);
    }

    // Metodo
    public abstract Double adicionarForca();

    // Getters
    public String getNome() {
        return nome;
    }

    public Integer getForca() {
        return forca;
    }
}
