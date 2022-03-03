public class App {
    public static void main(String[] args) {
        Professor cesar = new Professor("Cesar", 7, 15.90);
        Professor juliana = new Coordenador("Juliana", 4, 15.90,
                5,
                28.90);
        ControleBonus bonus = new ControleBonus();

        bonus.adicionaProfessor(cesar);
        bonus.adicionaProfessor(juliana);

        bonus.exibeConteudo();

        System.out.printf("\nValor total: R$ %.2f", bonus.calculaBonus());
    }
}
