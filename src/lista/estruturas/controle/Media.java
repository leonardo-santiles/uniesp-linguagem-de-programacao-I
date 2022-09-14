package lista.estruturas.controle;

import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int contador = 1;
    int aprovados = 0;
    int reprovados = 0;
    int exame = 0;
    float soma = 0;

    while(contador <= 1) {
      System.out.println("-----------------------------------");
      System.out.println("Aluno: " + contador);

      System.out.println("Digite a primeira nota: ");
      String nota1 = leitor.next();

      System.out.println("Digite a segunda nota: ");
      String nota2 = leitor.next();

      float mediaAluno = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;
      System.out.println("Média do aluno " + contador + ": " + String.format("%.2f", mediaAluno));
      soma += mediaAluno;

      if (mediaAluno < 3.0) {
        reprovados++;
        System.out.println("Reprovado");
      }

      if (mediaAluno >= 3.0 && mediaAluno <= 7.0) {
        exame++;
        System.out.println("Exame");
      }

      if (mediaAluno > 7.0){
        aprovados++;
        System.out.println("Aprovado");
      }

      System.out.println("-----------------------------------");

      contador++;
    }
    System.out.println("Total de alunos aprovados: " + aprovados);
    System.out.println("Total de alunos de exame: " + exame);
    System.out.println("Total de alunos reprovados: " + reprovados);
    float mediaClasse = soma / 6;
    System.out.println("Média da classe: " + String.format("%.2f", mediaClasse));
  }
}
