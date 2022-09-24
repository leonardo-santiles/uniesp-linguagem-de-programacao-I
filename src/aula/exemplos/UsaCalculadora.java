package aula.exemplos;

import javax.swing.*;

public class UsaCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somar(5, 10);

        int resultado = calculadora.multiplicar(5, 10);
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
