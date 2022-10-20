package aula.exemplos;

public class UsaAluno {
    public static void main(String[] args) {
        Aluno geraldo = new Aluno();
        geraldo.setNotaUm(10);
        geraldo.setNotaDois(2);
        System.out.println(geraldo.mediaAprovacao);

        Aluno francismo = new Aluno(7, 9);
        francismo.mediaAprovacao = 11;

        Aluno.exibirMediaAprovacao();
    }
}
