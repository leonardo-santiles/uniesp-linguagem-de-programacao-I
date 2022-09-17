package aula.exemplos;

public class TiposDeDados {
    public static void main(String[] args) {
        boolean ehMesmoNumero = 2 == 2;

        if (ehMesmoNumero) {
            System.out.println("Numero igual");
        }

        int valorInteiro = 7;
        int outroValorInteiro = 9;
        valorInteiro = outroValorInteiro;

        short valorShort = 5000;
        valorInteiro = valorShort;
        valorInteiro = 1000000099;
        valorShort = (short) valorInteiro;
        System.out.println(valorShort);

        if (4 % 2 == 0) {
            System.out.println("Par");
        }

        valorShort = 5;
        valorInteiro = 10;
        System.out.println(valorInteiro + "5" + valorShort);

        double d = 8.898;
        double g = 7.77;
        double h = 8;

        d = g * (h / 3);
        System.out.println("d = " + d);

        if (valorShort == 4 || valorShort == 5) {
            System.out.println("Valor short eh 4 ou 5");
        }

        valorShort = 10;
        switch (valorShort) {
            case 10:
                System.out.println("Valor = 10");
                break;
            case 5:
                System.out.println("Valor = 5");
                break;
            default:
                System.out.println("Valor nao encontrado");
        }

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(contador);
        }
    }
}
