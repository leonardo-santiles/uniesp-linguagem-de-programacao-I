package lista.estruturas.controle;

import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int totalPacientes = 0;
        int somaIdadeHomens = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        int pacientesEntre18E25Anos = 0;
        int idadePacienteMaisVelho = 0;
        String nomePacienteMaisVelho = "";
        float alturaMulherMaisBaixa = 100.0f;
        String nomeMulherMaisBaixa = "";

        while(true) {
            System.out.println("Digite o nome do paciente ou \"fim\" para finalizar o programa: ");
            String nome = leitor.next();
            if (nome.equals("fim")) {
                break;
            }

            System.out.println("Digite o sexo do paciente (H ou M): ");
            String sexo = leitor.next();

            System.out.println("Digite o peso do paciente (Kg): ");
            float peso = leitor.nextFloat();

            System.out.println("Digite a idade do paciente: ");
            int idade = leitor.nextInt();

            System.out.println("Digite a altura do paciente (m): ");
            float altura = Float.parseFloat(leitor.next());

            totalPacientes++;

            if (sexo.equals("H")) {
                somaIdadeHomens += idade;
                totalHomens++;
            }

            if (sexo.equals("M")) {
                if (altura > 1.6 && altura < 1.7 && peso > 70.0) {
                    totalMulheres++;
                }

                if (altura < alturaMulherMaisBaixa) {
                    alturaMulherMaisBaixa = altura;
                    nomeMulherMaisBaixa = nome;
                }
            }

            if (idade > 18 && idade < 25) {
                pacientesEntre18E25Anos++;
            }

            if(idade > idadePacienteMaisVelho) {
                idadePacienteMaisVelho = idade;
                nomePacienteMaisVelho = nome;
            }
        }

        System.out.println("Total de pacientes: " + totalPacientes);
        System.out.println("Média de idade dos homens: " + somaIdadeHomens / totalHomens);
        System.out.println("Total de mulheres com altura entre 1,6 e 1,7 e peso acima de 70Kg: " + totalMulheres);
        System.out.println("Total de pacientes com idade entre 18 e 25 anos: " + pacientesEntre18E25Anos);
        System.out.println("Nome do paciente mais velho: " + nomePacienteMaisVelho);
        System.out.println("Mulher mais baixa: " + nomeMulherMaisBaixa);
    }
}
