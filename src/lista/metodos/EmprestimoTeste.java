package lista.metodos;

public class EmprestimoTeste {
  public static void main(String[] args) {
    Emprestimo emprestimo = new Emprestimo("João Silva", "21", "200.00", "20", "18");
    emprestimo.imprimir();
    emprestimo.calcularEmprestimo();
  }
}
