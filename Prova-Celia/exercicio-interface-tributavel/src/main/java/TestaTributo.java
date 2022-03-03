public class TestaTributo {
    public static void main(String[] args) {
        Alimento banana = new Alimento(10, "Banana nanica", 3.50, 100);
        Alimento acai = new Alimento(10, "Açai Natural da terra", 53.50, 300);

        Perfume oneMillion = new Perfume(51, "One Million", 400.00, "Amadeirado Especiado" );
        Perfume invictus = new Perfume(52, "Invictus", 996.20, "Frescor colossal" );

        Servico internet = new Servico("Internet Vivo", 200.00);

        Tributo tributo = new Tributo();

        tributo.adicionaTributavel(banana);
        tributo.adicionaTributavel(acai);
        tributo.adicionaTributavel(oneMillion);
        tributo.adicionaTributavel(invictus);
        tributo.adicionaTributavel(internet);

        System.out.printf("\nTotal Tributos: R$ %.2f", tributo.calculaTributoTotal());

    }
}
