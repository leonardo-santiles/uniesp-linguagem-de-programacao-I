package lista.estruturas.controle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CreditosGalacticos {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    BigDecimal CEM = new BigDecimal("100");

    System.out.println("Digite seus créditos: ");
    BigDecimal creditos = leitor.nextBigDecimal();

    System.out.println("Digite o percentual de aumento: ");
    String percentual = leitor.next();

    BigDecimal aumento = creditos.multiply(new BigDecimal(percentual)).divide(CEM);
    creditos = creditos.add(aumento).setScale(2, RoundingMode.HALF_UP);

    System.out.println("Seus créditos atualizados são: " + creditos);
  }
}
