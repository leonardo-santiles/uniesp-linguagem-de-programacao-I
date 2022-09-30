package aula.exemplos;

public class UsaCliente {

    public static void main(String[] args) {
        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo");
        rodrigo.setIdade(39);
        rodrigo.setEndereco("Rua X");
        rodrigo.anoNascimento = -122;
        System.out.println(rodrigo.getIdade());

        Cliente joao = new Cliente("João", "Rua X", 19);
        System.out.println(joao.getEndereco());
    }
}
