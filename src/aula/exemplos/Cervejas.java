package aula.exemplos;

public class Cervejas {
  public static void main(String[] args) {
    int cervejas = 99;
    while (cervejas > 0) {
      System.out.println(cervejas + " cervejas no freezer.");
      System.out.println("Pego uma garrafa, passo pra frente.");
      cervejas = cervejas - 1;
      System.out.printf("Agora são " + cervejas + " cervejas no freezer.\n");
      System.out.println("---------------------------------");
    }
    System.out.println("As cervejas acabaram :(");
  }
}
