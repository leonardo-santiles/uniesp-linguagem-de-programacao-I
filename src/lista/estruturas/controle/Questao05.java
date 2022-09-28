package lista.estruturas.controle;

import java.util.Scanner;

public class Questao05 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite seu salário bruto: ");
    String salario = leitor.next();

    System.out.println("Digite o valor máximo da prestação: ");
    String prestacao = leitor.next();

    float percentual = Float.parseFloat(salario) * 0.30f;

    if (Float.parseFloat(prestacao) <= percentual){
      System.out.println("O empréstimo PODE ser concedido!");
    } else {
      System.out.println("O empréstimo NÃO PODE ser concedido!");
    }
  }
}
