public class TesteAluno {
    public static void main(String[] args) {

        //Alunos
        AlunoFundamental j = new AlunoFundamental(1234,"Júlia",10.0,9.5,9.0,10.0);
        AlunoGraduacao r = new AlunoGraduacao(4321,"Renato", 4.0,5.5);
        AlunoPos z = new AlunoPos(0121, "Zilda", 6.0,7.5,8.0);

        //Escola
        Escola b = new Escola("Bandeirantes");

        //Adicionar alunos na escola
        b.adicionarAluno(j);
        b.adicionarAluno(r);
        b.adicionarAluno(z);

        //Exibir todos os alunos
        b.exibeTodos();

        //Exibir alunos graduação
        b.exibeAlunosGraduação();

        //Exibir alunos aprovados
        b.alunosAprovados();

        //Buscar alunos pelo RA
        b.buscaAluno(1234);
    }
}
