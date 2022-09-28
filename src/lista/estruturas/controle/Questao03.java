package lista.estruturas.controle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Questao03 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    BigDecimal PERCENTUAL = new BigDecimal("0.2");
    BigDecimal QUINHENTOS =  new BigDecimal("500");

    while(true) {
      System.out.println("Digite seu nome ou \"fim\" para finalizar o programa: ");

      String nome = leitor.next();
      if (nome.equals("fim")) {
        break;
      }

      System.out.println("Digite seu salário: ");
      String s = leitor.next();
      BigDecimal salario = new BigDecimal(s);

      if (salario.compareTo(QUINHENTOS) < 0) {
        BigDecimal aumento = salario.multiply(PERCENTUAL);
        salario = salario.add(aumento).setScale(2, RoundingMode.HALF_UP);
        System.out.println(nome + ", seu salário ajustado é: " + salario);
      } else {
        System.out.println(nome + ", você não tem direito ao aumento!");
      }
    }
  }
}
