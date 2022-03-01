package sptech.com.br.estudocontinuada.entidade;

public class Linha {

    //    atributos
    private String nome;
    private String nomeVolta;
    private Double extensao;
    private Integer veiculos;
    private Boolean funcional24h;

//    Métodos

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVolta() {
        return nomeVolta;
    }

    public void setNomeVolta(String nomeVolta) {
        this.nomeVolta = nomeVolta;
    }

    public Double getExtensao() {
        return extensao;
    }

    public void setExtensao(Double extensao) {
        this.extensao = extensao;
    }

    public Integer getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Integer veiculos) {
        this.veiculos = veiculos;
    }

    public Boolean getFuncional24h() {
        return funcional24h;
    }

    public void setFuncional24h(Boolean funcional24h) {
        this.funcional24h = funcional24h;
    }
}


