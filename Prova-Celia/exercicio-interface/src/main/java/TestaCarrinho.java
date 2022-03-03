import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNl = new Scanner(System.in);
        Integer menu = 0;

        Integer codigo, quantHoras;
        Double precoCusto, valorHora;
        String nome, autor, isbn, gravadora, descricao;

        do {
            System.out.println("\nEscolha uma opção abaixo:" +
                    "\n1. Adicionar Livro" +
                    "\n2. Adicionar DVD" +
                    "\n3. Adicionar Serviço" +
                    "\n4. Exibir Itens do Carrinho" +
                    "\n5. Exibir Total de Vendas" +
                    "\n6. Fim");
            menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("\nInsira o código do livro:");
                    codigo = scanner.nextInt();
                    System.out.println("\nInsira o preço de custo:");
                    precoCusto = scanner.nextDouble();
                    System.out.println("\nInsira o nome do livro:");
                    nome = scannerNl.nextLine();
                    System.out.println("\nInsira o nome do autor:");
                    autor = scannerNl.nextLine();
                    System.out.println("\nInsira o ISBN:");
                    isbn = scannerNl.nextLine();

                    Livro livro1 = new Livro(codigo, precoCusto, nome, autor, isbn);
                    carrinho.adicionaVendavel(livro1);
                    break;

                case 2:
                    System.out.println("\nInsira o código do dvd:");
                    codigo = scanner.nextInt();
                    System.out.println("\nInsira o preço de custo:");
                    precoCusto = scanner.nextDouble();
                    System.out.println("\nInsira o nome do dvd:");
                    nome = scannerNl.nextLine();
                    System.out.println("\nInsira o nome da gravadora:");
                    gravadora = scannerNl.nextLine();

                    DVD dvd1 = new DVD(codigo, precoCusto, nome, gravadora);
                    carrinho.adicionaVendavel(dvd1);
                    break;

                case 3:
                    System.out.println("\nInsira a descrição:");
                    descricao = scannerNl.nextLine();
                    System.out.println("\nInsira o código:");
                    codigo = scanner.nextInt();
                    System.out.println("\nInsira a quantidade de horas:");
                    quantHoras = scanner.nextInt();
                    System.out.println("\nInsira o valor hora:");
                    valorHora = scanner.nextDouble();

                    Servico servico1 = new Servico(descricao, codigo, quantHoras, valorHora);
                    carrinho.adicionaVendavel(servico1);
                    break;

                case 4:
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    System.out.printf("Total de venda: R$ %.2f", carrinho.calculaTotalVenda());
                    break;

                case 6:
                    System.out.println("Até a proxima!");
                    break;

                default:
                    break;
            }
        } while (menu < 6 && menu > 0);
    }
}
