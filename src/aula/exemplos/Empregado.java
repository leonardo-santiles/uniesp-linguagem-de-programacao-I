package aula.exemplos;

public class Empregado {
    private String matricula;
    private String nome;
    private Float salario;

    public Empregado() {
        this("123", "Fujioka", 123f);
        System.out.println("Empregado");
    }

    public Empregado(String matricula, String nome, Float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
