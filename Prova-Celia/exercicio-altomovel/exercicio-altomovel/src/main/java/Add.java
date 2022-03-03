public class Add {
    public static void main(String[] args) {

        //Criar carros
        Carro h = new Hatch("HB20", "JU17", true, "Hyundai", 80000.0, "Hatch");
        Carro z = new SUV("HyLux", "ZF29", true, "Toyota", 200000.0, "SUV");
        Carro v = new Conversivel("Velar", "KN12", false, "BMW", 500000.0, "Conversivel");

        //Criando concessionaria
        Concessionaria c = new Concessionaria();


        //Adicionar carro na concessionaria
        c.adicionaCarro(h);
        c.adicionaCarro(z);
        c.adicionaCarro(v);

        //Exibir os carros da concessionaroa
        c.exibeLoja();

        //Vender um carro
        c.venderCarro(z);

        //Exibir carros vendidos
        c.exibeVendidos();

        //Exibir lucro dos carros vendidos
        c.lucroCarros();
        





    }
}
