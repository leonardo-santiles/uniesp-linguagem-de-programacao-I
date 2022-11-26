package aula.exemplos;

import java.util.*;

public class ListasArrays {
    public static void main(String[] args) {
        int[] lista = new int[10];
        String[] listaString = new String[10];
        Covid[] variantes = new Covid[10];

        lista[2] = 15;
        int valor = lista[2];

        variantes[0] = new Covid();
        Covid variante = variantes[0];
        variante.curar();
        variantes[0].curar();

        System.out.println("Tamanho: " + listaString.length);


        int[] listaOrdenada = {8, 4, 2, 4, 5, 9, 1};
        System.out.println(Arrays.toString(listaOrdenada));
        Arrays.sort(listaOrdenada);
        System.out.println(Arrays.toString(listaOrdenada));

        Arrays.fill(lista, 10);
        System.out.println(Arrays.toString(lista));


        List<String> colecaoString = new ArrayList<>();
        colecaoString.add("Rodrigo");
        colecaoString.add("Thiago");
        colecaoString.add("Larissa");
        colecaoString.add("Rafaela");
        colecaoString.remove("Rafaela");
        Boolean existe = colecaoString.contains("Rafaela");
        System.out.println(existe);


        for(String nome: colecaoString) {
            System.out.println(nome);
        }

        Set<String> listaSet = new HashSet<>(); //Não permite duplicações
        //Set<String> listaSet = new TreeSet<>(); //Já armazena em ordem alfabética
        listaSet.add("Rodrigo");
        listaSet.add("Rodrigo");
        listaSet.add("Thiago");

        for(String nome: listaSet) {
            System.out.println(nome);
        }


        Map<String, String> mapa = new HashMap<>();
        mapa.put("professor", "Fujioka");
        mapa.put("Java", "Não presta");
        mapa.put("Dinheiro", "É bom");

        String professor = mapa.get("professor");
        System.out.println(professor);
    }
}
