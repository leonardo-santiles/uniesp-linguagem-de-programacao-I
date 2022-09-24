package aula.exemplos;

public class Calculadora {

    public void somar(int valorA, int valorB) {
        int soma = valorA + valorB;
        System.out.println("Soma: " + soma);
    }

    public int multiplicar(int valorA, int valorB) {
        return (valorA * valorB);
    }

    public void subtrair(int valorA, int valorB) {
        int subtracao = valorA - valorB;
        System.out.println("Subtração: " + subtracao);
    }

    public int dividir(int valorA, int valorB) {
        return (valorA / valorB);
    }
}
