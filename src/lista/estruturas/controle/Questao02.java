package lista.estruturas.controle;

import java.util.Arrays;
import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int[] numeros = new int[10];

    System.out.println("Digite 10 números inteiros: ");

    for (int i = 0; i < 10; i++) {
      numeros[i] = leitor.nextInt();
    }

    System.out.println("Números: " + Arrays.toString(numeros));

    for (int i = 0; i < 10; i++) {
      if (numeros[i] % 2 == 0) {
        System.out.println(numeros[i] + " é um número par!");
      } else {
        System.out.println(numeros[i] + " é um número ímpar!");
      }
    }

    System.out.println("------- Fim -------");
  }
}
