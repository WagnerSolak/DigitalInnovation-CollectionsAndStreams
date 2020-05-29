package one.digitalinnovation.list.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for(String nomesDaLista: nomes){
            System.out.println(nomesDaLista);
        }

        nomes.set(2, "Roberto");
        System.out.println(nomes);

        String posicao = nomes.get(1);
        System.out.println(posicao);

        nomes.remove(4);

        nomes.remove("João");

        System.out.println(nomes);

        int quantidade = nomes.size();
        System.out.println(quantidade);

        boolean temJuliano = nomes.contains("Juliano");
        System.out.println(temJuliano);

        nomes.add(4, "Ismael");
        nomes.add(5, "Rodrigo");

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println("Ordenado em ordem alfabética " +nomes);

        boolean estaVazia = nomes.isEmpty();
        System.out.println("A lista está vazia ? " +estaVazia);
    }

}
