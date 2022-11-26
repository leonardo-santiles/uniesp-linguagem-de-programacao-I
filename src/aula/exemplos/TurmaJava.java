package aula.exemplos;

public class TurmaJava {

    public static void main(String[] args) {

        Covid doenca = new Covid();
        doenca.curar();

        try {
            doenca.tossir();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
