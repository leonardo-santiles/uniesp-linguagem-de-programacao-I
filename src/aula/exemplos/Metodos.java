package aula.exemplos;

public class Metodos {

    public static void main(String[] args) {
        somar(4, 5);
        int resultado = somarValor(4, 5);
        System.out.println("Resultado: " + resultado);
    }

    static void somar(int a, int b) {
        int soma = a + b;
        System.out.println("Soma: " + soma);
    }

    static int somarValor(int a, int b) {
        int soma = a + b;
        return soma;
    }
}
