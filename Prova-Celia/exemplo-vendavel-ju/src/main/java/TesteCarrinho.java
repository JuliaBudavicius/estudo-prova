import java.util.ArrayList;
import java.util.Scanner;

public class TesteCarrinho {
    public static void main(String[] args) {

        //Servico c = new Servico("Cabeleireira", 1723, 100, 20.0);
        //Livro p = new Livro(1501, 20.0, "O Pequeno Principe", "Maria Helena", "não sei kk");
        //DVD b = new DVD(1024, 50.0, "The Beatles", "Mundial");


        Carrinho c = new Carrinho();
        //Se der erro, verificar se tem algo no construtor


        Integer opcoes = 0;
        //Leitor para números
        Scanner leitorN = new Scanner(System.in);

        //Leitor para letras
        Scanner leitorL = new Scanner(System.in);

        Boolean repetir = true;
        while (repetir) {
            System.out.println("Qual opção você escolhe?\n");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Servico");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir total de venda");
            System.out.println("6. FIM");
            opcoes = leitorN.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Qual o código do livro ?");
                    Integer codigoLivro = leitorN.nextInt();
                    System.out.println("Qual o preço de custo ?");
                    Double precoLivro = leitorN.nextDouble();
                    System.out.println("Qual o nome do livro ?");
                    String nomeLivro = leitorL.nextLine();
                    System.out.println("Qual a autora do livro?");
                    String autora = leitorL.nextLine();
                    System.out.println("Qual o isbn ?");
                    String isbn = leitorL.nextLine();

                    Livro l = new Livro(codigoLivro, precoLivro, nomeLivro, autora, isbn);
                    c.adicionaVendavel(l);
                    break;
                case 2:
                    System.out.println("Qual o código do DVD ?");
                    Integer codigoDVD = leitorN.nextInt();
                    System.out.println("Qual o preço de custo ?");
                    Double precoDVD = leitorN.nextDouble();
                    System.out.println("Qual o nome do DVD ?");
                    String nomeDVD = leitorL.nextLine();
                    System.out.println("Qual é a gravadora ?");
                    String gravadora = leitorL.nextLine();

                    DVD d = new DVD(codigoDVD, precoDVD, nomeDVD, gravadora);
                    c.adicionaVendavel(d);
                    break;
                case 3:
                    System.out.println("Qual o serviço ?");
                    String servico = leitorL.nextLine();
                    System.out.println("Qual o código ?");
                    Integer codigoServico = leitorN.nextInt();
                    System.out.println("Qual é a quantidade de horas?");
                    Integer qtdHoras = leitorN.nextInt();
                    System.out.println("Quanto custa a hora?");
                    Double precoHora = leitorN.nextDouble();

                    Servico s = new Servico(servico, codigoServico, qtdHoras, precoHora);
                    c.adicionaVendavel(s);
                    break;
                case 4:
                    System.out.println("Seu Carrinho: \n");
                    c.exibeCarrinho();
                    break;
                case 5:
                    //printf é um string.format, mas ele não quebra linha
                    System.out.printf("\nO total da compra é de: \n %.2f \n\n", c.calculaTotalVenda());
                    break;
                case 6:
                    repetir = false;
                    c.exibeCarrinho();
                    c.calculaTotalVenda();
                    System.out.println("Obrigada pela compra!!!");
                    break;
                default:
                    repetir = false;
                    System.out.println("Opção inválida");
                    break;
            }

        }
    }
}
