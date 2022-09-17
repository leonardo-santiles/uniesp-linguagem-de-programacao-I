package lista.metodos;

public class EmprestimoTeste {
  public static void main(String[] args) {
    Emprestimo emprestimo1 = new Emprestimo("João Silva", "21", "200.00", "20", "18");
    emprestimo1.imprimir();
    emprestimo1.calcularEmprestimo();

    Emprestimo emprestimo2 = new Emprestimo("Maria Sousa", "30", "150.50", "30", "25");
    emprestimo2.imprimir();
    emprestimo2.calcularEmprestimo();
  }
}
