import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    //Atributo
    private List<Carro> loja = new ArrayList<>();
    private List<Carro> vendido = new ArrayList<>();

    //Contrutor
    public Concessionaria() {
        this.loja = loja;
        this.vendido = vendido;
    }

    //Métodos
    //Adicionar carro
    public void adicionaCarro(Carro a) {
        loja.add(a);
        System.out.println("Carro cadastrado com sucesso!!!");
    }

    //Vender carro
    public void venderCarro(Carro v) {
        vendido.add(v);
        loja.remove(v);
        System.out.println("Carro foi vendido, Parabens!!!");
    }

    //Exibir todos os carros da loja
    public void exibeLoja() {
        System.out.println("\nloja");
        for (Carro a : loja) {
            System.out.println(a);
        }
    }
/*
    Todo o método Double retorna algo
     v = objeto*
    Exibir lucro dos carros vendidos
 */

    public void lucroCarros() {
        Double lucroTotal = 0.0;
        for (Carro v : vendido) {
            lucroTotal += v.getValor();
        }
        System.out.printf("Lucro de todos os carros que foram vendidos %.2f\n", lucroTotal);
    }


    //Exibir carros vendidos
    public void exibeVendidos(){
        System.out.println("\nvendido");
        for (Carro v : vendido){
            System.out.println(v);
        }
    }

}
