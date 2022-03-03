public abstract class Carro {

    //Atributos
    private String nome;
    private String placa;
    private Boolean usado;
    private String marca;
    private Double valor;
    private String tipo;

    //Construtor
    public Carro(String nome, String placa, Boolean usado, String marca, Double valor, String tipo) {
        this.nome = nome;
        this.placa = placa;
        this.usado = usado;
        this.marca = marca;
        this.valor = valor;
        this.tipo = tipo;
    }

    //Método
    public abstract Double getValorIPVA();

    //toString
    @Override
    public String toString() {
        return String.format(
                "Carro{" +
                        "\nnome='" + nome +
                        "\nplaca='" + placa +
                        "\nusado=" + usado +
                        "\nmarca='" + marca +
                        "\nvalor=" + valor +
                        "\ntipo='" + tipo +
                        '}'
        );
    }


    //Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getUsado() {
        return usado;
    }

    public void setUsado(Boolean usado) {
        this.usado = usado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

