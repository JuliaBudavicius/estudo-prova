public  class Servico implements Vendavel{

    //Atributos
    private String descricao;
    private int codigo;
    private int quantHoras;
    private double valorHora;

    //Construtor
    public Servico(String descricao, int codigo, int quantHoras, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    //Métodos
    public double getValorVenda(){
        return quantHoras * valorHora;
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "Descrição: %s" +
                "Código: %d" +
                "Quantidade de horas: %d" +
                "Valor da hora: %.2f" +
                "Valor da venda: %.2f"
                , descricao, codigo, quantHoras, valorHora, getValorVenda()
        );
    }

    //Getter and Setter
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
}
