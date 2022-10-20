package aula.exemplos;

public class Gerente extends Empregado{
    private float gratificacao;

    public Gerente() {
        System.out.println("Gerente");
    }

    public Gerente(String matricula, String nome, Float salario) {
        super(matricula, nome, salario);
        System.out.println("Gerente");
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }
}
