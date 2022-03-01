package sptech.com.br.estudocontinuada.entidade;

public class Pokemon {

    //Atributos
    private String nome;
    private String tipo;
    private double forca;
    private boolean capturado;

    //Construtor
    public Pokemon(String nome, String tipo, double forca, boolean capturado) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.capturado = capturado;
    }

    public Pokemon() {
    }

    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public boolean isCapturado() {
        return capturado;
    }

    public void setCapturado(boolean capturado) {
        this.capturado = capturado;
    }
}
