package lista.estruturas.controle;

import java.util.Scanner;

public class DiariaPousada {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float totalPousada = 0;
    float contaHospede;

    while (true) {
      System.out.println("Digite seu nome ou \"fim\" para finalizar o programa: ");

      String nome = leitor.next();
      if (nome.equals("fim")) {
        break;
      }

      System.out.println("Quantos dias ficará hospedado(a)? ");
      int dias = leitor.nextInt();

      if (dias < 10) {
        contaHospede = 40 + dias * 15;
      } else {
        contaHospede = 40 + dias * 8;
      }

      totalPousada += contaHospede;


      System.out.println("-----------------------------------");
      System.out.println("Hospede: " + nome);
      System.out.println("Conta: " + String.format("%.2f", contaHospede));
      System.out.println("-----------------------------------");
    }

    System.out.println("Total arrecadado pela pousada: " + String.format("%.2f", totalPousada));
    System.out.println("------ Fim ------");
  }
}
