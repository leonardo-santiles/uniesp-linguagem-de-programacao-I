package aula.exemplos;

import javax.swing.*;

public class UsaNomeIdade {

    public static void main(String[] args) {
        NomeIdade nomeIdade = new NomeIdade();

        nomeIdade.imprimeNomeIdade("Rodrigo Fujioka", 39);

        String mensagem = nomeIdade.imprimeMensagem("Rodrigo Fujioka", 39);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
