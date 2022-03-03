public class App {
    public static void main(String[] args) {
        Marvel thanos = new Marvel("Thanos", 6000, "Homem de Ferro", "Titan", 4);
        Dc darkside = new Dc("Darkside", 6000, "Superman", "Apokalipse", 5);
        ControleVilao controleVilao = new ControleVilao();

        controleVilao.adicionaVilao(thanos);
        controleVilao.adicionaVilao(darkside);
        controleVilao.exibeConteudo();

        System.out.printf("\nForça Total: %.1f", controleVilao.calculaTotalForca());

    }
}
