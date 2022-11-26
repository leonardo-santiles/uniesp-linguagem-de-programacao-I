package aula.exemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InformaNumero {

    public static void main(String[] args) {

        int numero = 0;

        while (true) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Informe um número: ");
            System.out.println("Digite 100 para sair");

            try {
                numero = leitor.nextInt();
            } catch (Exception e) {
                System.out.println("Você errou");
            }

            System.out.println("Número: " + numero);
        }
    }
}
