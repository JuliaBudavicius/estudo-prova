import java.util.ArrayList;
import java.util.List;

public class Escola {

    //Atributos
    private String nome;
    List<Aluno> alunos = new ArrayList<>();

    //Construtor
    public Escola(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }


    //Métodos

    //Método adicionar Aluno
    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    //Método de exibir todos os alunos
    public void exibeTodos() {
        System.out.println("\nExibindo todos os alunos:");
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    //Método que exibe alunos graduação
    public void exibeAlunosGraduação() {
        System.out.println("\nLista de Alunos Graduação:");
        for (Aluno a : alunos) {
            if (a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    //Método que exibe todos os aprovados
    public void alunosAprovados() {
        for (Aluno a : alunos) {
            if (a.calcMedia() >= 6) {
                System.out.println("\nEsses são os alunos aprovados:");
                System.out.println(a);
            }
        }
    }

    //Método que busca aluno pelo ra
    public void buscaAluno(Integer ra) {
        System.out.println("Buscando o aluno pelo RA:");
        Boolean existe = false;
        for (Aluno a : alunos) {
            if (a.getRa().equals(ra)) {
                System.out.println(a);
                existe = true;
            }
        }
        if (existe.equals(false)) {
            System.out.println("Aluno não cadastrado");

        }
    }
}
