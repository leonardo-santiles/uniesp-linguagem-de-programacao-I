package lista.estruturas.controle;

import java.util.Scanner;

public class LinhaCredito {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float TRINTA_POR_CENTO = 0.30f;

    System.out.println("Digite seu salário: ");
    String salario = leitor.next();

    System.out.println("Digite o valor da prestação: ");
    String parcela = leitor.next();

    float percentual = Float.parseFloat(parcela) / Float.parseFloat(salario);
    if (percentual <= TRINTA_POR_CENTO){
      System.out.println("O empréstimo PODE ser concedido!");
    } else {
      System.out.println("O empréstimo NÃO PODE ser concedido!");
    }
  }
}
