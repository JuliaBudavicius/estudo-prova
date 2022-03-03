import java.util.ArrayList;

public class Escola {
    // Atributos
    String nome;
    ArrayList<Aluno> alunos;

    // Constructor
    public Escola(String nome) {
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    // Metodos
    public void adicionaAluno(Aluno a) {
        System.out.println("\n(!) Aluno adicionado com sucesso a Escola " + nome);
        alunos.add(a);
    }

    public void exibeTodos() {
        System.out.println("LISTA DE ALUNOS:");
        for (Aluno a : alunos) {
            System.out.println("\n" + a);
        }
    }

    public void exibeAlunosGraduacao() {
        System.out.println("ALUNOS GRADUAÇÃO");
        for (Aluno a : alunos) {
            if (a instanceof AlunoGraduacao) {
                System.out.println("\n" + a);
            }
        }
    }

    public void exibeAprovados() {
        System.out.println("ALUNOS APROVADOS");
        for (Aluno a : alunos) {
            if (a.calculaMedia() >= 6.0) {
                System.out.println("\n" + a);
            }
        }
    }

    public void buscaAluno(Integer ra) {
        Boolean alunoExistente = true;
        for (Aluno a : alunos) {
            if (a.getRa().equals(ra)) {
                System.out.println("\n" + a);
                alunoExistente = false;
            }
        }

        if(alunoExistente.equals(true)) {
            System.out.println("\n(!) Aluno não encontrado.");
        }
    }
}
