package aula.exemplos;

public class Aluno {
    public static int mediaAprovacao = 7;
    private int notaUm;
    private int notaDois;

    public Aluno() {
    }

    public Aluno(int notaUm, int notaDois) {
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    public int getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(int notaUm) {
        this.notaUm = notaUm;
    }

    public int getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(int notaDois) {
        this.notaDois = notaDois;
    }

    public static void exibirMediaAprovacao() {
        System.out.println(mediaAprovacao);
    }
}
