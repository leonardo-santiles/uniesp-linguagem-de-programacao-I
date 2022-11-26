package aula.exemplos;

public class Covid {

    public void tossir() throws Exception {
        System.out.println("Cof Cof Cof");
        throw new Exception("Error Inesperado");
    }

    public void curar() {
        System.out.println("Curado da covid");
    }
}
