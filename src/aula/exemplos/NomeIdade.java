package aula.exemplos;

public class NomeIdade {

    void imprimeNomeIdade(String nome, int idade) {
        String mensagem = "Nome: " + nome;
        mensagem += "\nIdade: " + idade;

        if (idade > 18) {
            mensagem += "\nPode assistir filme de terror";
        } else {
            mensagem += "\nNão pode assistir filme de terror";
        }

        System.out.println(mensagem);
    }

    public String imprimeMensagem (String nome, int idade) {
        String mensagem = "Nome: " + nome;
        mensagem += "\nIdade: " + idade;

        if (idade > 18) {
            mensagem += "\nPode assistir filme de terror";
        } else {
            mensagem += "\nNão pode assistir filme de terror";
        }

        return mensagem;
    }
}
