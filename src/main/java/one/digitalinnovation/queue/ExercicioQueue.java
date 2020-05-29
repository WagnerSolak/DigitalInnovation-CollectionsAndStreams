package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");


        for (String nomesDaLista: nomes){
            System.out.println(nomesDaLista);
        }

        String retornandoPrimeiroDaFila = nomes.peek();
        System.out.println(retornandoPrimeiroDaFila);

        String retornandoPrimeiraDaListaRemovendo = nomes.poll();
        System.out.println(retornandoPrimeiraDaListaRemovendo);

        nomes.add("Daniel");
        System.out.println(nomes);

        int tamanho = nomes.size();
        System.out.println("O tamanho da fila eh: " +tamanho);

        boolean estaVazia = nomes.isEmpty();
        System.out.println(estaVazia);

        System.out.println(nomes);
        boolean temCarlos = nomes.contains("Carlos");
        System.out.println(temCarlos);
    }
}
