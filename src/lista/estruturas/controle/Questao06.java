package lista.estruturas.controle;

import java.util.Scanner;

public class Questao06 {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int contador = 1;
    int aprovados = 0;
    int reprovados = 0;
    int exame = 0;
    float somaClasse = 0;

    while(contador <= 6) {
      System.out.println("-----------------------------------");
      System.out.println("Aluno: " + contador);

      System.out.println("Digite a primeira nota: ");
      String nota1 = leitor.next();

      System.out.println("Digite a segunda nota: ");
      String nota2 = leitor.next();

      float mediaAluno = (Float.parseFloat(nota1) + Float.parseFloat(nota2)) / 2;
      System.out.println("Média do Aluno " + contador + ": " + String.format("%.2f", mediaAluno));
      somaClasse += mediaAluno;

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
    float mediaClasse = somaClasse / 6;
    System.out.println("Média da classe: " + String.format("%.2f", mediaClasse));
  }
}
