package lista.metodos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Emprestimo {

  private String nomeUsuario;

  private String idade;

  private String valorEmprestimo;

  private String percentualJurosMes;

  private String mesesParaPagar;

  public void imprimir() {
    String s = "Emprestimo{"
        + "nomeUsuario='" + this.nomeUsuario + "', "
        + "idade='" + this.idade + "', "
        + "valorEmprestimo='" + this.valorEmprestimo + "', "
        + "percentualJurosMes='" + this.percentualJurosMes + "', "
        + "mesesParaPagar='" + this.mesesParaPagar + "'"
        + "}";

    System.out.println(s);
  }

  Emprestimo(String nomeUsuario, String idade, String valorEmprestimo,
             String percentualJurosMes, String mesesParaPagar) {
    this.nomeUsuario = nomeUsuario;
    this.idade = idade;
    this.valorEmprestimo = valorEmprestimo;
    this.percentualJurosMes = percentualJurosMes;
    this.mesesParaPagar = mesesParaPagar;
  }

  public void calcularEmprestimo() {
    BigDecimal DEZ = new BigDecimal("10");
    BigDecimal CEM = new BigDecimal("100");
    BigDecimal valorEmprestimo = new BigDecimal(this.valorEmprestimo);

    int idade = Integer.parseInt(this.idade);
    if (idade >= 18 && idade < 23) {
      BigDecimal mesesParaPagar = new BigDecimal(this.mesesParaPagar);

      BigDecimal percentualJurosMes = new BigDecimal(this.percentualJurosMes)
          .divide(CEM, 2, RoundingMode.HALF_UP);

      BigDecimal parcela = valorEmprestimo.multiply(percentualJurosMes)
          .divide(mesesParaPagar, 2, RoundingMode.HALF_UP);

      this.valorEmprestimo = valorEmprestimo.add(parcela).toString();
    }

    if (idade > 23 && idade <= 33) {
      BigDecimal valor = valorEmprestimo.multiply(DEZ).divide(CEM, 2, RoundingMode.HALF_UP);

      this.valorEmprestimo = valorEmprestimo.add(valor).toString();
    }

    System.out.println("Valor do empréstimo: " + this.valorEmprestimo.toString());
  }
}
