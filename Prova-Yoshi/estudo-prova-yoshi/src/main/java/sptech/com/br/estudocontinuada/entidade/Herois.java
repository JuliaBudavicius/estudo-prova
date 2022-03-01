package sptech.com.br.estudocontinuada.entidade;

public class Herois {

    //Atributos
    private String nome;
    private int forca;
    private double popularidade;
    private String classe;
    private boolean aposentado;

    //Contrutor
    public Herois(String nome, int forca, double popularidade, String classe, boolean aposentado) {
        this.nome = nome;
        this.forca = forca;
        this.popularidade = popularidade;
        this.classe = classe;
        this.aposentado = aposentado;
    }

    public Herois() {
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public double getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(double popularidade) {
        this.popularidade = popularidade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isAposentado() {
        return aposentado;
    }

    public void setAposentado(boolean aposentado) {
        this.aposentado = aposentado;
    }
}
