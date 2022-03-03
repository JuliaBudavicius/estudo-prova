public class App {
    public static void main(String[] args) {
        ControleBonus controleBonus = new ControleBonus();
        Professor joao = new Professor("João", 7, 13.50);
        Coordenador marcio = new Coordenador("Marcio", 8, 26.50);
        Porteiro carlos = new Porteiro("Carlos", 12, 14.00);

        controleBonus.adicionaFuncionario(joao);
        controleBonus.adicionaFuncionario(marcio);
        controleBonus.adicionaFuncionario(carlos);

        controleBonus.exibeConteudo();

        System.out.printf("\nO Total do Bônus é de R$ %.2f", controleBonus.calculaTotalBonus());
    }
}
