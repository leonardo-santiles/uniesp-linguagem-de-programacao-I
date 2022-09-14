package lista.estruturas.controle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ContaPostoGasolina {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    BigDecimal GASOLINA = new BigDecimal("2.50");
    BigDecimal REFRIGERANTE = new BigDecimal("3.00");

    System.out.println("Digite a quantidade de refrigerantes: ");
    String refrigerantes = leitor.next();

    System.out.println("Digite a quantidade de litros abastecidos");
    String litros = leitor.next();

    BigDecimal custoRefrigerante = REFRIGERANTE.multiply(new BigDecimal(refrigerantes));
    BigDecimal custoGasolina = GASOLINA.multiply(new BigDecimal(litros));
    BigDecimal conta = custoRefrigerante.add(custoGasolina).setScale(2, RoundingMode.HALF_UP);

    System.out.println("Valor da conta final: " + conta);
  }
}
