package aula.exemplos;

import java.util.Scanner;

public class Condicoes {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um número: ");
    int z = leitor.nextInt();

    if (z == 10) {
      System.out.println("z é igual a 10 :))");
    } else {
      System.out.println("z não é igual a 10 :((");
    }
    System.out.println("e isso é enrolação");
  }
}
