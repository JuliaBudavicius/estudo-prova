public class TesteAluno {
    public static void main(String[] args) {
        AlunoFundamental aluno1 = new AlunoFundamental(1145, "Carlinhos", 6.7, 8.5, 6.0, 7.3);
        AlunoGraduacao aluno2 = new AlunoGraduacao(2369, "Alice", 9.5, 8.5);
        AlunoPos aluno3 = new AlunoPos(4273, "Beatriz", 4.5, 6.5, 6.8);
        Escola alvorada = new Escola("Alvorada");

        alvorada.adicionaAluno(aluno1);
        alvorada.adicionaAluno(aluno2);
        alvorada.adicionaAluno(aluno3);

        //alvorada.exibeTodos();
        //alvorada.exibeAprovados();
        alvorada.buscaAluno(42763);
    }
}
